package com.itheima.mytest;

import java.io.File;

/*
 * 需求：找到电脑中所有以avi结尾的电影。（需要考虑子文件夹）
 *
 * 套路：
 *      1，进入文件夹
 *      2，遍历数组
 *      3，判断
 *      4，判断
 */
public class Test3 {
	public static void main(String[] args) {
		//findAVI();	// 遍历本地所有文件夹中的avi文件

		String parentPath = "/Users/daykalif/Desktop/Java/JavaBase1/src/day27-IO(异常&File&综合案例）/src/com/itheima/mytest";
		File file = new File(parentPath);
		findAVI(file);
	}

	public static void findAVI() {
		// 获取本地所有的盘符
		File[] arr = File.listRoots();
		for (File f : arr) {
			findAVI(f);
		}
	}

	public static void findAVI(File src) {
		// 1.进入文件夹src
		File[] files = src.listFiles();

		// 2.遍历数组,依次得到src里面每一个文件或者文件夹
		if (files != null) {    // 回收站没有权限，file会返回null
			for (File file : files) {
				if (file.isFile()) {
					// 3，判断，如果是文件，就可以执行题目的业务逻辑
					String name = file.getName();
					if (name.endsWith(".avi")) {
						System.out.println(file);
					}
				} else {
					// 4，判断，如果是文件夹，就可以递归
					// 细节：再次调用本方法的时候，参数一定要是src的次一级路径(里面的文件夹路径)
					findAVI(file);
				}
			}
		}
	}
}
