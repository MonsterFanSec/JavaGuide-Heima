package com.itheima.Integer;

import java.util.Scanner;

public class A05_IntegerDemo5 {
	public static void main(String[] args) {
		// 键盘录入
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数");
		/*int i = sc.nextInt();
		System.out.println(i);*/


		/*System.out.println("请输入一个字符串");
		String str = sc.next();
		System.out.println(str);*/

		/*
		 * 上述输入的弊端:
		 * 当我们在使用next，nextInt，nextDouble在接收数据的时候，遇到空格，回车，制表符的时候就停止了
		 * 如果键盘录入的是“123 123 ”，那么此时只能接收到空格前面的数据，但是我想要的是接收一整行数据
		 *
		 * 约定:
		 * 	以后我们如果想要键盘录入，不管什么类型，统一使用nextLine
		 *
		 * 特点:
		 * 	遇到回车才停止
		 */
		String line = sc.nextLine();
		System.out.println(line);

		// 得到一个整数
		//int n = Integer.parseInt(line);
		//System.out.println(n);

		// 得到一个double类型小数
		double v = Double.parseDouble(line);
		System.out.println(v + 1);
	}
}
