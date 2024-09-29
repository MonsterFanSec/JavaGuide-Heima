package com.itheima.Integer;

/*
 * 在JDK5的时候提出了一个机制:自动装箱和自动拆箱
 *  - 自动装箱:把基本数据类型会自动的变成其对应的包装类
 *  - 自动拆箱:把包装类自动的变成其对象的基本数据类型
 *
 * 总结：
 * 	1.什么是包装类？
 * 		基本数据类型对应的对象
 * 	2.JDK5以后对包装类新增了什么特性？
 * 		自动装箱、自动拆箱
 * 	3.我们以后如何获取包装类对象？
 * 		不需要new。不需要调用方法，直接赋值即可。
 *
 * 		Integer i1 = 10;
 * 		Integer i2 = 20;
 * 		Integer i3 = i1 + i2;
 */
public class A03_IntegerDemo3 {
	public static void main(String[] args) {
		// 自动装箱的动作
		Integer i1 = 10;    // 在底层，此时还会去自动调用静态方法valueOf得到一个Integer对象，只不过这个动作不需要我们自己去操作了

		Integer i2 = new Integer(10);
		// 自动拆箱的动作
		int i = i2;

		// 结论：在JDK5以后，int和Integer可以看做是同一个东西，因为在内部可以自动转化。
	}
}
