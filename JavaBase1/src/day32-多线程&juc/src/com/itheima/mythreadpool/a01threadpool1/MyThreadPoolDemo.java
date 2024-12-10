package com.itheima.mythreadpool.a01threadpool1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * 线程池代码实现：
 * 		Executors:线程池的工具类通过调用方法返回不同类型的线程池对象。
 *
 * public static ExecutorService newCachedThreadPool()                  创建一个没有上限的线程池（int的最大值）
 * public static ExecutorService newFixedThreadPool (int nThreads)      创建有上限的线程池
 *
 *
 * 线程池主要核心原理
 * 1.创建一个池子，池子中是空的
 * 2.提交任务时，池子会创建新的线程对象，执行任务完毕，线程池归还给池子。
 *   下次再次提交任务时，不需要创建新的线程，直接复用已有的线程即可。
 * 3.但是如果提交任务时，池子中没有空闲线程，也无法创建新的线程，任务就会排队等待。
 */
public class MyThreadPoolDemo {
	public static void main(String[] args) throws InterruptedException {
		// 1.获取线程池对象
		ExecutorService pool1 = Executors.newFixedThreadPool(3);

		Thread.sleep(1000);

		// 2.提交任务
		pool1.submit(new MyRunnable());
		pool1.submit(new MyRunnable());
		pool1.submit(new MyRunnable());
		pool1.submit(new MyRunnable());
		pool1.submit(new MyRunnable());
		pool1.submit(new MyRunnable());

		// 3.所有的任务全部执行完毕，关闭线程池（但是一般不关闭，因为服务器是不会关闭的）
		// pool1.shutdown();
	}
}
