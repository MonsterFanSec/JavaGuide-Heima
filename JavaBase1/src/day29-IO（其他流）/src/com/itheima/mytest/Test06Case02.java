package com.itheima.mytest;

import java.io.*;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * 需求：把《出师表》的文章顺序进行恢复到一个新文件中。
 */
public class Test06Case02 {
	public static void main(String[] args) throws IOException {
		// 1.读取数据
		String path = "/Users/daykalif/Desktop/Java/JavaBase1/src/day29-IO（其他流）/src/com/itheima/mytest";
		BufferedReader br = new BufferedReader(new FileReader(path + "/csb.txt"));

		String line;
		TreeMap<Integer, String> tm = new TreeMap<>();    // Tree可以对集合进行排序
		while ((line = br.readLine()) != null) {
			String[] arr = line.split("\\.");
			// 0：序号  1 ：内容
			tm.put(Integer.parseInt(arr[0]), line);
		}
		br.close();


		// 2.写出数据
		BufferedWriter bw = new BufferedWriter(new FileWriter(path + "/result2.txt"));
		Set<Map.Entry<Integer, String>> entries = tm.entrySet();
		for (Map.Entry<Integer, String> entry : entries) {
			String value = entry.getValue();
			bw.write(value);
			bw.newLine();
		}
		bw.close();
	}
}
