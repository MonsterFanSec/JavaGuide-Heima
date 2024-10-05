package mySet.HashSet;

/*
 * HashSet底层原理：
 * 	- HashSet集合底层采取哈希表存储数据
 * 	- 哈希表是一种对于增删改查数据性能都较好的结构
 *
 * 哈希表组成：
 * 	- JDK8以前：数组 + 链表
 *  - JDK8以后：数组 + 链表 + 红黑树
 *
 * 哈希值：对象的整数表现形式
 *  - 根据hashCode方法算出来的int类型的整数
 *  - 该方法定义在Object类中，所有的对象都可以调用，默认使用地址值进行计算
 *  - 一般情况下，会重写hashCode方法，利用对象内部的属性值计算哈希值
 *
 * 对象的哈希值特点：
 * 	1. 如果没有重写hashCode方法，不同对象计算出的哈希值是不同的
 * 	2. 如果已经重写hashcode方法，不同的对象只要属性值相同，计算出的哈希值就是一样的
 * 	3. 但是在小部分情况下，不同的属性值或者不同的地址值计算出来的哈希值也有可能一样。（哈希碰撞）
 *
 * HashSet底层原理：
 * 	1.创建一个默认长度16，默认加载因子0.75的数组，数组名table
 * 	2.根据元素的哈希值根数组的长度计算出对应存入的位置
 * 	3.判断当前位置是否为null，如果是null直接存入
 * 	4.如果位置不为null，表示有元素，则调用equals方法比较属性值
 * 	5.一样：不存		不一样：存入数组，形成链表
 * 	6.JDK8以前：新元素存入数组，老元素挂在新元素下面
 * 	  JDK8以后：新元素直接挂在老元素下面
 * 	7.JDK8以后，当链表长度超过8，并且数组长度大于等于64时，自动转化为红黑树
 * 	8.如果集合中存储的是自定义对象，必须要重写hashCode和equals方法；
 * 		重写hashCode：根据属性值去计算hash值
 * 		重写equals：为了比较hashCode时，比的也是对象内部的属性值
 *
 * HashSet的三个问题？
 * 	问题1:HashSet为什么存和取顺序不一样？
 * 		遍历时是从0开始遍历链表的，无法保证找到的第一个索引下的链表就是存入的第一个数据。
 * 	问题2:HashSet为什么没有索引？
 * 		HashSet是由“数组 + 链表 + 红黑树”组成的，比如要将数组设置索引值，那会导致该索引下的链表都是相同的索引；所以干脆取消了HashSet索引机制
 * 	问题3:HashSet是利用什么机制来保证数据去重的
 * 		利用两个方法：HashCode方法和equals方法
 * 			HashCode方法可以确定Hash值，而Hash值可以确定当前元素添加在数组的哪个位置；
 * 			然后再去调用equals方法，比较对象内部的属性值是不是相同
 */
public class A02_HashSetDemo1 {
	public static void main(String[] args) {
		// 1.创建对象
		Student s1 = new Student("zhangsan", 23);
		Student s2 = new Student("zhangsan", 23);

		// 2.如果没有重写hashCode方法，不同对象计算出的哈希值是不同的
		// 如果已经重写hashcode方法，不同的对象只要属性值相同，计算出的哈希值就是一样的
		System.out.println(s1.hashCode()); // 2055281021
		System.out.println(s2.hashCode()); // 1554547125


		// 在小部分情况下，不同的属性值或者不同的地址值计算出来的哈希值也有可能一样。（哈希碰撞）
		System.out.println("abc".hashCode()); // 96354
		System.out.println("acD".hashCode()); // 96354
	}
}
