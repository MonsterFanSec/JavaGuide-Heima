package com.itheima.myprintstream;

import java.io.PrintStream;

/*
 * 打印流的应用场景
 */
public class PrintStreamDemo4 {
	public static void main(String[] args) {
		// 获取打印流的对象，此打印流在虚拟机启动的时候，由虚拟机创建，默认指向控制台
		// 这个流是特殊的打印流，叫做：系统中的标准输出流,是不能关闭，在系统中是唯一的。
		PrintStream ps = System.out;    // 调用静态变量out

		// 调用打印流中的方法println
		// 出数据，自动换行，自动刷新
		ps.println("123");

		// 流关闭之后，后续的都不打印
		ps.close();
		ps.println("你好你好");
		System.out.println("456");
	}
}
