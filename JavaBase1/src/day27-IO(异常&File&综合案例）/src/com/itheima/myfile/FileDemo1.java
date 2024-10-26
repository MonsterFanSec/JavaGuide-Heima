package com.itheima.myfile;

import java.io.File;

/*
 * public File(String pathname)                根据文件路径创建文件对象
 * public File(String parent, String child)    根据父路径名字符串和子路径名字符串创建文件对象
 * public File(File  parent, String child)     根据父路径对应文件对象和子路径名字符串创建文件对象
 *
 * C:\Users\alienware\Desktop
 * \:转义字符
 */
public class FileDemo1 {
	public static void main(String[] args) {
		// 1.根据字符串表示的路径，变成File对象
		String str = "/Users/daykalif/Desktop/a.txt";
		File f1 = new File(str);
		System.out.println(f1); // /Users/daykalif/Desktop/a.txt


		// 2.父级路径：/Users/daykalif/Desktop
		// 子级路径：a.txt
		String parent = "/Users/daykalif/Desktop";
		String child = "a.txt";
		File f2 = new File(parent, child);
		System.out.println(f2);    // /Users/daykalif/Desktop/a.txt

		File f3 = new File(parent + "/" + child);
		System.out.println(f3);    // /Users/daykalif/Desktop/a.txt


		// 3.把一个File表示的路径和String表示路径进行拼接
		File parent2 = new File("/Users/daykalif/Desktop");
		String child2 = "a.txt";
		File f4 = new File(parent2, child2);
		System.out.println(f4);    // /Users/daykalif/Desktop/a.txt
	}
}