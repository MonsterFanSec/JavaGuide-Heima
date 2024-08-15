package com.itheima.test;

public class Test9 {
	public static void main(String[] args) {
		int number = 100;
		System.out.println("调用change方法前：" + number);    // 100
		change(number);
		System.out.println("调用change方法后：" + number);    // 100
		number = change2(number);
		System.out.println("调用change2方法后：" + number);    // 300
	}

	public static void change(int number) {
		number = 200;
	}

	public static int change2(int number) {
		number = 300;
		return number;
	}
}
