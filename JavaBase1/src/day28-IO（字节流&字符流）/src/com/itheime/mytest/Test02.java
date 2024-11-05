package com.itheime.mytest;

import java.io.*;

/*
 * 为了保证文件的安全性，就需要对原始文件进行加密存储，再使用的时候再对其进行解密处理。
 *             加密原理：
 *                 对原始文件中的每一个字节数据进行更改，然后将更改以后的数据存储到新的文件中。
 *             解密原理：
 *                 读取加密之后的文件，按照加密的规则反向操作，变成原始文件。
 *
 *
 *              ^ : 异或
 *                  两边相同：false,（false是0）
 *                  两边不同：true，（true是1）
 *
 *
 *
 * 				第一次，将数字100进行加密，加密规则为^10。即：System.out.println(100 ^ 10);	// 110
 *						 	其中 100的二进制：1100100
 *								10的二进制:  1010
 *
 *
 * 								1100100	= 100
 *              			  ^ 0001010	= 10
 *              				__________
 *                				1101110	= 110
 *
 *
 * 				 上述加密后，再次解密System.out.println(110 ^ 10); 得到100
 * 				  				1101110	= 110
 *              			  ^ 0001010	= 10
 *              				__________
 *                				1100100 	= 100
 */
public class Test02 {
	public static void main(String[] args) throws IOException {
		System.out.println(true ^ true);    // false
		System.out.println(false ^ false);    // false
		System.out.println(true ^ false);    // true
		System.out.println(100 ^ 10);    // 110
		System.out.println(110 ^ 10);    // 100

		// 读取原始文件
		String src = "/Users/daykalif/Desktop/Java/JavaBase1/src/day28-IO（字节流&字符流）/src/com/itheime/mytest/aaa/a.txt";
		File srcFile = new File(src);

		// 将原始文件/aaa/a.txt加密保存到/bbb/a.txt中
		String dest = "/Users/daykalif/Desktop/Java/JavaBase1/src/day28-IO（字节流&字符流）/src/com/itheime/mytest/bbb/a.txt";
		File destFile = new File(dest);
		encryptionAndReduction(srcFile, destFile);

		// 将加密文件/bbb/a.txt解密保存到/bbb/redu-a.txt中
		String reduDest = "/Users/daykalif/Desktop/Java/JavaBase1/src/day28-IO（字节流&字符流）/src/com/itheime/mytest/bbb/redu-a.txt";
		File reduFile = new File(reduDest);
		encryptionAndReduction(destFile, reduFile);
	}


	public static void encryptionAndReduction(File src, File dest) throws IOException {
		FileInputStream fis = new FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(dest);
		int b;
		while ((b = fis.read()) != -1) {
			// fos.write(b);    // 标准的拷贝
			fos.write(b ^ 2);    // 通过异或加密
		}
		// 4.释放资源
		fos.close();
		fis.close();
	}
}
