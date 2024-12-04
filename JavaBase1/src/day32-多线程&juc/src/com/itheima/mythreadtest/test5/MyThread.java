package com.itheima.mythreadtest.test5;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread extends Thread {
	ArrayList<Integer> list;

	public MyThread(ArrayList<Integer> list) {
		this.list = list;
	}

	@Override
	public void run() {
		// 1.循环
		while (true) {
			// 2.同步代码块
			synchronized (MyThread.class) {
				if (list.size() == 0) {
					// 3.判断，共享数据是否到了末尾（已经到末尾）
					break;
				} else {
					// 4.判断，共享数据是否到了末尾（没有到末尾）
					// 继续抽奖
					Collections.shuffle(list);
					int prize = list.remove(0);
					System.out.println(getName() + "又产生了一个" + prize + "元大奖");
				}
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
