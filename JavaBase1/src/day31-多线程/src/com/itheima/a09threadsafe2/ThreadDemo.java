package com.itheima.a09threadsafe2;

/*
 * 需求：
 *      某电影院目前正在上映国产大片，共有100张票，而它有3个窗口卖票，请设计一个程序模拟该电影院卖票
 *
 * 技巧：同步代码块
 * 同步代码块：
 * 		把操作共享数据的代码锁起来
 *
 * 格式：
 * 		synchronized (锁){
 * 			操作共享数据的代码
 * 		}
 *
 * 	特点1:锁默认打开，有一个线程进去了，锁自动关闭
 *  特点2:里面的代码全部执行完毕，线程出来，锁自动打开
 */
public class ThreadDemo {
	public static void main(String[] args) {
		// 创建线程对象
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();

		// 起名字
		t1.setName("窗口1");
		t2.setName("窗口2");
		t3.setName("窗口3");

		// 开启线程
		t1.start();
		t2.start();
		t3.start();
	}
}