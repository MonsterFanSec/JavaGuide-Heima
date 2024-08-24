package com.itheima.test4;

/**
 * private 关键字
 * 	1.是一个权限修饰符
 * 	2.可以修饰成员（成员变量和成员方法）
 * 	3.被private修饰的成员只能在本类中才能访问
 * 	4.针对private修饰的成员变量，如果需要被其他类使用，提供相应的操作
 * 	5.提供“setXxx(参数)”方法，用于给成员变量赋值，方法用public修饰
 * 	6.提供“getXxx()”方法，用于获取成员变量的值，方法用public修饰
 */

public class GirlFriend1 {
	//属性
	private String name;
	private int age;
	private String gender;


	//针对于每一个私有化的成员变量，都要提供get和set方法
	//set方法：给成员变量赋值
	//get方法：对外提供成员变量的值

	//作用：给成员变量name进行赋值的
	public void setName(String name) {
		//局部变量表示测试类中调用方法传递过来的数据
		//等号的左边：就表示成员位置的name
		this.name = name;
	}

	//作用：对外提供name属性的
	public String getName() {
		return name;
	}


	//age
	//setAge:给成员变量age进行赋值的
	//getAge：对外提供成员变量age的值
	public void setAge(int age) {
		if (age >= 18 && age <= 50) {
			this.age = age;
		} else {
			System.out.println("非法参数");
		}
	}

	public int getAge() {
		return age;
	}


	//gender
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}


	//行为
	public void sleep() {
		System.out.println("女朋友在睡觉");
	}

	public void eat() {
		System.out.println("女朋友在吃饭");
	}
}
