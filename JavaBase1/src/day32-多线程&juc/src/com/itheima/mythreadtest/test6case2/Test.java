package com.itheima.mythreadtest.test6case2;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 有一个抽奖池,该抽奖池中存放了奖励的金额,该抽奖池中的奖项为 {10,5,20,50,100,200,500,800,2,80,300,700};
 *
 * 创建两个抽奖箱(线程)设置线程名称分别为“抽奖箱1”，“抽奖箱2”
 * 随机从抽奖池中获取奖项元素并打印在控制台上,格式如下:
 *      每次抽的过程中，不打印，抽完时一次性打印(随机)    在此次抽奖过程中，抽奖箱1总共产生了6个奖项。
 *          分别为：10,20,100,500,2,300最高奖项为300元，总计额为932元
 *      在此次抽奖过程中，抽奖箱2总共产生了6个奖项。
 *          分别为：5,50,200,800,80,700最高奖项为800元，总计额为1835元
 */
public class Test {
	public static void main(String[] args) {

		// 创建奖池
		ArrayList<Integer> list = new ArrayList<>();
		Collections.addAll(list, 10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300, 700);

		// 创建线程
		MyThread t1 = new MyThread(list);
		MyThread t2 = new MyThread(list);
		MyThread t3 = new MyThread(list);
		MyThread t4 = new MyThread(list);
		MyThread t5 = new MyThread(list);

		// 设置名字
		t1.setName("抽奖箱1");
		t2.setName("抽奖箱2");
		t3.setName("抽奖箱3");
		t4.setName("抽奖箱4");
		t5.setName("抽奖箱5");

		// 启动线程
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
