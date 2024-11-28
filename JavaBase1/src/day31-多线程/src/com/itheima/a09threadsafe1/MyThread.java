package com.itheima.a09threadsafe1;

public class MyThread extends Thread {
	// 加上static表示这个类所有的对象，都共享ticket数据
	static int ticket = 0;    //0 ~ 99

	@Override
	public void run() {
		while (true) {
			if (ticket < 100) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				ticket++;
				System.out.println(getName() + "正在卖第" + ticket + "张票！！！");	// 可能会出现溢出的情况，原因是第一个线程还没执行完这部分共享逻辑时，第二个线程就开始执行了
			} else {
				break;
			}
		}
	}
}
