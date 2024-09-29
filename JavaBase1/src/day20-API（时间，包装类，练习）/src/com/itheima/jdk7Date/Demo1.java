package com.itheima.jdk7Date;

/*
 * JDK7以前的时间相关类
 *
 * Date					时间
 * SimpleDateFormat		格式化时间
 * 		2024年09月29日
 * 		2024-09-24
 * 		2024/09/24
 * 	Calendar			日历
 *
 * 时间的相关知识点：
 * 		全世界的时间，有一个统一的计算标准
 *
 * 		【误差太大】：
 * 		格林尼治时间/格林威治时间（Greenwich Mean Time） 简称GMT
 * 		计算核心：地球自转一天是24小时，太阳直射时为正午12点
 *
 *
 * 		原子钟：利用铯原子的震动的频率计算出来的时间，作为世界标准时间（UTC）。
 * 			   9,192,631,770次 等于 1秒
 *
 * 小结：
 * 	世界标准时间：
 * 		格林尼治时间/格林威治时间（Greenwich Mean Time） 简称GMT
 * 		目前世界标准时间（UTC）已经替换为：原子钟
 * 	中国标准时间：
 * 		世界标准时间+8小时
 * 	时间单位换算：
 * 		1秒		= 	1000毫秒
 * 		1毫秒	= 	1000微秒
 * 		1微秒	= 	1000纳秒
 */

/*
 *	Date时间类：
 * 		Date类是一个JDK写好的Javabean类，用来描述时间，精确到毫秒。
 * 		利用空参构造创建的对象，默认表示系统当前时间。
 * 		利用有参构造创建的对象，表示指定的时间。
 */
public class Demo1 {
	public static void main(String[] args) {

	}

	public class Date {
		// 当前时间的毫秒值
		private long time;

		// 空参构造方法
		public Date() {
			this.time = System.currentTimeMillis();
		}

		// 带参构造方法
		public Date(long time) {
			this.time = time;
		}

		// get方法
		public long getTime() {
			return time;
		}

		// set方法
		public void setTime(long time) {
			this.time = time;
		}
	}
}































