package com.itheima.test2;

import java.util.Random;

/**
 * 训练目标：生成验证码
 * 内容：可以是小写字母，也可以是大写字母，还可以是数字
 * 规则：
 * 1.长度为5
 * 2.内容中是四位字母，1位数字。
 * 3.其中数字只有1位，但是可以出现在任意的位置。
 */
public class Test4 {
	public static void main(String[] args) {
		// 1.大写字母和小写字母都放到数组当中
		char[] chs = new char[52];
		for (int i = 0; i < chs.length; i++) {
			// ASCII码表
			if (i <= 25) {
				//添加小写字母
				chs[i] = (char) (97 + i);
			} else {
				// 添加大写字母
				// A --- 65
				chs[i] = (char) (65 + i - 26);
			}
		}

		// 定义一个字符串类型的变量，用来记录最终的结果
		String code = "";


		// 2.随机抽取数组中的索引，抽取4次
		Random r = new Random();
		for (int i = 0; i < 4; i++) {
			int randomIndex = r.nextInt(chs.length);
			// 利用随机索引，获取对应的元素
			// System.out.println(chs[randomIndex]);
			code = code + chs[randomIndex];
		}
		// System.out.println(result);


		// 3.随机抽取一个数字0~9
		int number = r.nextInt(10);
		// 生成最终的结果
		code = code + number;


		// 4.变成字符数组打乱数据
		char[] arr = code.toCharArray();
		// 将数组里面的内容打乱
		for (int i = 0; i < arr.length; i++) {
			int index = r.nextInt(arr.length);
			char temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}

		// 将字符数组再变回字符串
		String result = new String(arr);

		// 输出打印
		System.out.println(result);
	}
}