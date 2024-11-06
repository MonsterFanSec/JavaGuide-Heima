package com.itheima.mybufferedstream1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 *   字符缓冲输入流：
 *      构造方法：
 *           public BufferedReader(Reader r)
 *      特有方法：
 *           public String readLine()   读取一行数据，如果没有数据可读了，会返回null
 */
public class BufferedStreamDemo3 {
	public static void main(String[] args) throws IOException {
		// 1.创建字符缓冲输入流的对象
		String path = "/Users/daykalif/Desktop/Java/JavaBase1/src/day29-IO（其他流）/src/com/itheima/mybufferedstream1";
		BufferedReader br = new BufferedReader(new FileReader(path + "/a.txt"));

		/*
		 * 2.读取数据
		 *
		 * 细节：
		 * 		readLine方法在读取的时候，一次读一整行，遇到回车换行结束
		 * 		但是他不会把回车换行读到内存当中，所以，如果打印的时候使用的是print，输出会在同一行中展示
		 */
		String line1 = br.readLine();
		System.out.println(line1);

		String line2 = br.readLine();
		System.out.println(line2);
		System.out.println("==================");


		String line;
		while (((line = br.readLine()) != null)) {
			System.out.println(line);
		}


		// 3.释放资源
		br.close();
	}
}
