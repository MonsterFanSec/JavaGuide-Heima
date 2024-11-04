package com.itheime.mycharset.code;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 拷贝不会出现乱码（因为编码和解码方式一致）
 */
public class CharSetDemo2 {
	public static void main(String[] args) throws IOException {
		String inputPath = "/Users/daykalif/Desktop/Java/JavaBase1/src/day28-IO（字节流&字符流）/src/com/itheime/mycharset/code/a.txt";
		String outputPath = "/Users/daykalif/Desktop/Java/JavaBase1/src/day28-IO（字节流&字符流）/src/com/itheime/mycharset/code/b.txt";

		// 1.创建对象
		FileInputStream fis = new FileInputStream(inputPath);
		FileOutputStream fos = new FileOutputStream(outputPath);

		// 2.拷贝
		int b;
		while ((b = fis.read()) != -1) {
			fos.write(b);
		}

		// 3.释放资源
		fos.close();
		fis.close();
	}
}
