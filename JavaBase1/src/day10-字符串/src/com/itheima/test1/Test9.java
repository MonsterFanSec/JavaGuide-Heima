package com.itheima.test1;

/**
 * 案例：手机号屏蔽
 * 		String substring(int beginIndex, int endIndex) 截取
 * 		注意点：包头不包尾，包左不包右
 * 			   只有返回值才是截取的小串
 * 		String substring(int beginIndex) 截取到末尾
 */
public class Test9 {
	public static void main(String[] args) {
		//1.获取一个手机号码
		String phoneNumber = "13112349468";

		//2.截取手机号码前面三位
		String start = phoneNumber.substring(0, 3);

		//3.截取手机号码后面四位
		String end = phoneNumber.substring(7);

		//4.拼接
		String result = start + "****" + end;

		//5.打印
		System.out.println(result);
	}
}
