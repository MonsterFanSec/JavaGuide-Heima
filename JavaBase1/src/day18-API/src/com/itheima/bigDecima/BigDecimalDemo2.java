package com.itheima.bigDecima;

import java.math.BigDecimal;

/*
 *	BigDecimal的作用
 * 	- 用于小数的精确计算
 *  - 用来表示很大的小数
 *
 * 构造方法获取BigDecimal对象
 *      public BigDecimal(double val)
 * 		public BigDecimal(string val)
 * 静态方法获取BigDecimal对象
 *      public static BigDecimal valueOf(double val)
 */
public class BigDecimalDemo2 {
	public static void main(String[] args) {
		// 1.通过传递double类型的小数来创建对象
		// 细节:这种方式有可能是不精确的，所以不建议使用
		BigDecimal bd1 = new BigDecimal(0.01);
		BigDecimal bd2 = new BigDecimal(0.09);

		System.out.println(bd1);
		System.out.println(bd2);


		// 2.通过传递字符串表示的小数来创建对象
		BigDecimal bd3 = new BigDecimal("0.01");
		BigDecimal bd4 = new BigDecimal("0.09");
		BigDecimal bd5 = bd3.add(bd4);
		System.out.println(bd3);
		System.out.println(bd4);
		System.out.println(bd5);

		/*
		 * 3.通过静态方法获取对象
		 * 细节:
		 * 	1.如果要表示的数字不大，没有超出double的取值范围，建议使用静态方法
		 * 	2.如果要表示的数字比较大，超出了double的取值范围，建议使用构造方法
		 * 	3.如果我们传递的是0~10之间的整数，包含0，包含10，那么方法会返回已经创建好的对象，不会重新new
		 */
		BigDecimal bd6 = BigDecimal.valueOf(10);    // 会以10.0参与计算
		BigDecimal bd7 = BigDecimal.valueOf(10);
		System.out.println(bd6);    // 10
		System.out.println(bd6 == bd7);    // true

		BigDecimal bd8 = BigDecimal.valueOf(10.0);
		BigDecimal bd9 = BigDecimal.valueOf(10.0);    // 生成变量名快捷键：command + option + v
		System.out.println(bd8);    // 10.0
		System.out.println(bd8 == bd9);    // false

		System.out.println(bd6 == bd8);    // false
	}
}
