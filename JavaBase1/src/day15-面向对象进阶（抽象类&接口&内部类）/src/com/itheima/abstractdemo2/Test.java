package com.itheima.abstractdemo2;

/*
 * 练习：编写带有抽象类的标准Javabean类
 *
 * 青蛙Frog  	属性：名字，年龄		行为：吃虫子，喝水
 * 狗Dog		属性：名字，年龄		行为：吃骨头，喝水
 * 山羊Sheep		属性：名字，年龄		行为：吃草，喝水
 *
 *
 * 抽象类和抽象方法的意义：
 * 疑问：
 * 		把子类中共性的内容抽取到父类之后，由于方法体不确定，需要定义为抽象。子类使用时需要重写。
 * 		那么我不抽取到父类，直接在子类写代码不是更节约代码？
 *
 * 总结：
 * 	1.抽象类的作用是什么样的？
 * 		抽取共性时，无法确定方法体，就把方法定义为抽象的。
 * 		强制让子类按照某种格式重写。
 * 		抽象方法所在的类，必须是抽象类。
 * 	2.抽象类和抽象方法的格式？
 * 		public abstract 返回值类型 方法名(参数列表)
 * 		public abstract class 类名{}
 * 	3.继承抽象类有哪些要注意？
 * 		- 要么重写抽象类中的所有抽象方法
 * 		- 要么是抽象类
 */
public class Test {
	public static void main(String[] args) {
		//	创建对象
		Frog f = new Frog("小绿", 1);
		System.out.println(f.getName() + ", " + f.getAge());
		f.drink();
		f.eat();
	}
}
