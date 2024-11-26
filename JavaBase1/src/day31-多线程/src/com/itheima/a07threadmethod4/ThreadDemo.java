package com.itheima.a07threadmethod4;

/*
 * public static void yield()      出让线程/礼让线程
 *
 * 尽可能出让，不能百分百
 */
public class ThreadDemo {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread1 t3 = new MyThread1();

		t1.setName("飞机");
		t2.setName("坦克");
		t3.setName("哈哈");

		t1.start();
		t2.start();
		t3.start();
	}
}
