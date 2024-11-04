package com.itheime.fileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * public int read(byte[] buffer)      一次读一个字节数组数据
 *
 * 注意⚠️：一次读一个字节数组的数据，每次读取会尽可能把数组装满
 * 建议：1024的整数倍		如一次拷贝5M = 1024 * 1024 * 5
 */
public class ByteStreamDemo5 {
	public static void main(String[] args) throws IOException {
		// 1.创建对象
		String inputPath = "/Users/daykalif/Desktop/Java/JavaBase1/src/day28-IO（字节流&字符流）/src/com/itheime/fileInputStream/a.txt";
		FileInputStream fis = new FileInputStream(inputPath);

		// 2.读取数据
		byte[] bytes = new byte[2];    // 一次读2个字节

		// 一次读取多个字节数据，具体读多少，跟数组的长度有关
		int len1 = fis.read(bytes);    // 返回值：本次读取到了多少个字节数据
		System.out.println(len1);    // 2
		String str1 = new String(bytes, 0, len1);
		System.out.println(str1);


		int len2 = fis.read(bytes);
		System.out.println(len2);    // 2
		String str2 = new String(bytes, 0, len2);
		System.out.println(str2);


		int len3 = fis.read(bytes);
		System.out.println(len3);    // 1
		String str3 = new String(bytes, 0, len3);
		System.out.println(str3);    // ed


		int len4 = fis.read(bytes);
		System.out.println(len4);    // -1
		String str4 = new String(bytes);
		System.out.println(str4);    // ed
		String str5 = new String(bytes, 0, len4);    // len4：-1
		System.out.println(str5);    // 报错

		// 3.释放资源
		fis.close();
	}
}
