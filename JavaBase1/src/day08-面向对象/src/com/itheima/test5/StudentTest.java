package com.itheima.test5;

public class StudentTest {
	public static void main(String[] args) {
		// 创建对象，调用空参构造
		Student s = new Student();

		// 空参构造方法的使用场景就是在不确定类的属性值时，通过下述set的方法进行手动设置时使用
		s.setName("张三");
		System.out.println(s.getName());


		// 创建对象，调用带参构造
		Student s1 = new Student("李四", 24);
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
	}
}
