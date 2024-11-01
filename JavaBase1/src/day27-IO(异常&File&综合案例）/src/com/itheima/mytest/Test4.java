package com.itheima.mytest;

import java.io.File;

/*
 * 需求：删除一个多级文件夹
 *
 * 如果我们要删除一个有内容的文件夹
 *  1.先删除文件夹里面所有的内容
 *  2.再删除自己
 */
public class Test4 {
	public static void main(String[] args) {
		String parentPath = "/Users/daykalif/Desktop/Java/JavaBase1/src/day27-IO(异常&File&综合案例）/src/com/itheima/mytest";
		File file = new File(parentPath + "/ccc");
		delete(file);
	}

	/*
	 * 作用：删除src文件夹
	 * 参数：要删除的文件夹
	 */
	public static void delete(File src) {
		//1.先删除文件夹里面所有的内容
		// 进入src
		File[] files = src.listFiles();
		// 遍历
		for (File file : files) {
			// 判断,如果是文件，删除
			if (file.isFile()) {
				file.delete();
			} else {
				// 判断,如果是文件夹，就递归
				delete(file);
			}
		}
		// 2.再删除自己
		src.delete();
	}
}
