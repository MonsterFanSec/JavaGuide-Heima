package com.itheima.test1;

/**
 * 案例：身份证信息查看
 * 		1、2位：省份
 * 		3、4位：城市
 * 		5、6位：区县
 * 		7-14位：：出生年、月、日
 * 		15、16位：所在地派出所
 * 		17位：性别（奇数男性，偶数女性）
 * 		18位：个人信息码（随机产生）
 */
public class Test10 {
	public static void main(String[] args) {
		//1.定义一个字符串记录身份证号码
		String id = "321281202001011234";

		//2.获取出生年月日
		String year = id.substring(6, 10);
		String month = id.substring(10, 12);
		String day = id.substring(12, 14);


		System.out.println("人物信息为：");
		System.out.println("出生年月日:" + year + "年" + month + "月" + day + "日");

		//3.获取性别
		char gender = id.charAt(16);
		System.out.println(gender);		// '3' ----字符串转为数字----> 3
		//字符串转为数字，利用ASCII码表进行转换
		//'0' --->  48
		//'1' --->  49
		//'2' --->  50
		//'3' --->  51
		//'4' --->  52
		//'5' --->  53
		//'6' --->  54
		//'7' --->  55
		//'8' --->  56
		//'9' --->  57

		int num = gender - 48;
		if (num % 2 == 0) {
			System.out.println("性别为:女");
		} else {
			System.out.println("性别为:男");
		}
	}
}
