package com.itheima.test4;

import java.util.Scanner;

/**
 * 键盘录入：
 * 第一套体系: （遇到空格，制表符，回车就停止接受。这些符号后面的数据就不会接受了）
 * 		nextInt(); 接收整数
 * 		nextDouble();接收小数
 * 		next();接收字符串
 *
 * 第二套体系：（可以接收空格，制表符，遇到回车才停止接受数据）
 * 		nextLine();接收字符串
 */
public class Test {
	public static void main(String[] args) {
		// testNextInt();
		// testNext();
		testNextLine();
	}

	public static void testNextInt(){
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入一个整数");
		int num1 = sc.nextInt();	// 输入:123          234
		System.out.println(num1);	// 输出:123

		System.out.println("请输入第二个整数");
		int num2 = sc.nextInt();
		System.out.println(num2);	// 输出：456（456前面没有空格）
	}

	public static void testNext(){
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入一个字符串");
		String str1 = sc.next();	// 输入：abc bcd
		System.out.println(str1);	// abc

		System.out.println("请输入第二个字符串");
		String str2 = sc.next();
		System.out.println(str2);	// bcd
	}

	public static void testNextLine(){
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入一个字符串");
		String line1 = sc.nextLine();	// 输入:abc bcd
		System.out.println(line1);		// 输出：abc bcd

		System.out.println("请输入第二个字符串");
		String line2 = sc.nextLine();
		System.out.println(line2);		// 输出：
	}
}
