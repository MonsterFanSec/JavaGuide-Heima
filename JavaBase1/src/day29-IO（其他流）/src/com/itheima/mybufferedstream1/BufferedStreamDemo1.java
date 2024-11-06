package com.itheima.mybufferedstream1;

import java.io.*;

/*
 * 	字节缓冲流原理：
 * 		底层自带了长度为8192的缓冲区提高性能
 *
 *
 * 	需求：
 *       利用字节缓冲流拷贝文件
 *
 *   字节缓冲输入流的构造方法：
 *           public BufferedInputStream(InputStream is)				把基本流包装成高级流，提高读取数据的性能
 *
 *    字节缓冲输出流的构造方法：
 *           public BufferedOutputStream(OutputStream os)			把基本流包装成高级流，提高写出数据的性能
 */
public class BufferedStreamDemo1 {
	public static void main(String[] args) throws IOException {
		// 1.创建缓冲流的对象
		String path = "/Users/daykalif/Desktop/Java/JavaBase1/src/day29-IO（其他流）/src/com/itheima/mybufferedstream1";
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path + "/a.txt"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(path + "/b.txt"));

		// 2.循环读取并写到目的地
		int b;
		while ((b = bis.read()) != -1) {
			bos.write(b);
		}

		// 3.释放资源（只需要关闭缓冲流，里面的基本流会在缓冲流内部关闭）
		bos.close();
		bis.close();
	}
}
