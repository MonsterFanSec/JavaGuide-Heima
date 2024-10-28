package com.itheima.myfile;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;

/*
 * public File[] listFiles(FileFilter filter)      利用文件名过滤器获取当前该路径下所有内容
 * public File[] listFiles(FilenameFilter filter)  利用文件名过滤器获取当前该路径下所有内容
 */
public class FileDemo9 {
	public static void main(String[] args) {
		// 创建File对象
		File f = new File("/Users/daykalif/Desktop/socket-io");
		// 调用listFiles(FileFilter filter)
		File[] arr1 = f.listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				return pathname.isFile() && pathname.getName().endsWith(".jpg");
			}
		});
		System.out.println(Arrays.toString(arr1));
		System.out.println("=======================================");

		// 调用listFiles(FilenameFilter filter)
		File[] arr2 = f.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				File src = new File(dir, name);
				return src.isFile() && name.endsWith(".jpg");
			}
		});
		System.out.println(Arrays.toString(arr2));
	}
}
