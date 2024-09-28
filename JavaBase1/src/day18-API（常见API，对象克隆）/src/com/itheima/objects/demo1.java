package com.itheima.objects;

import com.itheima.object.Student;

public class demo1 {
	public static void main(String[] args) {
		// 1.创建学生类的对象
		Student s1 = null;
		Student s2 = new Student("zhangsan", 23);

		// System.out.println(s1.equals(s2));    // null不能调用方法

		// 2.比较两个对象的属性值是否相同
		if (s1 != null) {
			boolean result = s1.equals(s2);
			System.out.println(result);
		} else {
			System.out.println("调用者为空");
		}
	}
}
