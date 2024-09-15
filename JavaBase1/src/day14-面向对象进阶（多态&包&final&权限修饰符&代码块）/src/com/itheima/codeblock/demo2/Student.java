package com.itheima.codeblock.demo2;

public class Student {
	private String name;
	private int age;

	/*
	 * 构造代码块：
	 *     1.写在成员位置的代码块
	 *     2.作用：可以把多个构造方法中重复的代码抽取出来
	 *     3.执行时机：我们在创建本类对象的时候会先执行构造代码块再执行构造方法
	 *
	 *	构造代码块 渐渐的淘汰了，因为这种方式不够灵活。
	 * 	比如：如果写了构造代码块执行输出语句，但是我在某一个构造时，不想执行这部分代码，就没有办法；这个语句在每次构造的时候都会执行。
	 */
	{
		System.out.println("开始创建对象了");
	}

	public Student() {
		System.out.println("空参构造");
	}

	public Student(String name, int age) {
		System.out.println("有参构造");
		this.name = name;
		this.age = age;
	}

	public Student(String name) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
