package com.itheima.a09threadsafe2;

public class MyThread extends Thread {
	// 加上static表示这个类所有的对象，都共享ticket数据
	static int ticket = 0;    //0 ~ 99

	// synchronized后面的锁对象，一定要是唯一的；
	static Object obj = new Object();

	@Override
	public void run() {
		while (true) {
			/*
			 * 细节一：
			 * 		注意这一行不能写在循环外面；
			 *
			 * 细节二：
			 * 		这一行也可以写成：synchronized (this)
			 * 					线程1进来的时候，this表示线程1本身
			 * 					线程2进来的时候，this表示线程2本身
			 *
			 * 		这一行也可以写成：synchronized (MyThread.class)
			 * 					MyThread.class是当前类的字节码文件对象，一定是唯一的
			 *
			 * 利用同步代码块解决了a09threadsafe1中溢出的问题；
			 */
			synchronized (obj) {
				if (ticket < 100) {
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					ticket++;
					System.out.println(getName() + "正在卖第" + ticket + "张票！！！");
				} else {
					break;
				}
			}
		}
	}
}
