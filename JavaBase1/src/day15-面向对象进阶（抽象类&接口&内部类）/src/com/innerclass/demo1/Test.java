package com.innerclass.demo1;

/*
 * 	类的五大成员：属性、方法、构造方法、代码块、内部类
 *
 * 	什么是内部类？
 * 	在一个类的里面。再定义一个类。
 * 	举例：在A类的内部定义B类，B类就被称为内部类。
 *
 * public class Outer {    // 外部类
 *		public class Inner {    // 内部类
 *
 *		}
 *	}
 *
 *
 * public class Test {	// 外部其他类
 *		public static void main(String[] args) {
 *
 *		}
 * }
 */

/*
 *	为什么要学习内部类？
 * 	需求：写一个javabean类描述汽车。
 * 	属性：汽车的品牌，车龄，颜色，发动机的品牌，使用年限。
 *
 *
 *  内部类表示的事物是外部类的一部分
 * 	内部类单独出现没有任何意义
 *
 * 	内部类的访问特点：
 * 	- 内部类可以直接访问外部类的成员，包括私有
 * 	- 外部类要访问内部类的成员，必须创建对象
 *
 * 总结：
 * 	1.什么是内部类？
 *		写在一个类里面的类就叫做内部类
 * 	2.什么时候用到内部类？
 * 		B类表示的事物是A类的一部分，且B单独存在没有意义。
 * 		比如：汽车的发动机，ArrayList的迭代器，人的心脏等等。
 */
public class Test {
	public static void main(String[] args) {
		Car c = new Car();
		c.carName = "宾利";
		c.carAge = 1;
		// c.carColor = "粉色";

		c.show();
	}
}