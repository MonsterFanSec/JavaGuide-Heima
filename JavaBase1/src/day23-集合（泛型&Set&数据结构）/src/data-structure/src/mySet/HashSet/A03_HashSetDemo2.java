package mySet.HashSet;

import java.util.HashSet;

/*
 * 需求：创建一个存储学生对象的集合，存储多个学生对象。使用程序实现在控制台遍历该集合。
 * 要求：学生对象的成员变量值相同，我们就认为是同一个对象
 */
public class A03_HashSetDemo2 {
	public static void main(String[] args) {
		// 1.创建三个学生对象
		Student s1 = new Student("zhangsan", 23);
		Student s2 = new Student("lisi", 24);
		Student s3 = new Student("wangwu", 25);
		Student s4 = new Student("zhangsan", 23);    // 如果不希望添加数据有重复，需要重写equals & hashCode

		// 2.创建集合用来添加学生
		HashSet<Student> hs = new HashSet<>();

		/*  重写：equals  /	 hashCode */
		// 3.添加元素
		System.out.println(hs.add(s1));
		System.out.println(hs.add(s2));
		System.out.println(hs.add(s3));
		System.out.println(hs.add(s4));

		// 4.打印集合
		System.out.println(hs);
	}
}
