package com.itheima.a04myfunction;

import com.itheima.a04myfunction.FunctionDemo5.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
 * 需求：
 *      集合中存储一些字符串的数据，比如：张三,23。
 *      收集到Student类型的数组当中
 */
public class FunctionDemo8 {
	public static void main(String[] args) {
		// 1.创建集合并添加元素
		ArrayList<String> list = new ArrayList<>();
		Collections.addAll(list, "张无忌,15", "周芷若,14", "赵敏,13", "张强,20", "张三丰,100", "张翠山,40", "张良,35", "王二麻子,37", "谢广坤,41");

		// 2.先把字符串变成Student对象，然后再把Student对象收集起来
		Student[] arr = list.stream()
				.map(Student::new)    // 引用构造方法，目的是把字符串变成Student对象
				.toArray(Student[]::new);    // 引用数组的构造方法，创建Student的数组，并把Student对象放到数组中

		// 打印数组
		System.out.println(Arrays.toString(arr));
	}
}
