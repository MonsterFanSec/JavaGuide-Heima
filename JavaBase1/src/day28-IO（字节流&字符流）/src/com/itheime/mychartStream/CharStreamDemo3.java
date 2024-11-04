package com.itheime.mychartStream;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 第一步：创建对象
 *      public FileWriter(File file)                            创建字符输出流关联本地文件
 *      public FileWriter(String pathname)                      创建字符输出流关联本地文件
 *      public FileWriter(File file,  boolean append)           创建字符输出流关联本地文件，续写
 *      public FileWriter(String pathname,  boolean append)     创建字符输出流关联本地文件，续写
 *
 * 第二步：读取数据
 *      void write(int c)                           写出一个字符
 *      void write(String str)                      写出一个字符串
 *      void write(String str, int off, int len)    写出一个字符串的一部分
 *      void write(char[] cbuf)                     写出一个字符数组
 *      void write(char[] cbuf, int off, int len)   写出字符数组的一部分
 *
 * 第三步：释放资源
 *      public void close()                 释放资源/关流
 *
 *
 *
 * FileWriter书写细节：
 * 		1.创建字符输出流对象
 * 			细节1:参数是字符串表示的路径或者File对象都是可以的
 * 			细节2:如果文件不存在会创建一个新的文件，但是要保证父级路径是存在的
 * 			细节3:如果文件已经存在，则会清空文件，如果不想清空可以打开续写开关
 *
 * 		2.写数据
 * 			细节：如果write方法的参数是整数，但是实际上写到本地文件中的是整数在字符集上对应的字符
 *
 * 		3.释放资源
 * 			细节：每次使用完流之后都要释放资源
 *
 */
public class CharStreamDemo3 {
	public static void main(String[] args) throws IOException {
		String writerPath = "/Users/daykalif/Desktop/Java/JavaBase1/src/day28-IO（字节流&字符流）/src/com/itheime/mychartStream/a.txt";
		FileWriter fw = new FileWriter(writerPath, true);

		fw.write(25105);    // idea默认使用utf-8编码，一个中文对应3个字节："我"
		fw.write("你好威啊???");

		char[] chars = {'a', 'b', 'c', 'd', '我'};
		fw.write(chars);
		fw.write(chars, 2, 2);    // d我

		fw.close();
	}
}
