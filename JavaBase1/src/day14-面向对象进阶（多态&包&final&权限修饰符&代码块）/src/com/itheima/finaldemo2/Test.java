package com.itheima.finaldemo2;

/*
 * 	常量：
 * 		实际开发中，常量一般作为系统的配置信息，方便维护，提高可读性。
 * 		常量的命名规范：
 * 			单个单词：全部大写
 * 			多个单词：全部大写，单词之间用下划线隔开
 *
 * 	细节：
 * 		final修饰的变量是基本类型：那么变量存储的数据值不能发生改变。
 * 		final修饰的变量是引用类型：那么变量存储的地址值不能发生改变，对象内部的可以改变。
 *
 * 	核心：常量记录的数据是不能发生改变的。
 */
public class Test {
	public static void main(String[] args) {
		// 字符串是不可变的
		final double PI = 3.14;

		// 创建对象
		final Student S = new Student("zhangsan", 23);

		// 记录的地址值不能发生改变，内部的属性值还是可以改变的
		// S = new Student();
		S.setName("李四");
		S.setAge(24);
		System.out.println(S.getName() + ", " + S.getAge());


		// final修饰数组，记录的地址值不能发生改变，内部的属性值还是可以改变的
		final int[] ARR = {1, 2, 3, 4, 5};
		// ARR = new int[10];
		ARR[0] = 10;
		ARR[1] = 20;

		// 遍历数组
		for (int i = 0; i < ARR.length; i++) {
			System.out.println(ARR[i]);
		}
	}
}
