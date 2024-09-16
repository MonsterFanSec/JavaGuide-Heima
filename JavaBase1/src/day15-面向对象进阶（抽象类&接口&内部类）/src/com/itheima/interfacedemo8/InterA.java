package com.itheima.interfacedemo8;

public interface InterA {
	public default void show6() {
		System.out.println("show6方法开始执行了");
		show3();
		show4();
	}

	// 能被外界直接调用，但是它给外界调用是没有意义的，它本身只是记录了日志，所有我们不希望外界访问它
	public default void show3() {
		System.out.println("记录程序在运行过程中的各种细节，这里有100行代码");
	}

	// 改为普通的私有方法，给默认方法服务的
	private void show4() {
		System.out.println("记录程序在运行过程中的各种细节，这里有100行代码");
	}

	// ------------------------------------------------


	public static void show1() {
		System.out.println("show1方法开始执行了");
		show5();
	}

	public static void show2() {
		System.out.println("show2方法开始执行了");
		show5();
	}

	// 静态的私有方法，给静态方法服务的
	private static void show5() {
		System.out.println("记录程序在运行过程中的各种细节，这里有100行代码");
	}
}
