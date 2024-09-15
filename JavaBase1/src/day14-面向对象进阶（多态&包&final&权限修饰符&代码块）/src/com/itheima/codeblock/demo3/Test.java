package com.itheima.codeblock.demo3;

/*
 * 静态代码块
 *
 * 格式：static{}
 * 特点：需要通过static关键字修饰，随着类的加载而加载，并且自动触发、只执行一次
 * 使用场景：在类加载的时候，做一些数据初始化的时候使用。
 */
public class Test {
	public static void main(String[] args) {
		//创建对象
		Student s1 = new Student();

		Student s2 = new Student("zhangsan", 23);
	}
}
