package com.itheima.myfile;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

/*
 * public static File[] listRoots()                列出可用的文件系统根
 * public String[] list()                          获取当前该路径下所有内容
 * public String[] list(FilenameFilter filter)     利用文件名过滤器获取当前该路径下所有内容
 * （需要掌握）public File[] listFiles()                获取当前该路径下所有内容
 * public File[] listFiles(FileFilter filter)      利用文件名过滤器获取当前该路径下所有内容
 * public File[] listFiles(FilenameFilter filter)  利用文件名过滤器获取当前该路径下所有内容
 */
public class FileDemo7 {
	public static void main(String[] args) {
		// 1.listRoots  获取系统中所有的盘符
		File[] arr = File.listRoots();
		System.out.println(Arrays.toString(arr));    // [/]
		System.out.println("===================================");

		// 2.list()    获取当前该路径下所有内容(仅仅能获取名字)
		File f1 = new File("/Users/daykalif/Desktop/socket-io");
		String[] arr2 = f1.list();
		for (String s : arr2) {
			System.out.println(s);
		}
		System.out.println("===================================");


		// 3.list(FilenameFilter filter)  利用文件名过滤器获取当前该路径下所有内容

		// 需求：我现在要获取/Users/daykalif/Desktop/socket-io文件夹里面所有的jpg文件
		File f2 = new File("/Users/daykalif/Desktop/socket-io");
		/*
		 * accept方法的形参，依次表示/Users/daykalif/Desktop/socket-io文件夹里面每一个文件或者文件夹的路径
		 * 参数一：父级路径
		 * 参数二：子级路径
		 * 返回值：如果返回值为true，就表示当前路径保留
		 * 		  如果返回值为false，就表示当前路径舍弃不要
		 */
		String[] arr3 = f2.list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				File src = new File(dir, name);
				return src.isFile() && name.endsWith(".jpg");
			}
		});
		System.out.println(Arrays.toString(arr3));
	}
}
