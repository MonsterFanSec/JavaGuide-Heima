package com.itheima.bigDecima;

import java.math.BigDecimal;

/*
 *	BigDecimal底层存储方式：
 * 		十进制：0.226
 * 		小数部分的二进制：0011100111011011001000101101000011100101011000000100001	（55位）
 *
 * 	总结：
 * 		1.BigDecimal的作用是什么？
 * 			表示较大的小数和解决小数运算精度失真问题。
 * 		2.BigDecimal的对象如何获取？
 * 			BigDecimal bd1 = new BigDecimal("较大的小数");
 * 			BigDecimal bd2 = BigDecimal.valueOf(0.1);
 * 		3.常见操作
 * 			加：add
 * 			减：subtract
 * 			乘：multiply
 * 			除：divide（四舍五入：RoundingMode.HALF_UP）
 */
public class BigDecimalDemo4 {
	public static void main(String[] args) {
		BigDecimal bd1 = new BigDecimal("0.226");
		BigDecimal bd2 = new BigDecimal("123.226");
		BigDecimal bd3 = new BigDecimal("-1.5");
	}
}
