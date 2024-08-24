package com.itheima.demo1;

public class VariableDemo3 {
	public static void main(String[] args) {
		/**
		 * 数据类型 变量名 = 数据值;
		 *
		 * 数据类型：
		 * 	基本数据类型：
		 * 		整数：
		 * 			byte:-128～127
		 * 			short:-32768~32767
		 * 			int【默认】:-2147483648~2147483647（10位数）
		 * 			long:-9223372036854775808~	9223372036854775809（19位数）
		 * 		浮点数：
		 * 			float:-3.401298e-38到3.401298e+38
		 * 			double【默认】:-4.9000000e-324到4.9000000e+308
		 * 		字符：
		 * 			char:0-65535
		 * 		布尔：
		 * 			boolean:true,false
		 * 	引用数据类型：
		 * 		类（Class）
		 * 		接口（Interface）
		 * 		数组（Array）
		 * 	其他数据类型：
		 * 		字符串类型String
		 * 		枚举类型Enum
		 *
		 */

		// byte
		byte b = 10;
		System.out.println(b);    // 10

		// short
		short s = 20;
		System.out.println(s);    // 20

		//	int
		int i = 30;
		System.out.println(i);    // 30

		//	long
		//	注意：如果要定义long类型的变量，在数据值的后面需要加一个L作为后缀；L可以是大写的，也可以是小写的；建议使用大写；
		long n = 9999999999999999L;
		System.out.println(n);

		// float
		// 注意：定义float类型变量的时候，数据值也需要加一个F作为后缀
		float f = 10.1F;
		System.out.println(f);

		//	double
		double d = 20.2;
		System.out.println(d);

		// char
		char c = '中';
		System.out.println(c);

		// boolean
		// true; false;
		boolean o = true;
		System.out.println(o);
	}
}
