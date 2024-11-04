package com.itheime.mychartStream;

import java.io.FileReader;
import java.io.IOException;

/*
 * 第一步：创建对象
 *      public FileReader(File file)        创建字符输入流关联本地文件
 *      public FileReader(String pathname)  创建字符输入流关联本地文件
 *
 * 第二步：读取数据
 *      public int read()                   读取数据，读到末尾返回-1
 *      public int read(char[] buffer)      读取多个数据，读到末尾返回-1
 *
 * 第三步：释放资源
 *      public void close()                 释放资源/关流
 */
public class CharStreamDemo2 {
	public static void main(String[] args) throws IOException {
		// 1.创建对象
		String inputPath = "/Users/daykalif/Desktop/Java/JavaBase1/src/day28-IO（字节流&字符流）/src/com/itheime/mychartStream/a.txt";
		FileReader fr = new FileReader(inputPath);

		// 2.读取数据
		char[] chars = new char[2];    // 表示一次读2个
		int len;
		// read(chars)：读取数据，解码，强转三步合并了，把强转之后的字符放到数组当中
		// 				有参read构造方法 = 空参的read + 强转类型转换
		while ((len = fr.read(chars)) != -1) {
			// 把数组中的数据变成字符串再进行打印（不要换行）
			System.out.print(new String(chars, 0, len));
		}
		// 3.释放资源
		fr.close();
	}
}