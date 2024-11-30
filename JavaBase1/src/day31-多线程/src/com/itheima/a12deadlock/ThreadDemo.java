package com.itheima.a12deadlock;

/*
 * 需求：死锁
 *
 * 死锁是一个错误，需要了解其产生的原因。自己写代码的时候应尽量避免出现这类错误
 */
public class ThreadDemo {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();

		t1.setName("线程A");
		t2.setName("线程B");

		t1.start();
		t2.start();
	}
}