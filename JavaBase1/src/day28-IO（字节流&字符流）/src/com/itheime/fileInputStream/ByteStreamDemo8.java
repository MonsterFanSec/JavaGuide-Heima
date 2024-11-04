package com.itheime.fileInputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *    JDK7:IO流中捕获异常的写法
 *
 *      try后面的小括号中写创建对象的代码，
 *          注意⚠️：只有实现了AutoCloseable接口的类，才能在小括号中创建对象。
 *
 *     try(){
 *
 *     }catch(){
 *
 *     }
 */
public class ByteStreamDemo8 {
	public static void main(String[] args) {
		String inputPath = "/Users/daykalif/Desktop/Java/JavaBase1/src/day28-IO（字节流&字符流）/src/com/itheime/fileInputStream/a.txt";
		String outputPath = "/Users/daykalif/Desktop/Java/JavaBase1/src/day28-IO（字节流&字符流）/src/com/itheime/fileInputStream/b.txt";

		try (
				FileInputStream fis = new FileInputStream(inputPath);
				FileOutputStream fos = new FileOutputStream(outputPath)
		) {
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
