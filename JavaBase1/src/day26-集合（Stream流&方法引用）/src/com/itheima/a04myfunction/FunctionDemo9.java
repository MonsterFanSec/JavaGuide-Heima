package com.itheima.a04myfunction;

import com.itheima.a04myfunction.FunctionDemo5.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

/*
 *   需求：
 *       创建集合添加学生对象
 *       学生对象属性：name，age
 *   要求：
 *       获取姓名并放到数组当中
 *       使用方法引用完成
 *
 *   技巧：
 *       1.现在有没有一个方法符合我当前的需求
 *       2.如果有这样的方法，这个方法是否满足引用的规则
 *
 *       a.静态
 * 				类名::方法名
 *       b.成员方法
 * 				...
 *       c.构造方法  类名::new
 */
public class FunctionDemo9 {
	public static void main(String[] args) {
		// 1.创建集合
		ArrayList<Student> list = new ArrayList<>();

		// 2.添加元素
		list.add(new Student("zhangsan", 23));
		list.add(new Student("lisi", 24));
		list.add(new Student("wangwu", 25));

		// 3.获取姓名并放到数组当中
		String[] arr = list.stream().map(new Function<Student, String>() {
			@Override
			public String apply(Student student) {
				return student.getName();
			}
		}).toArray(String[]::new);
		System.out.println(Arrays.toString(arr));
		System.out.println("=============================");


		/*
		 * 对象::方法名		参数和返回值类型完全一致
		 * 类名::方法名		被引用的方法形参是跟抽象方法第二个参数后面的保持一致
		 */
		String[] arr2 = list.stream().map(Student::getName).toArray(String[]::new);
		System.out.println(Arrays.toString(arr2));
	}
}
