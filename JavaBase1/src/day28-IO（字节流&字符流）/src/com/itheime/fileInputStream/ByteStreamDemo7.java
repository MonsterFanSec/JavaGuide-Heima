package com.itheime.fileInputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 利用try...catch...finally捕获拷贝文件中代码出现的异常
 *
 * 被finally控制的语句一定会执行，除非JVM退出
 */
public class ByteStreamDemo7 {
	public static void main(String[] args) {
		// 1.创建对象
		FileInputStream fis = null;
		FileOutputStream fos = null;
		String inputPath = "/Users/daykalif/Desktop/Java/JavaBase1/src/day28-IO（字节流&字符流）/src/com/itheime/fileInputStream/a.txt";
		String outputPath = "/Users/daykalif/Desktop/Java/JavaBase1/src/day28-IO（字节流&字符流）/src/com/itheime/fileInputStream/b.txt";

		// try...catch...finally快捷键：选中代码块 + command + option + T
		try {
			fis = new FileInputStream(inputPath);
			fos = new FileOutputStream(outputPath);

			// 2.拷贝
			int len;
			byte[] bytes = new byte[1024 * 1024 * 5];
			while ((len = fis.read(bytes)) != -1) {
				fos.write(bytes, 0, len);
			}
		} catch (IOException e) {
			// e.printStackTrace();
		} finally {
			// 3.释放资源
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
