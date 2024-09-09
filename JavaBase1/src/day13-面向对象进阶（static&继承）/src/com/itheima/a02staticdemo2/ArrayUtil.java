package com.itheima.a02staticdemo2;

/**
 * static表示静态，是Java中的一个修饰符，可以修饰成员方法，成员变量
 * - 被static修饰的成员方法，叫做静态方法
 * 		- 特点：
 * 			- 多用在测试类和工具类中
 * 			- Javabean类中很少会用
 * 		- 调用方法：
 * 			- 类名调用（推荐）
 * 			- 对象名调用
 *
 *
 * 	工具类：帮助我们做一些事情的，但是不描述任何事物的类。
 * 	- Javabean类：用来描述一类事物的类。比如，Student，Teacher，Dog，Cat等
 * 	- 测试类：用来检查其他类是否书写正确，带有main方法的类，是程序的入口。
 * 	- 工具类：不是用来描述一类事物的，而是帮我们做一些事情的类。
 * 		- 类名见名知意
 * 		- 私有化构造方法
 * 		- 方法定义为静态
 *
 *
 * 	练习：定义数组工具类
 * 	需求：在实际开发中，经常会遇到一些数组使用的工具类。
 * 	请按照如下要求编写一个数组的工具类：ArrayUtil
 *	- 提供一个工具类方法printArr,用于返回数组的内容。
 *	  返回的字符串格式如：[10,20,50,34,100]（只考虑整数数组，且只考虑一维数组）
 *	- 提供这样一个工具方法getAverage，用于返回平均分。（只考虑浮点型数组，且只考虑一维数组）
 *  - 定义一个测试类TestDemo，调用该工具类的工具方法，并返回结果。
 */
public class ArrayUtil {


	// 私有化构造方法
	// 目的：为了不让外界创建他的对象
	private ArrayUtil() {
	}

	// 需要定义为静态的，方便调用
	public static String printArr(int[] arr) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			//i 索引 arr[i] 元素
			if (i == arr.length - 1) {
				sb.append(arr[i]);
			} else {
				sb.append(arr[i]).append(", ");
			}
		}
		sb.append("]");
		return sb.toString();
	}

	public static double getAverage(double[] arr) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum / arr.length;
	}
}