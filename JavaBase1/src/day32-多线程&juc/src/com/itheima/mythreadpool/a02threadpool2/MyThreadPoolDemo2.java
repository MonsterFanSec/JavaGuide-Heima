package com.itheima.mythreadpool.a02threadpool2;

/*
 * 线程池多大合适呢？
 *
 * CPU密集型运算：最大并行数 + 1
 * I/O密集型运算：最大并行数 * 期望CPU利用率 * （总时间（CPU计算时间+等待时间）/ CPU计算时间）
 *
 * 4核8线程：
 * 	举例：从本地文件中，读取两个数据，并进行相加
 * 		操作一：读取两个数据（1秒钟）
 * 		操作二：相加（1秒钟）
 *
 * 		8 * 100% * （100% / 50%）= 16
 */
public class MyThreadPoolDemo2 {
	public static void main(String[] args) {
		// 向Java虚拟机返回可用处理器的数目
		int count = Runtime.getRuntime().availableProcessors();
		System.out.println(count);
	}
}
