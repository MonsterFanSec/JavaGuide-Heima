package com.itheima.myexception.demo;

/*
 * 自己处理（捕获异常）灵魂四问：
 *
 * 如果try中遇到了问题，那么try下面的其他代码还会执行吗？
 *      下面的代码就不会执行了，直接跳转到对应的catch当中，执行catch里面的语句体
 *      但是如果没有对应catch与之匹配，那么还是会交给虚拟机进行处理
 *
 * JVM默认处理异常的方式：
 *      1. 把异常的名称，异常原因及异常出现的位置等信息输出在了控制台
 *      2. 程序停止执行，异常下面的代码不会再执行了
 */
public class ExceptionDemo10 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6};

		try {
			System.out.println(arr[10]);
			System.out.println("看看我执行了吗？... try");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("索引越界了");
		}

		System.out.println("看看我执行了吗？... 其他代码");
	}
}
