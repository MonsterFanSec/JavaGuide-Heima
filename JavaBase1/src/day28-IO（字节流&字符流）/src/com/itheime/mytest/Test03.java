package com.itheime.mytest;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/*
 * 文本文件中有以下的数据：
 *      2-1-9-4-7-8
 * 将文件中的数据进行排序，变成以下的数据：
 *      1-2-4-7-8-9
 */
public class Test03 {
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
		String str = sb.toString();
		String[] arrStr = str.split("-");   // 2-1-9-4-7-8

		ArrayList<Integer> list = new ArrayList<>();
		for (String s : arrStr) {
			int i = Integer.parseInt(s);
			list.add(i);
		}
		Collections.sort(list);
		System.out.println(list);


		// 3.写出
		String writerPath = "/Users/daykalif/Desktop/Java/JavaBase1/src/day28-IO（字节流&字符流）/src/com/itheime/mytest/eee/b.txt";
		FileWriter fw = new FileWriter(writerPath);
		for (int i = 0; i < list.size(); i++) {
			if (i == list.size() - 1) {
				fw.write(list.get(i) + "");    // fw.write(97)，记录的是"a",所以要变成字符串类型
			} else {
				fw.write(list.get(i) + "-");
			}
		}
		fw.close();
	}
}