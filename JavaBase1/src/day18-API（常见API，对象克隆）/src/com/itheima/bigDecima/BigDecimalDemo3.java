package com.itheima.bigDecima;

import java.math.BigDecimal;
import java.math.RoundingMode;

/*
 * public BigDecimal add(BigDecimal val)                                    加法
 * public BigDecimal subtract(BigDecimal val)                               减法
 * public BigDecimal multiply(BigDecimal val)                               乘法
 * public BigDecimal divide(BigDecimal val)                                 除法
 * public BigDecimal divide(BigDecimal val，精确几位，舍入模式)                除法
 */
public class BigDecimalDemo3 {
	public static void main(String[] args) {
		//1.加法
		BigDecimal bd1 = BigDecimal.valueOf(10.0);
		BigDecimal bd2 = BigDecimal.valueOf(2.0);
		BigDecimal bd3 = bd1.add(bd2);
		System.out.println(bd3);    // 12.0

		//2.减法
		BigDecimal bd4 = bd1.subtract(bd2);
		System.out.println(bd4);    // 8.0

		//3.乘法
		BigDecimal bd5 = bd1.multiply(bd2);
		System.out.println(bd5);    // 20.00

		//4.除法
		BigDecimal bd6 = bd1.divide(bd2);
		System.out.println(bd6);    // 5

		BigDecimal bd7 = bd1.divide(bd2, 3, BigDecimal.ROUND_HALF_UP);    // 老版的四舍五入写法，不建议使用
		System.out.println(bd7);    // 5.000

		BigDecimal bd8 = bd1.divide(bd2, 3, RoundingMode.HALF_UP);    // 新版的四舍五入写法
		System.out.println(bd8);    // 5.000
	}
}
