package com.itheime.fileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
 * 换行写：
 *      再次写出一个换行符就可以了
 *      windows： \r\n
 *      Linux:    \n
 *      Mac:      \r
 *
 * 细节：
 *      在windows操作系统当中，java对回车换行进行了优化。
 *      虽然完整的是\r\n，但是我们写其中一个\r或者\n，
 *      java也可以实现换行，因为java在底层会补全。
 * 建议：
 *      不要省略，还是写全了。
 *
 *
 * 续写：
 *      如果想要续写，打开续写开关即可
 *      开关位置：创建对象的第二个参数
 *      默认false：表示关闭续写，此时创建对象会清空文件
 *      手动传递true：表示打开续写，此时创建对象不会清空文件
 *
 */
public class ByteStreamDemo4 {
	public static void main(String[] args) throws IOException {
		// 1.创建对象
		String parentPath = "/Users/daykalif/Desktop/Java/JavaBase1/src/day28-IO（字节流&字符流）/src/com/itheime/mybytestream1/a.txt";
		FileOutputStream fos = new FileOutputStream(parentPath, true);	// true：续写

		// 2.写出数据
		String str = "kankelaoyezuishuai";
		byte[] bytes1 = str.getBytes();
		System.out.println(Arrays.toString(bytes1));
		fos.write(bytes1);

		// 再次写出一个换行符就可以了
		String wrap = "\r";
		byte[] bytes2 = wrap.getBytes();
		fos.write(bytes2);

		String str2 = "666";
		byte[] bytes3 = str2.getBytes();
		fos.write(bytes3);

		// 3.释放资源
		fos.close();
	}
}
