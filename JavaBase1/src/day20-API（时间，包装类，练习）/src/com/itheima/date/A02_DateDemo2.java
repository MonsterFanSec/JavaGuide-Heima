package com.itheima.date;

import java.util.Date;
import java.util.Random;

/*
 * 需求1:打印时间原点开始一年之后的时间
 * 需求2:定义任意两个Date对象，比较一下哪个时间在前，哪个时间在后
 *
 * 总结：
 * 	1.如如何创建日期对象？
 * 	- Date date = new Date();
 * 	- Date date = new Date(指定毫秒值);
 *
 * 	2.如何修改时间对象中的毫秒值
 * 	- setTime(毫秒值);
 *
 * 	3.如何获取时间对象中的毫秒值
 * 	- getTime();
 */
public class A02_DateDemo2 {
	public static void main(String[] args) {
		method2();
	}

	// 需求1
	private static void method1() {
		// 1.创建一个对象，表示时间原点
		Date d1 = new Date(0L);

		// 2.获取d1时间的毫秒值
		long time = d1.getTime();

		// 3.在这个基础上我们要加一年的毫秒值即可
		time = time + 1000L * 60 * 60 * 24 * 365;

		// 4.把计算之后的时间毫秒值，再设置回d1当中
		d1.setTime(time);

		// 5.打印d1
		System.out.println(d1);    // Fri Jan 01 08:00:00 CST 1971
	}

	// 需求2
	private static void method2() {
		Random r = new Random();
		// 创建两个时间对象
		Date d1 = new Date(Math.abs(r.nextInt()));    // Math.abs获取绝对值，r.nextInt()会在int的范围内取值
		Date d2 = new Date(Math.abs(r.nextInt()));
		long time1 = d1.getTime();
		long time2 = d2.getTime();

		if (time1 > time2) {
			System.out.println("第一个时间在后面，第二个时间在前面");
		} else if (time1 < time2) {
			System.out.println("第二个时间在后面，第一个时间在前面");
		} else {
			System.out.println("表示两个时间一样");
		}
	}
}
