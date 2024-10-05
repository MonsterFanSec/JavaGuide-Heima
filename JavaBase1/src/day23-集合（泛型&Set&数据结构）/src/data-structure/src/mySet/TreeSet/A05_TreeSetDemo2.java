package mySet.TreeSet;

import java.util.TreeSet;

/*
 * 需求：创建TreeSet集合，并添加3个学生对象
 *             学生对象属性：
 *                 姓名，年龄。
 *                 要求按照学生的年龄进行排序
 *                 同年龄按照姓名字母排列（暂不考虑中文）
 *                 同姓名，同年龄认为是同一个人
 *
 *
 * TreeSet的两种比较方式：
 * 	方式一：
 * 		默认的排序规则/自然排序：Student Javabean类实现Comparable接口，重写里面的抽象方法，再指定比较规则
 * 		（如果打印的是地址值，Student Javabean类需要重写toString方法）
 *
 * ⚠️注意：hashCode和equals方法是和哈希表有关的；
 * 		  而TreeSet的底层是红黑树结构，因此不需要重写hashCode和equals方法。
 * 		  但是TreeSet需要指定排序规则。
 */
public class A05_TreeSetDemo2 {
	public static void main(String[] args) {
		// 1.创建三个学生对象
		Student s1 = new Student("zhangsan", 23);
		Student s2 = new Student("lisi", 24);
		Student s3 = new Student("wangwu", 25);
		Student s4 = new Student("zhaoliu", 26);

		// 2.创建集合对象
		TreeSet<Student> ts = new TreeSet<>();

		// 3.添加元素
		ts.add(s3);
		ts.add(s2);
		ts.add(s1);
		ts.add(s4);

		// 4.打印集合
		System.out.println(ts);
	}
}