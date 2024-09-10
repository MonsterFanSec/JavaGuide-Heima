package com.itheima.a04staticdemo4;

/*
 * static的注意事项
 * - 静态方法只能访问静态变量和静态方法
 * - 非静态方法可以访问静态变量或者静态方法，也可以访问非静态的成员变量和非静态的成员方法
 * - 静态方法中是没有this关键字
 *
 * 总结：
 * - 静态方法中，只能访问静态。
 * - 非静态方法可以访问所有。
 * - 静态方法中没有this关键字
 */

public class Student {
	String name;
	int age;
	static String teacherName;

	/**
	 * 普通的成员方法（非静态方法），和某一个对象有关系
	 * 普通的成员方法（非静态方法）中，有一个隐含的this。
	 * 这个值不能通过调用者自己赋值，如s1.show("abc")，这个"abc"是不能给到this的
	 * this：当前方法调用者的地址值。
	 * 这个this：是由虚拟机赋值的。
	 */
	public void show1(Student this) {
		System.out.println("this--->" + this);

		// 非静态方法可以访问非静态的成员变量，也可以访问静态变量
		System.out.println(name + "," + age + "," + teacherName);
		System.out.println("这里是加了this的打印：" + this.name + "," + this.age + "," + this.teacherName);

		// 非静态方法可以访问非静态的成员方法
		show2();
		this.show2();

		// 非静态方法可以访问静态方法
		method();
		this.method();
	}

	public void show2() {
		System.out.println("show2");
	}

	/**
	 * 静态方法中没有this关键字
	 * static，静态的，和某一个对象没有关系，是大家共享的
	 * 静态方法只能访问静态变量和静态方法
	 */
	public static void method() {
		// System.out.println(name);	// 报错：静态方法不能调用非静态的成员变量
		// show1();	// 报错：show1的隐含调用方式为this.show1(); 静态方法没有this，因此调用也报错
		System.out.println("静态方法中调用静态变量" + teacherName);
	}
}
