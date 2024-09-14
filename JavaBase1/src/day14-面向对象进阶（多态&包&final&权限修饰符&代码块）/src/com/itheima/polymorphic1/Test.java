package com.itheima.polymorphic1;

/*
 * 什么是多态？
 * 		同类型的对象，表现出的不同形态。
 *
 * 多态的表现形式
 * 		父类类型 对象名称 = 子类对象；
 *
 * 多态的前提
 * 		有继承关系
 * 		有父类引用指向子类对象		如：Fu f = new Zi();
 * 		有方法重写
 *
 *
 * 总结：
 * 1.什么是多态？
 * 		对象的多种形态。
 *
 * 2.多态的前提？
 * 		有继承/实现关系
 * 		有父类引用指向子类对象
 * 		有方法重写
 *
 * 3.多态的好处？
 * 		使用父类型作为参数，可以接收所有子类对象，体现多态的扩展性于便利。
 *
 */
public class Test {
	public static void main(String[] args) {
		// 创建三个对象，并调用register方法
		Student s = new Student();
		s.setName("张三");
		s.setAge(18);


		Teacher t = new Teacher();
		t.setName("王建国");
		t.setAge(30);

		Administrator admin = new Administrator();
		admin.setName("管理员");
		admin.setAge(35);


		register(s);
		register(t);
		register(admin);
	}


	// 这个方法既能接收老师，又能接收学生，还能接收管理员
	// 只能把参数写成这三个类型的父类
	public static void register(Person p) {
		p.show();
	}
}
