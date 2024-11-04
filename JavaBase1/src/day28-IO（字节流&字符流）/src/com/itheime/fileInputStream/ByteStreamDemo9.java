package com.itheime.fileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * JDK9:IO流中捕获异常的写法
 */
public class ByteStreamDemo9 {
	public static void main(String[] args) throws FileNotFoundException {
		String inputPath = "/Users/daykalif/Desktop/Java/JavaBase1/src/day28-IO（字节流&字符流）/src/com/itheime/fileInputStream/a.txt";
		String outputPath = "/Users/daykalif/Desktop/Java/JavaBase1/src/day28-IO（字节流&字符流）/src/com/itheime/fileInputStream/b.txt";

		// 1.创建对象
		FileInputStream fis = new FileInputStream(inputPath);
		FileOutputStream fos = new FileOutputStream(outputPath);

		try (fis; fos) {
			// 2.拷贝
			int len;
			byte[] bytes = new byte[1024 * 1024 * 5];
			while ((len = fis.read(bytes)) != -1) {
				fos.write(bytes, 0, len);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
