package com.itheima.interfacedemo1;

/*
 *	接口的定义和使用：
 * 		- 接口用关键字interface来定义
 * 			public interface 接口名{}
 * 		- 接口不能实例化
 * 		- 接口和类之间是实现关系，通过implements关键字表示
 * 			public class 类名 implements 接口名{}
 * 		- 接口的子类（实现类）
 * 			要么重写接口中的所有抽象方法
 * 			要么是抽象类
 *
 * 	注意1:接口和类的实现关系，可以单实现，也可以多实现。
 * 			public class 类名 implements 接口名1,接口名2{}
 * 	注意2:实现类还可以在继承一个类的同时实现多个接口。
 * 			public class 类名 extends 父类 implements 接口名1,接口名2{}
 */

/*
 * 练习：编写带有接口和抽象类的标准Javabean类
 *
 * 青蛙Frog  	属性：名字，年龄		行为：吃虫子，蛙泳
 * 狗Dog		属性：名字，年龄		行为：吃骨头，狗刨
 * 兔子Rabbit	属性：名字，年龄		行为：吃胡萝卜
 *
 */
public class Test {
	public static void main(String[] args) {
		// 创建青蛙的对象
		Frog f = new Frog("小青", 1);
		System.out.println(f.getName() + ", " + f.getAge());
		f.eat();
		f.swim();

		// 创建兔子的对象
		Rabbit r = new Rabbit("小白", 2);
		System.out.println(r.getName() + ", " + r.getAge());
		r.eat();
	}
}
