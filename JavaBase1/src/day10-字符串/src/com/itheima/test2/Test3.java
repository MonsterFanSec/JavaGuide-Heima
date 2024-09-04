package com.itheima.test2;

import java.util.Random;
import java.util.Scanner;

/**
 * 键盘输入任意字符串，打乱里面的内容
 * <p>
 * 训练目标：随机数类Random相关API、字符串相关API
 * <p>
 * 训练提示：
 * 1、字符串是不可变的
 * 2、如果要变化需要变成字符数组
 * 3、调整完毕之后再变回字符串
 */
public class Test3 {
	public static void main(String[] args) {
		// 键盘录入字符串
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串");
		String str = sc.next();

		// 把字符串变成字符数组
		char[] arr = str.toCharArray();

		// 将数组里面的内容打乱
		// 打乱的核心要素：遍历数组得到每一个元素与每一个随机索引处的数据进行交换
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			int index = r.nextInt(arr.length);
			char temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}

		// 将字符数组再变回字符串
		String newStr = new String(arr);

		// 输出打印
		System.out.println(newStr);
	}
}
