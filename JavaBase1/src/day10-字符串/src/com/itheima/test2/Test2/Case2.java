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
public class Case2 {
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

		// 这份代码演示方法2
		char[] arr = str.toCharArray();    // 可以将字符串"a,b,c"变为["a","b","c"]
		//System.out.println(arr);

		// 拿到0索引上的字符
		char first = arr[0];

		// 把剩余的字符依次往前挪一个位置
		for (int i = 1; i < arr.length; i++) {
			arr[i - 1] = arr[i];
		}
		// 把原来0索引上的字符放到最后一个索引
		arr[arr.length - 1] = first;

		// 利用字符数组创建一个字符串对象
		String result = new String(arr);
		return result;
	}
}
