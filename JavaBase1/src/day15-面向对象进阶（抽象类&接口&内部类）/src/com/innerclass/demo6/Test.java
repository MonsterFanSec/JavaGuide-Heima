package com.innerclass.demo6;

/*
 *	匿名内部类：
 * 		匿名内部类本质上就是隐藏了名字的内部类
 */
public class Test {
	public static void main(String[] args) {
		/*
		 * 需要大家理解匿名内部类的格式，而不是硬记：
		 * 		new 类名或者接口名() {
		 *      	重写方法;
		 *      };
		 */

		//编写匿名内部类的代码，重写接口里面所有的抽象方法
		new Swim() {
			@Override
			public void swim() {
				System.out.println("重写了游泳的方法");
			}
		};
		/*
			整体的理解：
			1.匿名内部类指的是：
				{
					@Override
					public void swim() {
						System.out.println("重写了游泳的方法");
					}
				};
			2.这个匿名内部类实现了Swim接口
			3.new创建的是这个匿名内部类，同时()里面没有值，所有是创建空参构造，所以整个代码：
				new Swim() {
					@Override
					public void swim() {
						System.out.println("重写了游泳的方法");
					}
				};
				表达的是一个匿名内部类的对象
		*/
	}
}
