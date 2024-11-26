package com.itheima.a07threadmethod4;

public class MyThread1 extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			System.out.println(getName() + "@" + i);
		}
	}
}
