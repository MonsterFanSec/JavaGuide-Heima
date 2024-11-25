package com.itheima.a05threadmethod2;

/*
 * 抢占式调度和非抢占式调度：
 * 		Java默认是使用抢占式调度，它是随机的；随机和优先级有关
 * 		优先级有10档，最小是1，最大是10；如果不设置，默认优先级为5；
 * 		优先级越高，仅表示抢到的概率更高，但不是100%；
 *
 * setPriority(int newPriority)        设置线程的优先级
 * final int getPriority()             获取线程的优先级
 */
public class ThreadDemo {
	public static void main(String[] args) {
		// 创建线程要执行的参数对象
		MyRunnable mr = new MyRunnable();

		// 创建线程对象
		Thread t1 = new Thread(mr, "飞机");
		Thread t2 = new Thread(mr, "坦克");

		t1.setPriority(1);
		t2.setPriority(10);

		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(Thread.currentThread().getPriority());

		t1.start();
		t2.start();
	}
}
