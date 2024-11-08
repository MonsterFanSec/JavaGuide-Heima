package com.itheima.myconvertstream;

import java.io.*;
import java.nio.charset.Charset;

/*
 * 将本地文件中的GBK文件，转成UTF-8
 */
public class ConvertStreamDemo3 {
	public static void main(String[] args) throws IOException {
		String path = "/Users/daykalif/Desktop/Java/JavaBase1/src/day29-IO（其他流）/src/com/itheima/myconvertstream";

		/*
		// 1.JDK11以前的方案
		InputStreamReader isr = new InputStreamReader(new FileInputStream(path + "/gbkfile.txt"), "GBK");
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(path + "/formatgbk-to-utf8"), "UTF-8");
		int b;
		while ((b = isr.read()) != -1) {
			osw.write(b);
		}
		osw.close();
		isr.close();
		*/


		//2.替代方案
		FileReader fr = new FileReader(path + "/gbkfile.txt", Charset.forName("GBK"));
		FileWriter fw = new FileWriter(path + "/formatgbk-to-utf8", Charset.forName("UTF-8"));
		int b;
		while ((b = fr.read()) != -1) {
			fw.write(b);
		}
		fw.close();
		fr.close();
	}
}
