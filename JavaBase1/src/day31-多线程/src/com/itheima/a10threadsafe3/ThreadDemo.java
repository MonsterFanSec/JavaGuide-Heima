package com.itheima.a10threadsafe3;

/*
 * 需求：
 *      某电影院目前正在上映国产大片，共有100张票，而它有3个窗口卖票，请设计一个程序模拟该电影院卖票
 *      利用同步方法完成
 *
 * 同步方法：
 * 		就是把synchronized关键字加到方法上
 *
 * 格式：
 * 		修饰符 synchronized 返回值类型 方法名(方法参数) {...}
 *
 * 特点1:同步方法是锁住方法里面所有的代码
 * 特点2:锁对象不能自己指定，由Java指定好的
 * 			如果当前方法是非静态的，那么当前的锁对象是this。就是当前方法的调用者
 * 			如果当前方法是静态的，那么当前的锁对象是当前类的字节码文件对象
 *
 * StringBuilder：
 * 		将StringBuilder的实例用于多个线程是不安全的。如果需要这样的同步，则建议使用StringBuffer。
 * StringBuffer：
 * 		所有的方法都是同步的，都有synchronized关键字
 * 如果代码是单线程的，不需要考虑数据安全，则使用StringBuilder；
 * 如果代码是当线程的，需要考虑数据安全，则使用StringBuffer；
 */
public class ThreadDemo {
	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();

		Thread t1 = new Thread(mr);
		Thread t2 = new Thread(mr);
		Thread t3 = new Thread(mr);

		t1.setName("窗口1");
		t2.setName("窗口2");
		t3.setName("窗口3");

		t1.start();
		t2.start();
		t3.start();
	}
}