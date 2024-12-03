package com.itheima.a14waitandnotify;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie extends Thread {

	ArrayBlockingQueue<String> queue;

	public Foodie(ArrayBlockingQueue<String> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		while (true) {
			// 不断从阻塞队列中获取面条
			try {
				String food = queue.take();
				System.out.println("吃货吃了一碗--->>>" + food);    // 由于打印语句是书写在锁的外面，所以在打印的时候不是交替打印
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
