package com.itheima.mycommonsio;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/*
 * Commons-io
 *      Commons-io是apache开源基金组织提供的一组有关IO操作的开源工具包。
 *      作用：提高IO流的开发效率。
 *
 * 		专门为支持开源软件项目而办的一个非盈利性组织
 * 		成立于1999年，总部设于美国马里兰州
 *
 * Commons-io使用步骤：
 *		1.在项目中创建一个文件夹：lib
 * 		2.将jar包复制粘贴到lib文件夹
 * 		3.右键点击jar包，选择Add as Library -> 点击OK
 * 		4.在类中导包使用
 *
 *
 * FileUtils类
 * 		static void copyFile(File srcFile, File destFile)                   复制文件
 * 		static void copyDirectory(File srcDir, File destDir)                复制文件夹
 * 		static void copyDirectoryToDirectory(File srcDir, File destDir)     复制文件夹
 * 		static void deleteDirectory(File directory)                         删除文件夹
 * 		static void cleanDirectory(File directory)                          清空文件夹
 * 		static String readFileToString(File file, Charset encoding)         读取文件中的数据变成成字符串
 * 		static void write(File file, CharSequence data, String encoding)    写出数据

 * IOUtils类
 * 		public static int copy(InputStream input, OutputStream output)      复制文件
 * 		public static int copyLarge(Reader input, Writer output)            复制大文件
 * 		public static String readLines(Reader input)                        读取数据
 * 		public static void write(String data, OutputStream output)          写出数据
 */
public class CommonsIODemo1 {
	public static void main(String[] args) throws IOException {
		String path = "/Users/daykalif/Desktop/Java/JavaBase1/src/day29-IO（其他流）/src/com/itheima/mycommonsio";
		File src = new File(path + "/a.txt");
		File dest = new File(path + "/copy.txt");
		FileUtils.copyFile(src, dest);

		File src1 = new File(path + "/aaa");
		File dest1 = new File(path + "/copy_folder");
		FileUtils.copyDirectoryToDirectory(src1, dest1);

		File src2 = new File(path + "/copy_folder");
		FileUtils.cleanDirectory(src2);

		FileUtils.deleteDirectory(src2);
	}
}
