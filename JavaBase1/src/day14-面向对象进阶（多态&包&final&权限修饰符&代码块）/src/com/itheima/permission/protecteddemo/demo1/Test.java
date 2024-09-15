package com.itheima.permission.protecteddemo.demo1;

public class Test {
	public static void main(String[] args) {
		Animal a = new Animal();
		System.out.println(a.name);        // 相同包下的无关类，可以获取
	}
}
