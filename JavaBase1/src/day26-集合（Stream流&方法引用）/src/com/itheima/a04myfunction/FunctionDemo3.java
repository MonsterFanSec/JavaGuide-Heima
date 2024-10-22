package com.itheima.a04myfunction;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

/*
 * 方法引用（引用成员方法）
 *
 * 格式
 *      其他类：其他类对象::方法名
 *      本类：this::方法名(引用处不能是静态方法，因为静态方法没有this关键字)
 *      父类：super::方法名(引用处不能是静态方法，因为静态方法没有super关键字)
 *
 * 需求：
 *      练习1:集合中有一些名字，按照要求过滤数据
 *      		数据："张无忌","周芷若","赵敏","张强","张三丰"
 *      		要求：只要以张开头，而且名字是3个字的
 */
public class FunctionDemo3 {
	public static void main(String[] args) {
		// 1.创建集合
		ArrayList<String> list = new ArrayList<>();

		// 2.添加数据
		Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰");

		/*
		 * 3.过滤数据（只要以张开头，而且名字是3个字的）
		 */
		// 方式一：匿名内部类
		list.stream().filter(new Predicate<String>() {
			@Override
			public boolean test(String s) {
				return s.startsWith("张") && s.length() == 3;
			}
		}).forEach(s -> System.out.println(s));
		System.out.println("=========================================");

		// 方式二：lambda表达式
		list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(s -> System.out.println(s));
		System.out.println("=========================================");


		/*
		 * 4.改写为方法引用
		 */
		// 其他类：其他类对象::方法名
		StringOperation so = new StringOperation();
		list.stream().filter(so::stringJudge)
				.forEach(s -> System.out.println(s));
		System.out.println("=========================================");


		// 本类：this::方法名(引用处不能是静态方法)，静态方法中是没有this的
		list.stream().filter(new FunctionDemo3()::stringJudge)
				.forEach(s -> System.out.println(s));
	}


	public boolean stringJudge(String s) {
		return s.startsWith("张") && s.length() == 3;
	}
}
