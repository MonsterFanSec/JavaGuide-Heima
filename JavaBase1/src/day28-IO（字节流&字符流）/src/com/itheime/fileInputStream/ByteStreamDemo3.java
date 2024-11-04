package com.itheime.fileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 字节输入流循环读取
 */
public class ByteStreamDemo3 {
	public static void main(String[] args) throws IOException {
		// 1.创建对象
		String parentPath = "/Users/daykalif/Desktop/Java/JavaBase1/src/day28-IO（字节流&字符流）/src/com/itheime/fileInputStream/a.txt";
		FileInputStream fis = new FileInputStream(parentPath);

		// 2.循环读取
		int b;
		while ((b = fis.read()) != -1) {
			System.out.println((char) b);
		}

		// 3.释放资源
		fis.close();

		System.out.println("========================================");

		/* read :表示读取数据，而且是读取一个数据就移动一次指针 */
		FileInputStream fis2 = new FileInputStream(parentPath);
		while ((fis2.read()) != -1) {
			System.out.println(fis2.read());    // 98  100  -1
		}
		fis2.close();
	}
}
