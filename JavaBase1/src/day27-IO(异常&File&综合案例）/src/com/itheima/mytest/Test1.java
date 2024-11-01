package com.itheima.mytest;

import java.io.File;
import java.io.IOException;

/**
 * 需求：在当前模块下的aaa文件夹中创建一个a.txt文件
 */
public class Test1 {
	public static void main(String[] args) throws IOException {
		String parentPath = "/Users/daykalif/Desktop/Java/JavaBase1/src/day27-IO(异常&File&综合案例）/src/com/itheima/mytest";
		// 1.创建a.txt的父级路径
		File file = new File(parentPath + "/aaa");

		/*
		 * 2.创建父级路径
		 *  如果aaa是存在的，那么此时创建失败的。
		 *  如果aaa是不存在的，那么此时创建成功的。
		 */
		file.mkdirs();

		// 3.拼接父级路径和子级路径
		File src = new File(file, "a.txt");
		boolean b = src.createNewFile();
		if (b) {
			System.out.println("创建成功");
		} else {
			System.out.println("文件已经存在，创建失败");
		}
	}
}
