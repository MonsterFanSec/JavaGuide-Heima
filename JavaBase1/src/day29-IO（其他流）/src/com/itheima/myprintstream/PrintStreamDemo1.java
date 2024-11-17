package com.itheima.myprintstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.Charset;

/*
 * 字节打印流：
 *      构造方法
 *              public PrintStream(OutputStream/File/String)            关联字节输出流/文件/文件路径
 *              public PrintStream(String fileName, Charset charset)    指定字符编码
 *              public PrintStream(OutputStream out, boolean autoFlush)  自动刷新
 *              public PrintStream(OutputStream out, boolean autoFlush, String encoding)    指定字符编码且自动刷新
 *
 * 				【字节流底层没有缓冲区，开不开自动刷新都一样】
 *
 *      成员方法
 *              public void write(int b)            常规方法：规则跟之前一样，将指定的字节写出
 *
 * 				【特有方法，可以实现数据原样写出】
 *              public void println(Xxx xx)         特有方法：打印任意数据，自动刷新，自动换行
 *              public void print(Xxx xx)           特有方法：打印任意数据，不换行
 *              public void printf(String format, Object... args)   特有方法：带有占位符的打印语句，不换行
 */
public class PrintStreamDemo1 {
	public static void main(String[] args) throws FileNotFoundException {
		// 1.创建字节打印流的对象
		String path = "/Users/daykalif/Desktop/Java/JavaBase1/src/day29-IO（其他流）/src/com/itheima/myprintstream/a.txt";
		PrintStream ps = new PrintStream(new FileOutputStream(path), true, Charset.forName("UTF-8"));

		// 2.写出数据
		ps.println(97);    // 写出 + 自动刷新 + 自动换行
		ps.print(true);
		ps.println();
		ps.printf("%s爱上了%s", "阿珍", "阿强");

		// 3.释放资源
		ps.close();
	}
}