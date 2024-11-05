package com.itheime.mychartStream;

import java.io.FileWriter;
import java.io.IOException;

/*
 * flush和close方法
 *
 * public void flush()                  将缓冲区中的数据，刷新到本地文件中
 * public void close()                  释放资源/关流
 *
 *
 * 如何让内容存到目的地文件中？
 * 	1.flush刷新：刷新之后，还可以继续往文件中写出数据
 * 	2.close关流：断开通道，无法再往文件中写出数据
 * 	3.缓冲区满了
 */
public class CharStreamDemo5 {
	public static void main(String[] args) throws IOException {
		String writerPath = "/Users/daykalif/Desktop/Java/JavaBase1/src/day28-IO（字节流&字符流）/src/com/itheime/mychartStream/b.txt";
		FileWriter fw = new FileWriter(writerPath);

		fw.write("我的同学各个都很厉害1");
		fw.write("说话声音很好听2");

		fw.flush();

		fw.write("都是人才3");
		fw.write("超爱这里哟4");

		fw.close();
		fw.write("B站5");	// 报错 Exception in thread "main" java.io.IOException: Stream closed
	}
}
