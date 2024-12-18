package com.itheima.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogDemo1 {
	//创建一个Logger日志对象
	public static final Logger LOGGER = LoggerFactory.getLogger("LogDemo1.class");

	public static void main(String[] args) {
		//2024-12-18 22:23:56.465 [DEBUG] LogDemo1.class [main] : chu方法开始执行咯~~
		//时间 什么类型日志 类名 线程：信息
		LOGGER.debug("chu方法开始执行咯~~");
		LOGGER.info("chu方法开始执行咯~~");
		chu(3, 0);
	}

	public static void chu(int a, int b) {
		try {
			LOGGER.debug("参数a:" + a);
			LOGGER.debug("参数a:" + b);
			int c = a / b;
			LOGGER.info("结果是：" + c);
		} catch (Exception e) {
			LOGGER.error("报错了！！！！");
		}
	}
}