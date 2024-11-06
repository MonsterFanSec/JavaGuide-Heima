package com.itheima.mytest;

import java.io.*;

/*
 * 实现一个验证程序运行次数的小程序，要求如下：
 *  1.当程序运行超过3次时给出提示:本软件只能免费使用3次,欢迎您注册会员后继续使用~
 *  2.程序运行演示如下:
 *      第一次运行控制台输出: 欢迎使用本软件,第1次使用免费~
 *      第二次运行控制台输出: 欢迎使用本软件,第2次使用免费~
 *      第三次运行控制台输出: 欢迎使用本软件,第3次使用免费~
 *      第四次及之后运行控制台输出:本软件只能免费使用3次,欢迎您注册会员后继续使用~
 */
public class Test07 {
	public static void main(String[] args) throws IOException {
		/*
		 * 1.把文件中的数字读取到内存中
		 */
		String path = "/Users/daykalif/Desktop/Java/JavaBase1/src/day29-IO（其他流）/src/com/itheima/mytest";
		BufferedReader br = new BufferedReader(new FileReader(path + "/count.txt"));

		/*
		 * 原则：
		 * 		IO：随用随创建
		 * 			什么时候不用什么时候关闭
		 * 输出流在关联文件时，如果文件存在，则会清空内容；因此BufferedWriter不能写在这里
		 */
		// BufferedWriter bw = new BufferedWriter(new FileWriter(path + "/count.txt"));

		String line = br.readLine();
		br.close();

		System.out.println(line);    // null
		int count = Integer.parseInt(line);
		// 表示当前软件又运行了一次
		count++;    // 1

		// 2.判断
		if (count <= 3) {
			System.out.println("欢迎使用本软件,第" + count + "次使用免费~");
		} else {
			System.out.println("本软件只能免费使用3次,欢迎您注册会员后继续使用~");
		}

		// 3.把当前自增之后的count写出到文件当中
		BufferedWriter bw = new BufferedWriter(new FileWriter(path + "/count.txt"));
		bw.write(count + "");    // 传入到write方法中数字需要转成字符串；如果不转成字符串，写入数字如：97，保存到文件时会变成a
		bw.close();
	}
}
