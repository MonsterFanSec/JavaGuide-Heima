package mySet.HashSet;

import java.util.LinkedHashSet;

/*
 * LinkedHashSet底层原理：
 * 	- 有序、不重复、无索引。
 * 	- 这里的有序指的是保证存储和取出的元素顺序一致。
 * 	- 原理：底层数据结构是依然哈希表，只是每个元素又额外的多了一个双链表的机制记录存储的顺序。
 *
 * 	遍历的时候是通过双向链表的顺序开始遍历的，因此LinkedHashSet可以做到有序。
 *
 * 总结：
 * 	1.LinkedHashSet集合的特点和原理是怎么样的？
 * 		- 有序、不重复、无索引。
 * 		- 底层基于哈希表，使用双链表记录添加顺序。
 *  2.在以后如果要数据去重，我们使用哪个？
 * 		默认使用HashSet
 * 		如果要求去重且存取有序，才使用LinkedHashSet（因为LinkedHashSet有序，有更多的消耗，所以在没有必须有序的情况下，我们默认使用HashSet）
 */
public class A04_LinkedHashSetDemo {
	public static void main(String[] args) {
		// 1.创建4个学生对象
		Student s1 = new Student("zhangsan", 23);
		Student s2 = new Student("lisi", 24);
		Student s3 = new Student("wangwu", 25);
		Student s4 = new Student("zhangsan", 23);

		// 2.创建集合的对象
		LinkedHashSet<Student> lhs = new LinkedHashSet<>();

		// 3.添加元素
		System.out.println(lhs.add(s3));
		System.out.println(lhs.add(s2));
		System.out.println(lhs.add(s1));
		System.out.println(lhs.add(s4));

		// 4.打印集合
		System.out.println(lhs);
	}
}
