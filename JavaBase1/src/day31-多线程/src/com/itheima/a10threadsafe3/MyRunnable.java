package com.itheima.a10threadsafe3;

public class MyRunnable implements Runnable {
	// MyRunnable是用作参数让线程去执行的，只会创建一次MyRunnable对象，所以没有必要加static
	int ticket = 0;

	@Override
	public void run() {
		// 1.循环
		while (true) {
			// 2.同步代码块（同步方法）
			if (method()) break;	// 抽离方法快捷键：command + option + M
		}
	}

	// 非静态方法，当前的锁对象是this，也就是外层MyRunnable mr = new MyRunnable()中的mr，mr是唯一的
	private synchronized boolean method() {
		// 3.判断共享数据是否到了末尾，如果到了末尾
		if (ticket == 100) {
			return true;
		} else {
			// 4.判断共享数据是否到了末尾，如果没有到末尾
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			ticket++;
			System.out.println(Thread.currentThread().getName() + "在卖第" + ticket + "张票！！！");
		}
		return false;
	}
}
