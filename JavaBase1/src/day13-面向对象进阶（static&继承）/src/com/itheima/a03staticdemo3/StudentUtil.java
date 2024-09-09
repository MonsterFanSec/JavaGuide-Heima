package com.itheima.a03staticdemo3;

import java.util.ArrayList;

/**
 * 练习：定义学生工具类
 * 需求：定义一个集合，用于存储3个学生对象。
 * 学生类的属性为：name、age、gender
 * 定义一个工具类，用于获取集合中最大学生的年龄。
 */

public class StudentUtil {

	private StudentUtil() {
	}

	//静态方法
	public static int getMaxAgeStudent(ArrayList<Student> list) {
		// 1.定义一个参照物
		int max = list.get(0).getAge();

		// 2.循环遍历集合
		for (int i = 1; i < list.size(); i++) {
			// i 索引  list.get(i)元素/学生对象  我们还需要getAge获取到年龄之后再进行比较
			int tempAge = list.get(i).getAge();
			if (tempAge > max) {
				max = tempAge;
			}
		}

		// 3.直接返回max
		return max;
	}
}
