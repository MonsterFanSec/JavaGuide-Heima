package com.innerclass.demo5;

public class Outer {
	int b = 20;

	public void show() {
		int a = 10;

		// 局部内部类:将内部类定义在方法里面就叫做局部内部类，类似于方法里面的局部变量。
		class Inner {
			String name;
			int age;

			public void method1() {
				System.out.println(a);    // 10
				System.out.println(b);    // 20
				System.out.println("局部内部类中的method1方法");
			}

			public static void method2() {
				System.out.println("局部内部类中的method2静态方法");
			}
		}


		// 创建局部内部类的对象
		Inner i = new Inner();
		System.out.println(i.name);    // null
		System.out.println(i.age);    // 0
		i.method1();
		Inner.method2();
	}
}
