package com.itheima.mybufferedstream1;

import java.io.*;

/*
 * 	字节缓冲流原理：
 * 		底层自带了长度为8192的缓冲区提高性能
 *
 *
 * 	需求：
 *       利用字节缓冲流拷贝文件（一次读写多个字节）
 *
 *   字节缓冲输入流的构造方法：
 *           public BufferedInputStream(InputStream is)				把基本流包装成高级流，提高读取数据的性能
 *
 *    字节缓冲输出流的构造方法：
 *           public BufferedOutputStream(OutputStream os)			把基本流包装成高级流，提高写出数据的性能
 */
public class BufferedStreamDemo2 {
	public static void main(String[] args) throws IOException {
		// 1.创建缓冲流的对象
		String path = "/Users/daykalif/Desktop/Java/JavaBase1/src/day29-IO（其他流）/src/com/itheima/mybufferedstream1";
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path + "/a.txt"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path + "/b.txt"));

		// 2.拷贝（一次读写多个字节）
		byte[] bytes = new byte[1024];    // 一次读写1024个字节
		int len;
		while ((len = bis.read(bytes)) != -1) {
			bos.write(bytes, 0, len);
		}

		// 3.释放资源
		bos.close();
		bis.close();
	}
}
