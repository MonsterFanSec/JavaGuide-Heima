package com.itheima.object;

/*
 * 对象克隆：
 * 		把A对象的属性值完全拷贝给B对象，也叫对象拷贝，对象复制
 *
 * 方法：protected object clone(int a) 对象克隆
 *
 * 浅克隆：
 * 		不管对象内部的属性是基本数据类型还是引用数据类型，都完全拷贝过来
 * 深克隆：
 * 		基本数据类型拷贝过来
 * 		字符串复用
 * 		引用数据类型会重新创建新的
 *
 * 总结：
 * 		1.Object是Java中的顶级父类。
 * 		  所有的类都直接或间接的继承于Object类。
 * 		2.toString():一般会重写，打印对象时打印属性
 * 		3.equals():比较对象时会重写，比较对象属性值是否相同
 * 		4.clone():默认浅克隆。
 * 				  如果需要深克隆需要重写方法或者使用第三方工具类。
 */
public class Test4 {
	public static void main(String[] args) throws CloneNotSupportedException {
		// 1.先创建一个对象
		int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 0};
		User u1 = new User(1, "zhangsan", "1234qwer", "girl11", data);

		/*
		 * 2.克隆对象
		 * 		细节：方法在底层会帮我们创建一个对象,并把原对象中的数据拷贝过去。
		 * 		书写细节:
		 * 			1.重写Object中的clone方法
		 * 			2.让javabean类实现Cloneable接口
		 * 			3.创建原对象并调用clone就可以了
		 */
		User u2 = (User) u1.clone();

		System.out.println(u1);
		System.out.println(u2);

		System.out.println("==========================================");
		/*
		 * 验证一件事情：
		 * 		Object中的克隆是浅克隆
		 * 		想要进行深克隆，就需要重写clone方法并修改里面的方法体
		 */
		int[] arr = u1.getData();
		arr[0] = 100;

		System.out.println(u1);
		System.out.println(u2);
	}
}
