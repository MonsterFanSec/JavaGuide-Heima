package com.itheima.lambda;

/*
 * 注意点：
 * 		- Lambda表达式可以用来简化匿名内部类的书写
 * 		- Lambda表达式只能简化函数式接口的匿名内部类的写法
 * 		- 函数式接口：有且仅有一个抽象方法的接口叫做函数式接口，接口上方可以加@FunctionalInterface注解
 *
 * 总结：
 * 		1.Lambda表达式的基本作用？
 * 			简化函数式接口的匿名内部类的写法。
 *
 * 		2.Lambda表达式有什么使用前提？
 * 			必须是接口的匿名内部类，接口中只能有一个抽象方法
 *
 * 		3.Lambda的好处？
 * 			Lambda是一个匿名函数，我们可以把Lambda表达式理解为是一段可以传递的代码，它可以写出更简洁、更灵活的代码，
 * 			作为一种更紧凑的代码风格，使Java语言表达能力得到了提升。
 */
public class lambdaDemo2 {
	public static void main(String[] args) {
		/*
		 * 1.利用匿名内部类的形式去调用下面的方法
		 * 	 调用一个方法的时候，如果方法的形参是一个接口，那么我们要传递这个接口的实现类对象
		 * 	 如果实现类对象只用到一次，就可以用匿名内部类的形式进行书写
		 */
		method(new Swim() {
			@Override
			public void swimming() {
				System.out.println("正在游泳～～～");
			}
		});


		/*
		 * 2.利用lambda表达式进行改写
		 */
		method(() -> {
			System.out.println("正在吃饭～～～");
		});
	}

	public static void method(Swim s) {
		s.swimming();
	}
}

@FunctionalInterface
interface Swim {
	public abstract void swimming();
}