package com.itheima.anno;

import java.util.Date;

/*
 *	什么是注解：
 * 		Annotation表示注解。是JDK1.5的新特性。
 * 		注解的主要作用：对我们的程序进行标注。通过注解可以给类增加额外的信息。
 * 		注解是给编译器或JVM看的，编译器或JVM可以根据注解来完成对应的功能。
 */
@SuppressWarnings("all")
public class Test {
	public static void main(String[] args) {
		Date date = new Date();
		date.setYear(2025);
		method();

		//	黄色的波浪线  警告信息
		// 方法上面添加注解：@SuppressWarnings("all")，可以不展示警告
	}

	// 已过时的方式，还是可以继续使用的，但是一定会有替代解决方案
	@Deprecated
	public static void method() {
		System.out.println("看看我执行了吗?");
	}
}
