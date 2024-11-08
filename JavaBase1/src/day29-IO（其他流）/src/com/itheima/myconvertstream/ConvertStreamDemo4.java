package com.itheima.myconvertstream;

import java.io.*;

/*
 * 利用字节流读取文件中的数据，每次读一整行，而且不能出现乱码
 */
public class ConvertStreamDemo4 {
	public static void main(String[] args) throws IOException {
		String path = "/Users/daykalif/Desktop/Java/JavaBase1/src/day29-IO（其他流）/src/com/itheima/myconvertstream/a.txt";

		FileInputStream fis = new FileInputStream(path);
		InputStreamReader isr = new InputStreamReader(fis);    // 1.字节流在读取中文的时候，是会出现乱码的，但是字符流可以搞定
		BufferedReader br = new BufferedReader(isr);    // 2.字节流里面是没有读一整行的方法的，只有字符缓冲流才能搞定
		String str = br.readLine();
		System.out.println(str);
		br.close();

		System.out.println("==============================================");

		BufferedReader br2 = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
		String line;
		while ((line = br2.readLine()) != null) {
			System.out.println(line);
		}
		br2.close();
	}
}
