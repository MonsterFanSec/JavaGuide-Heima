package com.itheime.fileInputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *   练习：
 *       文件拷贝
 *       把/xxx/xxx/movie.mp4 (16.8 MB) 拷贝到当前模块下。
 */
public class ByteStreamDemo6 {
	public static void main(String[] args) throws IOException {
		long start = System.currentTimeMillis();

		// 1.创建对象
		String inputPath = "/Users/daykalif/Desktop/Java/JavaBase1/src/day28-IO（字节流&字符流）/src/com/itheime/fileInputStream/a.txt";
		FileInputStream fis = new FileInputStream(inputPath);

		String outputPath = "/Users/daykalif/Desktop/Java/JavaBase1/src/day28-IO（字节流&字符流）/src/com/itheime/fileInputStream/b.txt";
		FileOutputStream fos = new FileOutputStream(outputPath);

		// 2.拷贝
		int len;
		byte[] bytes = new byte[1024 * 1024 * 5];
		while ((len = fis.read(bytes)) != -1) {
			fos.write(bytes, 0, len);    // 读多少就写多少
		}

		// 3.释放资源
		fos.close();
		fis.close();

		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
}
