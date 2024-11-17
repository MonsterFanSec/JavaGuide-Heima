package com.itheima.myprintstream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * 字符打印流：
 *      构造方法
 *              public PrintWriter(Write/File/String)            关联字节输出流/文件/文件路径
 *              public PrintWriter(String fileName, Charset charset)    指定字符编码
 *              public PrintWriter(Write, boolean autoFlush)  自动刷新
 *              public PrintWriter(Write out, boolean autoFlush, String encoding)    指定字符编码且自动刷新
 *
 * 				【字符流底层有缓冲区，想要自动刷新需要开启】
 *      成员方法
 *              public void write(int b)            常规方法：规则跟之前一样，将指定的字节写出
 *              public void println(Xxx xx)         特有方法：打印任意数据，自动刷新，自动换行
 *              public void print(Xxx xx)           特有方法：打印任意数据，不换行
 *              public void printf(String format, Object... args)   特有方法：带有占位符的打印语句，不换行
 */
public class PrintStreamDemo3 {
	public static void main(String[] args) throws IOException {
		// 1.创建字符打印流的对象
		String path = "/Users/daykalif/Desktop/Java/JavaBase1/src/day29-IO（其他流）/src/com/itheima/myprintstream/c.txt";
		PrintWriter pw = new PrintWriter(new FileWriter(path), true);

		// 2.写出数据
		pw.println("今天你终于叫我名字了，虽然叫错了，但是没关系，我马上改");
		pw.print("你好你好");
		pw.printf("%s爱上了%s", "阿珍", "阿强");

		// 3.释放资源
		pw.close();
	}
}
