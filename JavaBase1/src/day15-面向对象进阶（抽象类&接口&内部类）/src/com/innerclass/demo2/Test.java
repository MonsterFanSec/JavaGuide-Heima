package com.innerclass.demo2;

/*
 *	内部类的分类：
 * 		成员内部类（了解）:写在成员位置的，属于外部类的成员。
 * 			- 成员内部类的代码如何书写
 * 			- 如何创建成员内部类的对象
 * 			- 成员内部类如何获取外部类的成员变量
 * 		静态内部类（了解）
 * 		局部内部类（了解）
 * 		匿名内部类（掌握）
 *
 * 	总结：
 * 		1.内部类的分类？
 * 			成员内部类、静态内部类、局部内部类、匿名内部类。
 * 		2.什么是成员内部类？
 * 			写在成员位置的，属于外部类的成员。
 * 		3.获取成员内部类对象的两种方式？
 * 			方式一：当成员内部类被private修饰时。
 * 				   在外部类编写方法，对外提供内部类对象。
 * 			方式二：当成员内部类被非私有修饰时，直接创建对象。
 * 				   Outer.Inner oi = new Outer().new Inner();
 * 		4.外部类成员变量和内部类成员变量重名时，在内部类如何访问？
 * 			System.out.println(Outer.this.变量名);
 */

/*
 编写成员内部类的注意点（即成员内部类的代码如何书写）：
	 1.成员内部类可以被一些修饰符所修饰，比如： private，默认，protected，public，static等
	 2.在成员内部类里面，JDK16之前不能定义静态变量，JDK16开始才可以定义静态变量。

 获取成员内部类对象的两种方式（即如何创建成员内部类的对象）：
	 方式一：外部类编写方法，对外提供内部类对象（一般在内部类设为private时，会采用方式一）

	 方式二：直接创建（一般在内部类不设为private时，如：protected时，会采用方式二）
	 格式：外部类名.内部类名 对象名 = 外部类对象.内部类对象;
	 范例：Outer.Inner oi = new Outer().new Inner();
 */
public class Test {
	public static void main(String[] args) {
		// 创建对象的方式：类名 对象名 = new 类名（）；
		// Student s = new Student();

		// 我要创建的是谁的对象？-- 内部类的对象

		// 方式一：
		// Outer.Inner1 oi1 = new Outer().new Inner1();	// 报错，因为Inner1为private
		Outer o = new Outer();
		System.out.println(o.getInstance());

		// 方式二：
		Outer.Inner oi = new Outer().new Inner();
		System.out.println(oi);    // com.innerclass.demo2.Outer$Inner@5ca881b5，用$表示的内部类
		System.out.println(oi.a);
	}
}
