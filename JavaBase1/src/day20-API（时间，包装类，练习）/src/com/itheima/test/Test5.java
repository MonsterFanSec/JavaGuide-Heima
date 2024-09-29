package com.itheima.test;

import java.time.LocalDate;
import java.util.Calendar;

/*
 * 判断任意的一个年份是闰年还是平年要求:用JDK7和JDK8两种方式判断
 *
 * 提示:（计算时间间隔）
 * 	思路一：二月有29天是闰年
 * 			2000年2月1日   0:0:0
 * 			2000年3月1日   0:0:0
 * 			间隔29天
 * 	思路二：一年有366天是闰年
 * 			2000年1月1日   0:0:0
 * 			2000年12月31日 23:59:59
 * 			间隔366天
 *
 * jdk7中使用Calendar类：
 * 	方法一：使用Calendar类，再把日历往前减一天，看当前的时间是28号还是29号?
 * 	方法二：使用Calendar类，再把日历往前减一天，统计这一天是一年中的第几天，365天还是366天？
 */
public class Test5 {
	public static void main(String[] args) {
		/* jdk7 */
		// 我们可以把时间设置为2000年3月1日
		Calendar c = Calendar.getInstance();
		c.set(2000, 2, 1);    // 月份的范围:0~11，写2就表示3月

		// 再把日历往前减一天
		c.add(Calendar.DAY_OF_MONTH, -1);

		// 看当前的时间是28号还是29号?
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);


		/* jdk8 */
		// 月份的范围:1~12
		// 设定时间为2000年的3月1日
		LocalDate ld = LocalDate.of(2001, 3, 1);    // jdk8的LocalDate.of中的month，写3就表示3月

		// 把时间往前减一天
		LocalDate ld2 = ld.minusDays(1);

		// 获取这一天是一个月中的几号
		int day2 = ld2.getDayOfMonth();
		System.out.println(day2);

		// true:闰年；false:平年
		System.out.println(ld.isLeapYear());
	}
}
