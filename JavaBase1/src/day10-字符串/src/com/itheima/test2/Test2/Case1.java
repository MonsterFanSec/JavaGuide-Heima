package com.itheima.test2.Test2;

/**
 * 练习：调整字符串
 * <p>
 * 给定两个字符串, A和B。
 * A的旋转操作就是将A 最左边的字符移动到最右边。
 * 例如, 若A = 'abcde'，在移动一次之后结果就是'bcdea'
 * 如果在若干次调整操作之后，A能变成B，那么返回True。
 * 如果不能匹配成功，则返回false
 */
public class Case1 {
	public static void main(String[] args) {
		// 1.定义两个字符串
		String strA = "abcde";
		String strB = "cdeab";
		String strC = "ABC";

		//abcde  --旋转1次-->  bcdea	 --旋转2次-->  cdeab  --旋转3次-->  deabc  --旋转4次-->  eabcd  --旋转5次-->  abcde

		//2.调用方法进行比较
		//boolean result = check(strA, strB);
		boolean result = check(strA, strC);

		//3.输出
		System.out.println(result);
	}

	public static boolean check(String strA, String strB) {
		for (int i = 0; i < strA.length(); i++) {
			// 调用旋转方法
			strA = rotate(strA);
			if (strA.equals(strB)) {
				return true;
			}
		}
		//	所有的情况都比较完毕了，还不一样，那么直接返回false
		return false;
	}


	// 作用：旋转字符串，把左侧的字符移动到右侧去
	// 形参：旋转前的字符串；返回值：旋转后的字符串
	public static String rotate(String str) {
	/*
		如果我们看到要修改字符串的内容，可以有2个办法：
			1.用subString进行截取，把左边的字符截取出来拼接到右侧去
			2.可以把字符串先变成一个字符数组，然后调整字符数组里面数据，最后再把字符数组变成字符串。
	 */

		//	这份代码先演示方法1，截取的思路

		// 截取第一个字符
		//str.substring(0,1);
		char first = str.charAt(0);    // 快捷键：command+option+v，快速生成变量名

		//获取剩余的字符
		String end = str.substring(1);

		return end + first;
	}
}
