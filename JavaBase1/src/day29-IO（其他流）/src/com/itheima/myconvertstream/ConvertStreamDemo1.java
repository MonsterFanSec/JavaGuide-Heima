package com.itheima.myconvertstream;

import java.io.*;
import java.nio.charset.Charset;

/*
 * 利用转换流按照指定字符编码读取(了解)
 * 因为JDK11：这种方式被淘汰了。替代方案(掌握)
 */
public class ConvertStreamDemo1 {
	public static void main(String[] args) throws IOException {
		String path = "/Users/daykalif/Desktop/Java/JavaBase1/src/day29-IO（其他流）/src/com/itheima/myconvertstream/gbkfile.txt";
		// 1.创建对象并指定字符编码
		InputStreamReader isr = new InputStreamReader(new FileInputStream(path), "GBK");
		// 2.读取数据
		int ch;
		while ((ch = isr.read()) != -1) {
			System.out.print((char) ch);
		}
		// 3.释放资源
		isr.close();


		System.out.println("\r\n====================上述方式在JDK11时被淘汰，需要掌握下面的方法=========================");


		FileReader fr = new FileReader(path, Charset.forName("GBK"));
		//2.读取数据
		int ch2;
		while ((ch2 = fr.read()) != -1) {
			System.out.print((char) ch2);
		}
		//3.释放资源
		fr.close();
	}
}
