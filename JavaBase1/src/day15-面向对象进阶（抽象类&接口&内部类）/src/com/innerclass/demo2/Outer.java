package com.innerclass.demo2;

public class Outer {
	String name;

	public class Inner {    // 如果权限修饰符为public，则所有地方都能创建内部类的对象
		static int a = 10;    // JDK16开始才可以定义静态变量
	}

	private class Inner1 {    // 如果为private，外界无法创建Inner1的对象
		static int a = 10;
	}

	// 获取成员内部类的方式：外部类编写方法，对外提供内部类对象
	public Inner1 getInstance() {
		return new Inner1();
	}

	class Inner2 {    // 如果没有权限修饰符，只能在本包中使用，无法在外部的包中使用
		static int a = 10;
	}

	protected class Inner3 {    // 如果权限修饰符为protected，则只能在本包中使用，和外部包的子类中使用
		static int a = 10;
	}
}
