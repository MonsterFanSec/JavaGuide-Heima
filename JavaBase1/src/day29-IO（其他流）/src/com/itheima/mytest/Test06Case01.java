package com.itheima.mytest;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * 需求：把《出师表》的文章顺序进行恢复到一个新文件中。
 */
public class Test06Case01 {
	public static void main(String[] args) throws IOException {
		// 1.读取数据
		String path = "/Users/daykalif/Desktop/Java/JavaBase1/src/day29-IO（其他流）/src/com/itheima/mytest";
		BufferedReader br = new BufferedReader(new FileReader(path + "/csb.txt"));
		String line;
		ArrayList<String> list = new ArrayList<>();
		while ((line = br.readLine()) != null) {
			list.add(line);
		}
		br.close();

		// 2.排序（排序规则：按照每一行前面的序号进行排列）
		Collections.sort(list, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// 获取o1和o2的序号
				int i1 = Integer.parseInt(o1.split("\\.")[0]);
				int i2 = Integer.parseInt(o2.split("\\.")[0]);
				return i1 - i2;
			}
		});

		// 3.写出
		BufferedWriter bw = new BufferedWriter(new FileWriter(path + "/result.txt"));
		for (String str : list) {
			bw.write(str);
			bw.newLine();    // 跨平台的换行
		}
		bw.close();
	}
}
