package com.itheime.fileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 演示：字节输出流FileOutputStream
 * 实现需求：写出一段文字到本地文件中。（暂时不写中文）
 *
 * 实现步骤：
 *       创建对象
 *       写出数据
 *       释放资源
 */
public class ByteStreamDemo1 {
	public static void main(String[] args) throws IOException {
		/*
		 * 1.创建对象
		 *
		 * 写出，使用的是输出流：OutputStream
		 * 子类需要操作本地文件：File
		 * 因此结合，需要使用的是：FileOutputStream
		 */
		String parentPath = "/Users/daykalif/Desktop/Java/JavaBase1/src/day28-IO（字节流&字符流）/src/com/itheime/mybytestream1/a.txt";
		FileOutputStream fos = new FileOutputStream(parentPath);

		// 2.写出数据
		fos.write(97);

		// 3.释放资源
		fos.close();
	}
}