package com.itheima.mybufferedstream1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 *
 *    字符缓冲输出流
 *      构造方法：
 *           public BufferedWriter(Writer r)
 * 					如果文件存在，则清空；如果希望不清空，则需要加续写开关
 * 					如果不文件存在，则创建，但需要保证父级路径存在
 *
 *      特有方法：
 *           public void newLine()      跨平台的换行
 * 					Mac：\r
 * 					Linux：\n
 * 					Windows：\r\n
 */
public class BufferedStreamDemo4 {
	public static void main(String[] args) throws IOException {
		// 1.创建字符缓冲输出流的对象
		String path = "/Users/daykalif/Desktop/Java/JavaBase1/src/day29-IO（其他流）/src/com/itheima/mybufferedstream1";
		BufferedWriter bw = new BufferedWriter(new FileWriter(path + "/b.txt", true));

		// 2.写出数据
		bw.write("你嘴角上扬的样子，百度搜索不到");
		bw.newLine();
		bw.write("456");
		bw.newLine();

		// 3.释放资源
		bw.close();
	}
}
