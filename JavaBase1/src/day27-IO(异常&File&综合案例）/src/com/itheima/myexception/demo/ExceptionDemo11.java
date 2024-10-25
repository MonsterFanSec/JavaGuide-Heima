package com.itheima.myexception.demo;

/*
 * Throwable 成员方法：
 *
 * 		public String getMessage()          返回此 throwable 的详细消息字符串
 * 		public String toString()            返回此可抛出的简短描述
 *
 * 		public void printStackTrace()       在底层是利用System.err.println进行输出
 *                                    		把异常的错误信息以红色字体输出在控制台，包含了getMessage()和toString()的信息
 *                                     		细节：仅仅是打印信息，不会停止程序运行
 */
public class ExceptionDemo11 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6};

		try {
			System.out.println(arr[10]);    // 选中语句，快捷键：command + option + T，选择try...catch...
		} catch (ArrayIndexOutOfBoundsException e) {
			String message = e.getMessage();
			System.out.println(message);    // Index 10 out of bounds for length 6

			String str = e.toString();
			System.out.println(str);    // java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 6*//*

			e.printStackTrace();
		}
		System.out.println("看看我执行了吗？");


		// 正常的输出语句
		System.out.println(123);

		// 错误的输出语句（不是代码错了，而是用来打印错误信息，以红色的形式展示；打印时输出的顺序，与后面知识点多进程有关）
		System.err.println(123);
	}
}
