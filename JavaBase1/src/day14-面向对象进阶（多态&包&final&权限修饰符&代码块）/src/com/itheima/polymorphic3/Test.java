package com.itheima.polymorphic3;

/*
 *	多态的优势：
 * 		1.在多态形式下，右边对象可以实现解耦合，便于扩展和维护。
 * 			Person p = new Student();
 * 			p.work();	// 业务逻辑发生变化时，后续代码无需修改
 * 		2.定义方法的时候，使用父类型作为参数，可以接收所有子类对象，体现多态的扩展性与便利。
 *
 * 	总结：
 * 		1.多态的优势：
 * 			方法中，使用父类型作为参数，可以接收所有子类对象
 * 		2.多态的弊端时什么？
 * 			不能使用子类的特有功能
 * 		3.引用数据类型的类型转化，有几种方式？
 * 			自动类型转换：Person p = new Student();
 * 			强制类型转换：Student s = (Student)p;
 * 		4.强制类型转换能解决什么问题？
 * 			可以转换成真正的子类类型，从而调用子类独有功能
 * 			转换类型与真实对象类型不一致会报错
 * 			转换的时候用instanceof关键字进行判断
 */

public class Test {
	public static void main(String[] args) {
		// 创建对象
		Animal a = new Dog();
		// 编译看左边，运行看右边
		a.eat();

		/*
		 * 多态的弊端：
		 * 		不能调用子类的特有功能
		 * 	报错的原因？
		 * 		当调用成员方法的时候，编译看左边，运行看右边
		 * 		那么在编译的时候会先检查左边的父类中有没有这个方法，如果没有直接报错。
		 */
		//	a.lookHome();


		/* 解决方案：变回子类类型就可以了 */
		Dog b = (Dog) a;
		b.lookHome();

		/* 细节：转换的时候不能瞎转，如果转成其他类的类型，就会报错 */
		//Cat c = (Cat) a;
		//c.catchMouse();


		/* 如果无法判断的情况下，使用instanceof来判断类型 */
		if (a instanceof Dog) {
			Dog d = (Dog) a;
			d.lookHome();
		} else if (a instanceof Cat) {
			Cat e = (Cat) a;
			e.catchMouse();
		} else {
			System.out.println("没有这个类型，无法转换");
		}

		/*
		 * JDK14之后的新特性：
		 * 		先判断a是否为Dog类型，如果是，则强转成Dog类型，转换之后变量名为f
		 * 		如果不是，则不强转，结果直接是false
		 */
		if (a instanceof Dog f) {
			f.lookHome();
		} else if (a instanceof Cat g) {
			g.catchMouse();
		} else {
			System.out.println("没有这个类型，无法转换");
		}
	}
}

class Animal {
	public void eat() {
		System.out.println("动物在吃东西");
	}
}

class Dog extends Animal {
	@Override
	public void eat() {
		System.out.println("狗吃骨头");
	}

	public void lookHome() {
		System.out.println("狗看家");
	}
}

class Cat extends Animal {
	@Override
	public void eat() {
		System.out.println("猫吃小鱼干");
	}

	public void catchMouse() {
		System.out.println("猫抓老鼠");
	}
}