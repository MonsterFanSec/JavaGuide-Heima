package com.itheima.permission.publicdemo.demo2;


import com.itheima.permission.publicdemo.demo1.Animal;

public class Dog extends Animal {
	public void show() {
		System.out.println(getName());    // 可以获取
		System.out.println(name);    // 不同包下的子类，也可以获取
	}
}
