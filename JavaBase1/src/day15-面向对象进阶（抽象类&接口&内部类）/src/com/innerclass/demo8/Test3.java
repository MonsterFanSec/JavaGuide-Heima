package com.innerclass.demo8;

import com.innerclass.demo2.Outer;

public class Test3 {
	// 如果写在了这个成员位置，则这是一个没有名字的“成员内部类”
	static Swim s = new Swim() {
		@Override
		public void swim() {
			System.out.println("重写之后游泳方法");
		}
	};

	public static void main(String[] args) {
		s.swim();
	}
}
