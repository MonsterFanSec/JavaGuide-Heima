package com.itheima.jdk8Date;

import java.time.ZoneId;
import java.util.Set;

/*
 * static Set<string> getAvailableZoneIds()             获取Java中支持的所有时区
 * static ZoneId systemDefault()                        获取系统默认时区
 * static ZoneId of(string zoneId)                      获取一个指定时区
 */
public class A01_ZoneIDDemo1 {
	public static void main(String[] args) {
		// 1.获取所有的时区名称
		Set<String> zoneIds = ZoneId.getAvailableZoneIds();	// zoneIds没有索引
		System.out.println(zoneIds.size()); // 603
		System.out.println(zoneIds);

		// 2.获取当前系统的默认时区
		ZoneId zoneId = ZoneId.systemDefault();
		System.out.println(zoneId); // Asia/Shanghai

		// 3.获取指定的时区
		ZoneId zoneId1 = ZoneId.of("Asia/Pontianak");
		System.out.println(zoneId1); // Asia/Pontianak
	}
}
