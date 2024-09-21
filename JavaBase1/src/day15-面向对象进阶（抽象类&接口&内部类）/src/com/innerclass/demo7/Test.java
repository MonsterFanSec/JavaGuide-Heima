package com.innerclass.demo7;

public class Test {
	public static void main(String[] args) {
		new Animal() {
			@Override
			public void eat() {
				System.out.println("重写了eat方法");
			}
		};

		/*
			整体的理解：
			1.匿名内部类指的是：
				{
					@Override
					public void eat() {
						System.out.println("重写了eat方法");
					}
				}
			2.这个匿名内部类继承了Animal类
			3.new创建的是这个匿名内部类，同时()里面没有值，所有是创建空参构造，所以整个代码：
				new Animal() {
					@Override
					public void eat() {
						System.out.println("重写了eat方法");
					}
				};
				表达的是一个匿名内部类的对象
		*/

		/*
		 * 在测试类中调用下面的method方法？
		 * 		以前的方式如何调用？
		 * 			要自己写一个子类继承Animal类
		 * 			再创建子类的对象，传递给method方法
		 */
		Dog d = new Dog();    // 如果Dog类我只要用一次，那么还需要单独定义一个类太麻烦了。
		method(d);


		// 此时可以用匿名内部类简化代码
		method(
				// 把这一堆当作参数传递给Animal a
				new Animal() {
					@Override
					public void eat() {
						System.out.println("狗吃骨头");
					}
				}
		);
	}


	public static void method(Animal a) {    // Animal a = 子类对象 		（多态）
		a.eat();    // 编译看左边，运行看右边
	}
}