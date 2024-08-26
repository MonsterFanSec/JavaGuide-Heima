package com.itheima.test7;

import java.text.DecimalFormat;

/**
 * JAVA中"/“是取整，”%"是取余
 */
public class GirlFriendTest {
	public static void main(String[] args) {
		// 1.定义数组存入女朋友的对象
		GirlFriend[] arr = new GirlFriend[4];

		// 2.创建女朋友对象
		GirlFriend gf1 = new GirlFriend("小诗诗", 18, "萌妹子", "吃零食");
		GirlFriend gf2 = new GirlFriend("小丹丹", 19, "萌妹子", "玩游戏");
		GirlFriend gf3 = new GirlFriend("小惠惠", 20, "萌妹子", "看书，学习");
		GirlFriend gf4 = new GirlFriend("小莉莉", 21, "憨妹子", "睡觉");

		// 3.把对象添加到数组当中
		arr[0] = gf1;
		arr[1] = gf2;
		arr[2] = gf3;
		arr[3] = gf4;

		// 4.求和
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			// i 索引 arr[i] 元素（女朋友对象）
			GirlFriend gf = arr[i];
			// 累加
			sum = sum + gf.getAge();
		}

		// 5.平均值
		int avg = sum / arr.length;
		System.out.println("int:" + avg);    // 19


		String division = Division(sum, arr.length);
		System.out.println("division:" + division);        // 19.50000000


		// 6.统计年龄比平均值低的有几个，打印他们的信息
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			GirlFriend gf = arr[i];
			if (gf.getAge() < avg) {
				count++;
				System.out.println(gf.getName() + ", " + gf.getAge() + ", " + gf.getGender() + ", " + gf.getHobby());
			}
		}

		System.out.println(count + "个");
	}

	public static String Division(int a, int b) {
		//“0.00000000”确定精度
		DecimalFormat dF = new DecimalFormat("0.00000000");
		return dF.format((float) a / b);
	}
}
