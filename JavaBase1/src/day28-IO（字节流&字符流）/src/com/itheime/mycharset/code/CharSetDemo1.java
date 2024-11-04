package com.itheime.mycharset.code;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * 字节流读取中文会出现乱码
 */
public class CharSetDemo1 {
	public static void main(String[] args) throws IOException {
		String inputPath = "/Users/daykalif/Desktop/Java/JavaBase1/src/day28-IO（字节流&字符流）/src/com/itheime/mycharset/code/a.txt";
		FileInputStream fis = new FileInputStream(inputPath);

		int b;
		while ((b = fis.read()) != -1) {
			System.out.print((char) b);
		}

		fis.close();
	}
}
