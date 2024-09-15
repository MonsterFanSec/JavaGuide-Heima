package com.itheima.permission.defaultdemo.demo2;


import com.itheima.permission.defaultdemo.demo1.Animal;

public class Dog extends Animal {
	public void show() {
		System.out.println(getName());    // 可以获取
		// System.out.println(name);    // 报错
	}
}
