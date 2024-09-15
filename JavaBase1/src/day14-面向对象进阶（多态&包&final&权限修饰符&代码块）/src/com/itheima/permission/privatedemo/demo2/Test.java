package com.itheima.permission.privatedemo.demo2;

import com.itheima.permission.privatedemo.demo1.Animal;

public class Test {
	public static void main(String[] args) {
		Animal a = new Animal();
		System.out.println(a.getName());    // 可以获取
		// System.out.println(a.name);        // 报错
	}
}
