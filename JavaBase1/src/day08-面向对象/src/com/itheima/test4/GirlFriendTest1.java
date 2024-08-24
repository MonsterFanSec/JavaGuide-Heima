package com.itheima.test4;

public class GirlFriendTest1 {
	public static void main(String[] args) {
		//创建女朋友的对象
		GirlFriend1 gf1 = new GirlFriend1();
		//赋值
		gf1.setName("小诗诗");
		gf1.setAge(18);
		gf1.setGender("女");

		System.out.println(gf1.getName());
		System.out.println(gf1.getAge());
		System.out.println(gf1.getGender());

		gf1.eat();
		gf1.sleep();
	}
}
