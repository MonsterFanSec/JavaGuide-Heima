package com.itheima.myexception.demo;

/*
 * 自己处理（捕获异常）灵魂三问：
 *
 * 如果try中遇到的问题没有被捕获，怎么执行？
 * 相当于try...catch的代码白写了，最终还是会交给虚拟机进行处理。
 *
 * JVM默认处理异常的方式：
 *      1. 把异常的名称，异常原因及异常出现的位置等信息输出在了控制台
 *      2. 程序停止执行，异常下面的代码不会再执行了
 */
public class ExceptionDemo9 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6};

		try {
			System.out.println(arr[10]);    // new ArrayIndexOutOfBoundsException();
		} catch (NullPointerException e) {
			System.out.println("空指针异常");
		}

		System.out.println("看看我执行了吗？");
	}
}
