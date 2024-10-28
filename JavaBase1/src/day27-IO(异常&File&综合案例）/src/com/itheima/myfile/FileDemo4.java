package com.itheima.myfile;

import java.io.File;
import java.io.IOException;

/*
 * public boolean createNewFile()      创建一个新的空的文件
 * public boolean mkdir()              创建单级文件夹
 * public boolean mkdirs()             创建多级文件夹
 * public boolean delete()             删除文件、空文件夹
 */
public class FileDemo4 {
	public static void main(String[] args) throws IOException {
		/*
		 * 1.createNewFile 创建一个新的空的文件
		 *      细节1：如果当前路径表示的文件是不存在的，则创建成功，方法返回true
		 *            如果当前路径表示的文件是存在的，则创建失败，方法返回false
		 *      细节2：如果父级路径是不存在的，那么方法会有异常IOException
		 *      细节3：createNewFile方法创建的一定是文件，如果路径中不包含后缀名，则创建一个没有后缀的文件
		 */
		File f1 = new File("/Users/daykalif/Desktop/c.txt");
		boolean a = f1.createNewFile();
		System.out.println(a);  // true


		//File f2 = new File("/Users/daykalif/Desktop1/c.txt");
		//boolean b = f2.createNewFile();
		//System.out.println(b);  // 报错：Exception in thread "main" java.io.IOException: No such file or directory

		File f3 = new File("/Users/daykalif/Desktop/aaa");
		boolean c = f3.createNewFile();
		System.out.println(c);    // true


		/*
		 * 2.mkdir   make Directory，文件夹（目录）
		 *      细节1：windows当中路径是唯一的，如果当前路径已经存在，则创建失败，返回false
		 *      细节2：mkdir方法只能创建单级文件夹，无法创建多级文件夹。
		 */
		File f4 = new File("/Users/daykalif/Desktop/socket-io");
		boolean d = f4.mkdir();
		System.out.println(d);

		/*
		 * 3.mkdirs   创建多级文件夹
		 * 		细节：既可以创建单级的，又可以创建多级的文件夹
		 */
		File f5 = new File("/Users/daykalif/Desktop/eee/fff");
		boolean e = f5.mkdirs();
		System.out.println(e);    // true
	}
}
