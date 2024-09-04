package com.itheima.student;

import java.util.ArrayList;

/**
 * 需求：定义一个集合，添加一些学生对象，并进行遍历
 * 		学生类的属性为：姓名，年龄。
 */
public class Test4 {
	public static void main(String[] args) {
		// 1.创建集合
		ArrayList<Student> list = new ArrayList<>();

		// 2.创建学生对象
		Student s1 = new Student("zhangsan", 23);
		Student s2 = new Student("lisi", 24);
		Student s3 = new Student("wangwu", 25);

		// 3.添加元素
		list.add(s1);
		list.add(s2);
		list.add(s3);

		//4.遍历集合
		for (int i = 0; i < list.size(); i++) {		// 快捷键：list.fori
			// i 索引 list.get(i) 元素/学生对象
			Student stu = list.get(i);
			System.out.println(stu.getName() + ", " + stu.getAge());
		}
	}
}
