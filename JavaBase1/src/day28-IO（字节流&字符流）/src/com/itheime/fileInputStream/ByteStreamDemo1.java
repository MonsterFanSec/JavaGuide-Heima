package com.itheime.fileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * 演示：字节输入流FileInputStream
 * 实现需求：读取文件中的数据。（暂时不写中文）
 *
 * 实现步骤：
 *       创建对象
 *       读取数据
 *       释放资源
 */
public class ByteStreamDemo1 {
	public static void main(String[] args) throws IOException {
		// 1.创建对象
		String parentPath = "/Users/daykalif/Desktop/Java/JavaBase1/src/day28-IO（字节流&字符流）/src/com/itheime/fileInputStream/a.txt";
		FileInputStream fis = new FileInputStream(parentPath);

		// 2.读取数据
		int b1 = fis.read();
		System.out.println((char) b1);
		int b2 = fis.read();
		System.out.println((char) b2);
		int b3 = fis.read();
		System.out.println((char) b3);
		int b4 = fis.read();
		System.out.println((char) b4);
		int b5 = fis.read();
		System.out.println((char) b5);
		int b6 = fis.read();
		System.out.println(b6); // 如果读不到了，则返回-1

		// 3.释放资源
		fis.close();
	}
}
