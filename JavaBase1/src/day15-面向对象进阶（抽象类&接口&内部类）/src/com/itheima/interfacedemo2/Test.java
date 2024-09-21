package com.itheima.interfacedemo2;

import java.util.Scanner;

/*
 * 接口中成员的特点：
 * 	- 成员变量：
 * 		只能是常量
 * 		默认修饰符：public static final
 * 	- 构造方法：
 * 		在接口中没有构造方法
 * 	- 成员方法：
 * 		JDK7以前只能是抽象方法
 * 		默认修饰符：public static
 *
 * JDK7以前：接口中只能定义抽象方法。
 * JDK8的新特性：接口中可以定义有方法体的方法。
 * JDK9的新特性：接口中可以定义私有方法。
 */
public class Test {
	public static void main(String[] args) {
		// 创建实现类对象并调用方法
		InterImpl ii = new InterImpl();
		System.out.println(ii.a);
		System.out.println(InterImpl.a);
		ii.method();


		// 内存分析工具需要程序一直运行，因此代码中用了一些Scanner
		Scanner sc = new Scanner(System.in);
		sc.next();
	}
}
