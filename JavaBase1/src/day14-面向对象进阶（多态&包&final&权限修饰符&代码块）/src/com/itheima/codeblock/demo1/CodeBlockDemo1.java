package com.itheima.codeblock.demo1;

/**
 * 局部代码块
 */
public class  CodeBlockDemo1 {
	public static void main(String[] args) {
		{
			int a = 10;
		}   // 因为当代码执行到这里时，变量a就从内存中消失了
		// System.out.println(a);  // 报错
	}
}
