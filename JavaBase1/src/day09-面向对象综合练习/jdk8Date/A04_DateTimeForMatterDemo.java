package com.itheima.jdk8Date;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/*
 * DateTimeFormatter用于时间的格式化和解析
 *  	static DateTimeFormatter ofPattern(格式)            获取格式对象
 *  	String format(时间对象)                              按照指定方式格式化
 */
public class A04_DateTimeForMatterDemo {
	public static void main(String[] args) {
		// 获取时间对象
		ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));

		// 解析/格式化器
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EE a");

		// 格式化
		System.out.println(dtf1.format(time));    // 2024-09-29 16:43:50 周日 下午
	}
}
