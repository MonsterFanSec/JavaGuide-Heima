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
public class CharStreamDemo1 {
	public static void main(String[] args) throws IOException {
		// 1.创建对象并关联本地文件
		String inputPath = "/Users/daykalif/Desktop/Java/JavaBase1/src/day28-IO（字节流&字符流）/src/com/itheime/mychartStream/a.txt";
		FileReader fr = new FileReader(inputPath);

		/*
		 * 2.读取数据 read()
		 * 		字符流的底层也是字节流，默认也是一个字节一个字节的读取的。
		 * 		如果遇到中文就会一次读取多个，GBK一次读两个字节，UTF-8一次读三个字节
		 *
		 * read()细节：
		 * 		1.read():默认也是一个字节一个字节的读取的,如果遇到中文就会一次读取多个
		 * 		2.在读取之后，方法的底层还会进行解码并转成十进制。
		 * 		  最终把这个十进制作为返回值
		 * 		  这个十进制的数据也表示在字符集上的数字
		 *
		 * 		 英文：文件里面二进制数据，如：0110 0001
		 * 			read方法进行读取，解码并转成十进制97
		 * 		 中文：文件里面的二进制数据，如：11100110 10110001 10001001
		 * 			read方法进行读取，解码并转成十进制27721
		 *
		 * 		 我想看到中文汉字，就是把这些十进制数据，再进行强转就可以了
		 */
		int ch;
		while ((ch = fr.read()) != -1) {
			// System.out.print(ch);    // 2338331526279693034024213236182006326159233833341027969652924066435748200632615919968200102338333410199682001023383334103034035835214623034012290
			System.out.print((char) ch);    // 字符流的底层也是字节流，默认也是一个字节一个字节的读取的。
		}

		//3.释放资源
		fr.close();
	}
}