package demo1;

public class ValueDemo2 {
	public static void main(String[] args) {
		// 熟悉制表符的基本用法：
		// 在打印的时候，把前面的字符串的长度补齐到8，或者8的整数倍。最少补1个空格，最多补8个空格。
		System.out.println("name" + '\t' + "age");
		System.out.println("tom" + '\t' + "23");


		/* 变量 */
		// 1.基本用法
		int a = 10;
		System.out.println(a);  // 10
		System.out.println(a);  // 10
		System.out.println(a);  // 10

		// 2.变量参与计算
		int b = 30;
		int c = 20;
		System.out.println(b + c);  // 20

		// 3.修改变量记录的值
		a = 50;
		System.out.println(a);  // 50

		// 注意事项
		// 在一条语句中，可以定义多个变量
		int d = 100, e = 200, f = 300;
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);

		// 变量在使用之前必须要赋值
		int g;
		g = 500;
		System.out.println(g);

		// 建议：以后在定义变量的时候，请直接赋值，不要把赋值分开写。
		int h = 600;
		System.out.println(h);

		// 十进制：由0～9组成，前面不加任何前缀
		System.out.println(17);
		// 八进制：由0～7组成，代码以0开头
		System.out.println(017);
		// 二进制：由0和1组成，代码以0b开头
		//System.out.println(0b123);	// 语法错误，二进制中没有3
		// 十六进制：由0～9还有a~f组成，代码以0x开头
		System.out.println(0x123);
	}
}