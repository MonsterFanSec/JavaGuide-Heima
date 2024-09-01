package com.itheima.test1;

/**
 * 案例：字符串反转
 * 定义一个方法，实现字符串反转。
 * 键盘录入一个字符串，调用该方法后，在控制台输出结果
 * 例如，键盘录入abc，输出结果cba
 */

public class Test7 {
	public static void main(String[] args) {
		String result = reverser("abc");
		System.out.println(result);
	}

	//1.我要干嘛？  --- 字符串的反转
	//2.我干这件事情，需要什么才能完成？  --- 需要一个字符串
	//3.调用处是否需要继续使用方法的结果呢？ ---需要结果进行输出
	public static String reverser(String str) {
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			//i 依次表示字符串中的每一个索引 （倒着的）
			char c = str.charAt(i);
			result = result + c;
		}
		return result;
	}
}
