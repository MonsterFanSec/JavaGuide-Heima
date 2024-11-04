package com.itheime.fileOutputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 字节输出流的细节：
 * 		  1.创建字节输出流对象
 * 				细节1：参数是字符串表示的路径或者是File对象都是可以的
 * 				细节2：如果文件不存在会创建一个新的文件，但是要保证父级路径是存在的。
 * 				细节3：如果文件已经存在，则会清空文件
 * 		  2.写数据
 * 				细节：write方法的参数是整数，但是实际上写到本地文件中的是整数在ASCII上对应的字符
 * 				‘9’
 * 				‘7’
 * 		  3.释放资源
 * 				每次使用完流之后都要释放资源
 * 				如果资源不释放，资源会被占用（如：该文件在windows中无法被删除，提示Java SE正在使用该文件）
 */
public class ByteStreamDemo2 {
	public static void main(String[] args) throws IOException {
		// 1.创建对象
		String parentPath = "/Users/daykalif/Desktop/Java/JavaBase1/src/day28-IO（字节流&字符流）/src/com/itheime/mybytestream1/a.txt";
		FileOutputStream fos = new FileOutputStream(parentPath);

		FileOutputStream fos1 = new FileOutputStream(new File(parentPath));

		// 2.写出数据 97
		fos.write(97);	// "a"
		fos.write(57);	// "9"
		fos.write(55);	// "7"

		// 3.释放资源
		fos.close();
	}
}
