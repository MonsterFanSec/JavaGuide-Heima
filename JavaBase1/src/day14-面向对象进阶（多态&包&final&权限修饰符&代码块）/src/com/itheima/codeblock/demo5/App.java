package com.itheima.codeblock.demo5;

import com.itheima.codeblock.demo4.User;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 这种方式也可以实现数据初始化，但是有弊端；
 * 	因为代码被写在了方法里面，只要是方法，就有可能被别人反复的调用；
 * 	反复调用的话，ArrayList<User>集合可能在内存中有多个，并且用户信息会反复的进行添加；
 *
 * 总结：
 * 	以后，如果我们想要做数据初始化，而且数据初始化代码只想执行一次，怎么办？
 * 	就写在静态代码块当中。
 *
 * 	1.代码块的分类：
 * 		局部代码块，构造代码块，静态代码块
 * 	2.局部代码块的作用
 * 		提前结束变量的生命周期（已淘汰）
 * 	3.构造代码块的作用
 * 		抽取构造方法中的重复代码（不够灵活）
 * 	4.静态代码块的作用
 * 		数据的初始化（重点）
 */
public class App {
	public static void main(String[] args) {
		ArrayList<User> list = new ArrayList<>();
		list.add(new User("zhangsan", "123456", "itheima002", "13112345678"));
		list.add(new User("lisi", "123456", "itheima003", "13187654321"));

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入您的选择 1 登录 2 注册 3 忘记密码 4 退出");
	}
}
