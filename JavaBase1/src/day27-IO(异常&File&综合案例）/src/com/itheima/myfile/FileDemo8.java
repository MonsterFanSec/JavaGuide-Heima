package com.itheima.myfile;

import java.io.File;

/*
 *（需要掌握）public File[] listFiles()                 获取当前该路径下所有内容
 * public File[] listFiles(FileFilter filter)      利用文件名过滤器获取当前该路径下所有内容
 * public File[] listFiles(FilenameFilter filter)  利用文件名过滤器获取当前该路径下所有内容
 */
public class FileDemo8 {
	public static void main(String[] args) {
		// 1.创建File对象
		File f = new File("/Users/daykalif/Desktop/socket-io");

		// 2.需求：打印里面所有的jpg文件
		File[] arr = f.listFiles();
		for (File file : arr) {
			// file依次表示socket-io文件夹里面每一个文件或者文件夹的路径
			if (file.isFile() && file.getName().endsWith(".jpg")) {
				System.out.println(file);
			}
		}
	}
}
