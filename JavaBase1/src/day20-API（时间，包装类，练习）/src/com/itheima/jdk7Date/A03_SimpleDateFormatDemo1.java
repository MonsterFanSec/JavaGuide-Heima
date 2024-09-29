package com.itheima.jdk7Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * SimpleDateFormat类作用：
 * 	- 格式化：把时间变成我们喜欢的格式。
 * 			2024年09月29日
 * 			2024-09-29
 * 			2024/09/24
 *  - 解析：把字符串表示的时间变成Date对象。
 * 			Date d = new Date(0L);
 * 			System.out.println(d);
 *
 * public simpleDateFormat()                            默认格式
 * public simpleDateFormat(String pattern)              指定格式
 *
 * public final string format(Date date)                格式化(日期对象 ->字符串)
 * public Date parse(string source)                     解析(字符串 ->日期对象)
 *
 * 格式化的时间形式的常用的模式对应关系如下：
 * y	年
 * M	月
 * d	日
 * H	时
 * m	分
 * s	秒
 *
 * 2024-09-29 14:51:06
 * yyyy-MM-dd HH:mm:ss
 *
 * 2024年09月29日 14:51:06
 * yyyy年MM月dd日 HH:mm:ss
 */
public class A03_SimpleDateFormatDemo1 {
	public static void main(String[] args) throws ParseException {
		method2();
	}

	private static void method1() {
		// 1.利用空参构造创建simpleDateFormat对象，默认格式
		SimpleDateFormat sdf1 = new SimpleDateFormat();
		Date d1 = new Date(0L);
		String str1 = sdf1.format(d1);
		System.out.println(str1);    // 1970/1/1 上午8:00

		// 2.利用带参构造创建simpleDateFormat对象，指定格式
		// 课堂练习:yyyy年MM月dd日 时:分:秒 星期
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EE");
		String str2 = sdf2.format(d1);
		System.out.println(str2);    // 1970年01月01日 08:00:00 周四
	}

	private static void method2() throws ParseException {
		// 1.定义一个字符串表示时间
		String str = "2023-11-11 11:11:11";

		// 2.利用空参构造创建simpleDateFormat对象
		// 细节：创建对象的格式要跟字符串的格式完全一致
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = sdf.parse(str);

		// 3.打印结果
		System.out.println(date.getTime()); // 1699672271000（毫秒值）
	}
}
