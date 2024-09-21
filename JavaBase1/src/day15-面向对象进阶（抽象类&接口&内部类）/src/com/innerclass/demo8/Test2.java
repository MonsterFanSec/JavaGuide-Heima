package com.innerclass.demo8;

public class Test2 {
	public static void main(String[] args) {
		/*
		 *	回顾一下匿名内部类的格式:
		 *		new 类/接口(){
		 *  		重写的方法;
		 *  	}
		 */

		new Swim() {
			@Override
			public void swim() {
				System.out.println("重写之后游泳方法");
			}
		}.swim();
	}
}
