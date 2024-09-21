package com.innerclass.demo8;

/*
 *	总结：
 * 		1.什么是匿名内部类？
 * 			隐藏了名字的内部类，可以写在成员位置，也可以写在局部位置。
 * 		2.匿名内部类的格式？
 * 			new 类名或者接口名(){
 * 				重写方法;
 * 			};
 * 		3.格式的细节
 * 			包含了继承或实现，方法重写，创建对象。
 * 			整体就是一个类的子类对象或者接口的额实现类对象。
 * 		4.使用场景
 * 			当方法的参数是接口或者类时，以接口为例，可以传递这个接口的实现类对象，如果实现类只要使用一次，就可以用匿名内部类简化代码。
 */
public class Test {
	// 如果写在了这个成员位置，则这是一个没有名字的“成员内部类”
	Swim s = new Swim() {
		@Override
		public void swim() {
			System.out.println("重写之后游泳方法");
		}
	};

	public static void main(String[] args) {
		/*
		 *	回顾一下匿名内部类的格式:
		 *		new 类/接口(){
		 *  		重写的方法;
		 *  	}
		 */

		//	如果写在了方法内部，那么这个匿名内部类是“局部内部类”的一种
		Swim s =
				//	整体我们可以理解为Swim接口的实现类对象，接口多态
				new Swim() {
					@Override
					public void swim() {
						System.out.println("重写之后游泳方法");
					}
				};

		// 编译看左边，运行看右边的原则
		s.swim();


		//---------------------------------------------------

		new Swim() {
			@Override
			public void swim() {
				System.out.println("重写之后游泳方法");
			}
		}.swim();
	}
}
