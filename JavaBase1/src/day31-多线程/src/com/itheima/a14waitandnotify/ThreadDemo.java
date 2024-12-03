package com.itheima.a14waitandnotify;

import java.util.concurrent.ArrayBlockingQueue;

/*
 * 需求：利用阻塞队列完成生产者和消费者（等待唤醒机制）的代码
 * 细节：生产者和消费者必须使用同一个阻塞队列
 *
 * 阻塞队列的继承结构：
 *      顶层接口是：Iterable              -----> 表示阻塞队列是可以利用迭代器/增强for实现遍历
 *                Collection            -----> 表示阻塞队列是单列集合
 *                Queue                 -----> 是一个队列
 *                BlockingQueue         -----> 是一个阻塞队列
 *      上面4个都是接口，不能直接创建它们的对象；
 *
 *      实现类：ArrayBlockingQueue
 *                  底层是数组，有界
 *             LinkedBlockingQueue
 *                  底层是链表，无界；但不是真正的无界；
 *                  最大为：int的最大值
 */
public class ThreadDemo {
	public static void main(String[] args) {
		// 1.创建阻塞队列的对象
		ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);

		// 2.创建线程的对象，并把阻塞队列传递过去
		Cook c = new Cook(queue);
		Foodie f = new Foodie(queue);

		// 3.开启线程
		c.start();
		f.start();
	}
}