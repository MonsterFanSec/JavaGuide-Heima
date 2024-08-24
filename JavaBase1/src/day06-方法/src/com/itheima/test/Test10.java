package com.itheima.test;

public class Test10 {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30};
		System.out.println("调用change方法前：" + arr[1]);    // 20
		change(arr);
		System.out.println("调用change方法后：" + arr[1]);    // 200
	}

	public static void change(int[] arr) {    // 调用函数时赋值了一个地址值
		arr[1] = 200;
	}
}
