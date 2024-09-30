package com.itheima.sort.recursion;

/*
 * 递归算法：
 *      递归指的是方法中调用方法本身的现象
 *
 * 递归的注意点：
 * 		递归一定要有出口，否则就会出现内存溢出
 *
 * 把一个复杂的问题层层转化为一个与原问题相似的规模较小的问题来求解。
 * 递归策略只需少量的程序就可描述出解题过程所需要的多次重复计算
 *
 * 书写递归的两个核心：
 * 		找出口：什么时候不再调用方法
 * 		找规则：如何把大问题变成规模较小的问题
 */
public class A04_RecursionDemo1 {
	public static void main(String[] args) {
		method();
	}

	public static void method() {
		method();
	}
}
