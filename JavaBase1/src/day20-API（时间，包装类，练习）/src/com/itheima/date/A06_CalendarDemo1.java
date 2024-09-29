package com.itheima.date;

import java.util.Calendar;
import java.util.Date;

/*
 * Calendar概述：
 * - Calendar代表了系统当前时间的日历对象，可以单独修改、获取时间中的年，月，日
 * - 细节：Calendar是一个抽象类，不能直接创建对象。
 *
 * 获取Calendar日历类对象的方法
 * 	public static Calendar getInstance()               获取当前时间的日历对象
 *
 * Calendar常用方法：
 * 	public final Date getTime()                         获取日期对象
 * 	public final setTime(Date date)                     给日历设置日期对象
 * 	public long getTimeInMillis()                       拿到时间毫秒值
 * 	public void setTimeInMillis(long millis)            给日历设置时间毫秒值
 * 	public int get(int field)                           获取日期中的某个字段信息
 * 	public void set(int field,int value)                修改日历的某个字段信息
 * 	public void add(int field,int amount)               为某个字段增加/减少指定的值
 *
 *
 * 总结：
 * 	1.Calendar表示什么？
 * 		表示一个时间的日历对象
 * 	2.如何获取对象
 * 		通过getInstance方法获取对象
 * 	3.常见方法：
 * 		setXxx：修改
 * 		getXxx：获取
 * 		add：在原油的基础上进行增加或者减少
 * 	4.细节点：
 * 		日历类中月份的范围：0～11
 * 		日历类中星期的特点：星期日是一周中的第一天
 */
public class A06_CalendarDemo1 {
	public static void main(String[] args) {
		/*
		 * 1.获取日历对象
		 *
		 * 细节1:Calendar是一个抽象类,不能直接new,而是通过一个静态方法获取到子类对象
		 * 底层原理:
		 * 		会根据系统的不同时区来获取不同的日历对象,默认表示当前时间。
		 * 		把会把时间中的纪元,年,月,日,时,分,秒,星期,等等的都放到一个数组当中
		 * 		0：纪元
		 * 		1：年
		 * 		2：月
		 * 		3：一年中的第几周
		 * 		4：一个月中的第几周
		 * 		5：一个月中的第几天(日期)
		 * 		....
		 * 		（共17个属性）
		 *
		 * 细节2:
		 * 	月份:范围0~11；
		 * 		如果获取出来的是0，那么实际上是1月。
		 * 		如果获取出来的是1，那么实际上是2月。
		 * 		如果获取出来的是11，那么实际上是12月。
		 * 	星期:在老外的眼里,星期日是一周中的第一天
		 * 		1(星期日) 2(星期一) 3(星期二) 4(星期三) 5(星期四) 6(星期五) 7(星期六)
		 */
		Calendar c = Calendar.getInstance();

		// 2.修改一下日历代表的时间
		Date d = new Date(0L);
		c.setTime(d);
		System.out.println(c);

		c.set(Calendar.YEAR, 2023);
		c.set(Calendar.MONTH, 8);    // 8表示的是9月
		c.set(Calendar.DAY_OF_MONTH, 10);

		// 调用方法在这个基础上增加/减少一个月
		c.add(Calendar.MONTH, -1);    // 将9月变成8月

		// java在Calendar类中,把索引对应的数字都定义成常量
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int date = c.get(Calendar.DAY_OF_MONTH);
		int week = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(year + "," + month + "," + date + "," + getWeek(week));
	}

	/*
	 * 查表法:
	 * 	表:容器
	 * 	让数据跟索引产生对应的关系
	 *
	 * 	传入对应的数字: 1~7
	 * 	返回对应的星期
	 */
	public static String getWeek(int index) {
		// 定义一个数组,让汉字星期几 跟1~7产生对应关系
		String[] arr = {"", "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
		// 根据索引返回对应的星期
		return arr[index];
	}
}
