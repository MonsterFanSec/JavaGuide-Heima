package com.itheima.test;

/*
 * 定义一个方法自己实现toBinaryString方法的效果，将一个十进制整数转成字符串表示的二进制
 *
 * 除基取余法：
 * 	不断的除以基数（几进制，基数就是几）得到余数，直到商为0，再将余数倒着拼接起来即可。
 *
 * 核心逻辑:
 * 	不断的去除以2，得到余数，一直到商为0就结束。
 * 	还需要把余数倒着拼接起来
 */
public class Test3 {
	public static void main(String[] args) {
		System.out.println(tobinarystring(123));
		System.out.println(tobinarystring(123));
	}

	public static String tobinarystring(int number) {
		// 定义一个StringBuilder用来拼接余数
		StringBuilder sb = new StringBuilder();

		// 利用循环不断的除以2获取余数
		while (true) {
			if (number == 0) {
				break;
			}
			// 获取余数 %
			int remaindar = number % 2; // 倒着拼接
			sb.insert(0, remaindar);    // 插到头部

			// 除以2 /
			number = number / 2;
		}
		return sb.toString();
	}
}
