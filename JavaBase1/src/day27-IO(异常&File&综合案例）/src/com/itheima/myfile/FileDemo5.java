package com.itheima.myfile;

import java.io.File;

/*
 * public boolean delete()             删除文件、空文件夹
 *
 * 细节：
 *      如果删除的是文件，则直接删除，不走回收站。
 *      如果删除的是空文件夹，则直接删除，不走回收站
 *      如果删除的是有内容的文件夹，则删除失败
 */
public class FileDemo5 {
	public static void main(String[] args) {
		// 1.创建File对象
		File f1 = new File("/Users/daykalif/Desktop/aaa");

		// 2.删除
		boolean a = f1.delete();
		System.out.println(a);


		File f2 = new File("/Users/daykalif/Desktop/c.txt");
		boolean b = f2.delete();
		System.out.println(b);


		File f3 = new File("/Users/daykalif/Desktop/eee");
		boolean c = f3.delete();
		System.out.println(c);


		File f4 = new File("/Users/daykalif/Desktop/eee/fff");
		boolean d = f4.delete();
		System.out.println(d);
	}
}
