package com.itheima.bigInteger;

import java.math.BigInteger;

/*
 *	BigInteger底层存储方式：
 * 		1.对于计算机而言，其实是没有数据类型的概念的，都是010101010101.
 * 		2.数据类型是编程语言自己规定的。
 *
 * 	现在有一个整数：27670116110564327424
 * 		转成二进制： 1 ｜ 1000 0000 0000 0000 0000 0000 0000 0000 ｜ 0000 0000 0000 0000 0000 0000 0000 0000	（共65位）
 *  	在Java中，Long类型最多是8个字节，8*8=64（位bit），上面这个数字已经超出了Long的取值范围，那么这个数据用BigInteger是怎么存储的呢？
 *
 * 	BigInteger存储上限：
 * 		存储方式：[1,-2147483648,0]
 *
 * 		数组的最大长度是int的最大值：2147483647
 * 		数组中每一位能表示的数字：-2147483648～2147483647
 *
 * 		数组中最多能存储元素个数：21亿多
 * 		数组中每一位能表示的数字：42亿多
 *
 * 		BigInteger能表示的最大数字为：42亿的21亿次方
 *
 *
 * 	总结：
 * 		1.BigInteger表示一个大整数。
 * 		2.如何获取BigInteger的对象？
 * 			BigInteger b1 = BigInteger.valueOf(0.1);
 * 			BigInteger b1 = BigInteger.valueOf("整数");
 * 		3.常见操作
 * 			加：add
 * 			减：subtract
 * 			乘：multiply
 * 			除：divide、divideAndRemainder
 * 			比较：equals、max、min
 * 			次幂：pow
 * 			转成整数：intValue、longValue
 */
public class Test3 {
	public static void main(String[] args) {
		//	断点调试/debug模式运行代码
		//	作用：查看程序是一步一步如何执行的
		BigInteger bd = new BigInteger("27670116110564327424");
		System.out.println(bd);
	}
}
