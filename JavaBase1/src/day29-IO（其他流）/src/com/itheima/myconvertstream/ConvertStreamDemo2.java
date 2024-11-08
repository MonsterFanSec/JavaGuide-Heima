package com.itheima.myconvertstream;

import java.io.*;
import java.nio.charset.Charset;

/*
 * 利用转换流按照指定字符编码写出
 */
public class ConvertStreamDemo2 {
	public static void main(String[] args) throws IOException {
		String path = "/Users/daykalif/Desktop/Java/JavaBase1/src/day29-IO（其他流）/src/com/itheima/myconvertstream";
		/*
		// 1.创建转换流的对象
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(path + "/format-gbk.txt"), "GBK");
		// 2.写出数据
		osw.write("你好你好");
		// 3.释放资源
		osw.close();
		*/

		System.out.println("\r\n====================上述方式在JDK11时被淘汰，需要掌握下面的方法=========================");

		FileWriter fw = new FileWriter(path + "/format-gbk.txt", Charset.forName("GBK"));
		fw.write("你好你好");
		fw.close();
	}
}
