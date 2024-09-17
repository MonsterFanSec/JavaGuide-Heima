package com.innerclass.demo4;

public class Outer {
	int a = 10;
	static int b = 20;

	//静态内部类
	static class Inner {
		public void show1() {
			// 静态内部类只能访问外部类中的静态变量和静态方法，如果想要访问非静态的需要创建对象。
			Outer o = new Outer();
			System.out.println(o.a);
			System.out.println(b);

			System.out.println("非静态的方法被调用了");
		}

		public static void show2() {
			// 静态内部类只能访问外部类中的静态变量和静态方法，如果想要访问非静态的需要创建对象。
			Outer o = new Outer();
			System.out.println(o.a);
			System.out.println(b);

			System.out.println("静态的方法被调用了");
		}
	}
}