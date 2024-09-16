package com.itheima.abstractdemo1;

/*
 * 抽象类和抽象方法：
 * 		1.抽象类的定义格式
 * 			public abstract class 类名{}
 * 		2.抽象方法的定义格式
 * 			public abstract 返回值类型 方法名(参数列表);
 * 		3.子类继承抽象类之后，如何重写抽象方法
 * 		4.抽象类在实际开发中的意义
 *
 * 抽象方法：
 * 		将共性的行为（方法）抽取到父类之后。
 * 		由于每一个子类执行的内容是不一样，所以，在父类中不能确定具体的方法体。
 * 		该方法就可以定义为抽象方法。
 *
 * 抽象类：
 * 		如果一个类中存在抽象方法，那么该类就必须声明为抽象类。
 *
 * 抽象类和抽象方法的注意事项：
 * 		1.抽象类不能实例化
 * 		2.抽象类中不一定有抽象方法，有抽象方法的类一定是抽象类
 * 		3.可以有构造方法
 * 		4.抽象类的子类
 * 			要么重写抽象类中的所有抽象方法
 * 			要么是抽象类
 */
public class Test {
	public static void main(String[] args) {
		// 创建对象
		// Person p = new Person();	// 报错


		Student s = new Student("zhangsan", 23);
		System.out.println(s.getName() + ", " + s.getAge());
	}
}
