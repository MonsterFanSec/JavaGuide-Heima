package com.itheima.bigInteger;

import java.math.BigInteger;
import java.util.Random;

/*
 *	BigInteger:
 * 		在Java中，整数有四种类型：byte，short，int，long。
 * 		在底层占用字节个数：byte1个字节、short2个字节、int4个字节、long8个字节。
 *
 * long8个字节举例：
 * 		二进制：01111111 11111111 11111111 11111111 11111111 11111111 11111111 11111111	（第一个字节0表示符号位：0表示正数，1表示负数）
 * 		十进制：9223372036854775807
 *
 * BigInteger构造方法：
 * 		public BigInteger(int num, Random rnd) 			获取随机大整数，范围:[0 ~ 2的num次方-1]
 * 		public BigInteger(String val) 					获取指定的大整数
 * 		public BigInteger(String val, int radix) 		获取指定进制的大整数
 *
 * 		public static BigInteger valueOf(long val) 		静态方法获取BigInteger的对象，内部有优化
 *
 * 		细节：对象一旦创建里面的数据不能发生改变。
 *
 *
 * 总结：
 * 		1.如果BigInteger表示的数字没有超出long的范围，可以用静态方法获取。
 * 		2.如果BigInteger表示的超出long的范围，可以用构造方法获取。
 * 		3.对象一旦创建，BigInteger内部记录的值不能发生改变。
 * 		4.只要进行计算都会产生一个新的BigInteger对象
 */
public class Test1 {
	public static void main(String[] args) {
		// 1.获取一个随机的大整数
		Random r = new Random();
		BigInteger bd1 = new BigInteger(4, r);    // [0 ~ 2^4 - 1]
		System.out.println(bd1);    //	[0 ~ 15]


		// 2.获取一个指定的大整数，可以超出long的取值范围
		BigInteger bd2 = new BigInteger("100");
		System.out.println(bd2);

		/*
		BigInteger bd3 = new BigInteger("1.1");        // 细节:字符串中必须是整数，否则会报错
		System.out.println(bd3);

		BigInteger bd4 = new BigInteger("abc");        // 细节:字符串中必须是整数，否则会报错
		System.out.println(bd4);
		*/


		/*
		 * 3.获取指定进制的大整数
		 *
		 * 细节:
		 *  a.字符串中的数字必须是整数
		 * 	b.字符串中的数字必须要跟进制吻合。（比如二进制中，那么只能写0和1，写其他的就报错）
		 */
		BigInteger bd5 = new BigInteger("1", 2);
		System.out.println(bd5);

		/*
		BigInteger bd6 = new BigInteger("123", 2);
		System.out.println(bd6);
		*/


		/*
		 * 4.静态方法获取BigInteger的对象，内部有优化
		 *
		 * 细节:
		 * 		1.能表示范围比较小，只能在long的取值范围之内，如果超出long的范围就不行了。
		 * 		2.在内部对常用的数字: -16 ~ 16 进行了优化。
		 *			提前把-16~16 先创建好BigInteger的对象，如果多次获取不会重新创建新的。
		 */
		System.out.println(Long.MAX_VALUE);        // 9223372036854775807

		BigInteger bd7 = BigInteger.valueOf(9223372036854775807L);    // valueOf默认是int类型，所有大整数需要加L
		System.out.println(bd7);

		// BigInteger bd8 = BigInteger.valueOf(9223372036854775808L);    // 报错
		// System.out.println(bd8);

		BigInteger bd9 = new BigInteger("9223372036854775808");    // 正确
		System.out.println(bd9);

		System.out.println("============================================");

		BigInteger bd10 = BigInteger.valueOf(16);
		BigInteger bd11 = BigInteger.valueOf(16);
		System.out.println(bd10 == bd11);    // true


		BigInteger bd12 = BigInteger.valueOf(17);
		BigInteger bd13 = BigInteger.valueOf(17);
		System.out.println(bd12 == bd13);    // false


		// 5.对象一旦创建内部的数据不能发生改变
		BigInteger bd14 = BigInteger.valueOf(1);
		BigInteger bd15 = BigInteger.valueOf(2);
		// 此时，不会修改参与计算的BigInteger对象中的值，而是产生了一个新的BigInteger对象记录
		BigInteger result = bd14.add(bd15);
		System.out.println(result);    // 3
	}
}
