package com.itheima.bigInteger;

import java.math.BigInteger;

/**
 * public BigInteger add(BigInteger val) 						加法
 * public BigInteger subtract(BigInteger val) 					减法
 * public BigInteger multiply(BigInteger val) 					乘法
 * public BigInteger divide(BigInteger val) 					除法，获取商
 * public BigInteger[] divideAndRemainder(BigInteger val) 		除法，获取商和余数
 * public boolean equals(Object x) 								比较是否相同
 * public BigInteger pow(int exponent) 							次幂
 * public BigInteger max/min(BigInteger val) 					返回较大值/较小值
 * public int intValue(BigInteger val) 							转为int类型整数，超出范围数据有误
 */
public class Test2 {
	public static void main(String[] args) {
		// 1.创建两个BigInteger对象
		BigInteger bd1 = BigInteger.valueOf(10);
		BigInteger bd2 = BigInteger.valueOf(5);

		// 2.加法
		BigInteger bd3 = bd1.add(bd2);
		System.out.println(bd3);    // 15

		// 3.除法，获取商和余数
		BigInteger[] arr = bd1.divideAndRemainder(bd2);
		System.out.println(arr[0]);    // 2
		System.out.println(arr[1]);    // 0

		// 4.比较是否相同
		boolean result = bd1.equals(bd2);
		System.out.println(result);    // false

		// 5.次幂
		BigInteger bd4 = bd1.pow(2);
		System.out.println(bd4);    // 100

		// 6.max
		BigInteger bd5 = bd1.max(bd2);


		// 7.转为int类型整数，超出范围数据有误
		 /*
         BigInteger bd6 = BigInteger.valueOf(2147483648L);
         int i = bd6.intValue();
         System.out.println(i);	// -2147483648
		 */

		BigInteger bd7 = BigInteger.valueOf(2147483647L);
		int j = bd7.intValue();
		System.out.println(j);    // 2147483647

		BigInteger bd8 = BigInteger.valueOf(200);
		double v = bd8.doubleValue();
		System.out.println(v); // 200.0
	}
}
