package com.itheima.test4;

import java.util.Scanner;

/**
 * 键盘录入的两套体系不能混用的
 * 弊端：先用nextInt，再用nextLine会导致下面的nextLine接受不到数据
 */
public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入一个整数");
		int num = sc.nextInt();		// 输入：123 + 回车
		System.out.println(num);	// 输出：123

		System.out.println("请输入一个字符串");
		String line = sc.nextLine();
		System.out.println(line);	// 输出：
	}
}
