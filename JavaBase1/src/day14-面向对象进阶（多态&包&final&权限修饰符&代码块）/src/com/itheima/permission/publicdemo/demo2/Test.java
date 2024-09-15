package com.itheima.permission.publicdemo.demo2;

import com.itheima.permission.publicdemo.demo1.Animal;

public class Test {
	public static void main(String[] args) {
		Animal a = new Animal();
		System.out.println(a.getName());    // 可以获取
		System.out.println(a.name);        // 不同包下的无关类，也可以获取
	}
}
