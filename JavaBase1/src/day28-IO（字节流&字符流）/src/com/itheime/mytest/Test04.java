package com.itheime.mytest;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/*
 * 文本文件中有以下的数据：
 *      2-1-9-4-7-8
 * 将文件中的数据进行排序，变成以下的数据：
 *      1-2-4-7-8-9
 *
 *
 * 细节1：文件中的数据不要换行（因为换行的话，文件中会有隐藏的\r\n，此时split后排序会异常）
 * 细节2: txt文件可能会有隐含的bom头，记录了文件信息，如文件的字符编码；默认的utf-8保存的文件不会存在bom头；idea创建的txt文件也不含bom头
 */
public class Test04 {
	public static void main(String[] args) throws IOException {
		// 1.读取数据
		String readerPath = "/Users/daykalif/Desktop/Java/JavaBase1/src/day28-IO（字节流&字符流）/src/com/itheime/mytest/eee/a.txt";
		FileReader fr = new FileReader(readerPath);
		StringBuilder sb = new StringBuilder();

		int ch;
		while ((ch = fr.read()) != -1) {
			sb.append((char) ch);
		}
		fr.close();
		System.out.println(sb);

		// 2.排序
		Integer[] arr = Arrays.stream(
				sb.toString().split("-")
		).map(Integer::parseInt).sorted().toArray(Integer[]::new);
		System.out.println(Arrays.toString(arr));

		// 3.写出
		String writerPath = "/Users/daykalif/Desktop/Java/JavaBase1/src/day28-IO（字节流&字符流）/src/com/itheime/mytest/eee/b.txt";
		FileWriter fw = new FileWriter(writerPath);
		String s = Arrays.toString(arr).replace(", ", "-");    // [1, 2, 4, 7, 8, 9]
		String result = s.substring(1, s.length() - 1);    // 去掉首尾的[]
		fw.write(result);
		fw.close();
	}
}