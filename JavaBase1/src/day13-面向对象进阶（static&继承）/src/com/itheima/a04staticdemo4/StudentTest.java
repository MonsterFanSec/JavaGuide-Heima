package com.itheima.a04staticdemo4;

public class StudentTest {
	/**
	 * []：数组
	 * string：数据类型
	 * args：数组名
	 */
	public static void main(String[] args) {
		System.out.println(args.length);
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}

		Student.teacherName = "阿玮老师";

		// 1.创建第一个学生对象
		Student s1 = new Student();
		System.out.println("s1:" + s1);
		s1.name = "张三";
		s1.age = 23;
		s1.show1();

		System.out.println("==========================");

		// 2.创建第二个学生对象
		Student s2 = new Student();
		System.out.println("s2:" + s2);
		s2.name = "李四";
		s2.age = 24;
		s2.show1();
	}
}
