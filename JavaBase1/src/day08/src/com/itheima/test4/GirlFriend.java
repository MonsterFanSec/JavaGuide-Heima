package com.itheima.test4;

/**
 *	this关键字总结：
 *		1.就近原则
 *			System.out.println(age)
 *			System.out.println(this.age)
 *
 *		2.this的作用？
 *			可以区别成员变量和局部变量
 *
 *		3.this的本质和内存图
 *			今天的扩展内容会详细讲解
 */

public class GirlFriend {
	private int age;	// 0
	public void method(){
		//int age = 10;
		System.out.println(age);	// 谁离我近，我就用谁
		System.out.println(this.age);
	}
}
