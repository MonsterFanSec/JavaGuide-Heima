package com.itheima.a02mystream;

import java.util.HashMap;

/*
 * 双列集合      无                       无法直接使用stream流，需要先通过KeySet()或entrySet()先转成单列集合
 *
 * 演示：双列集合获取stream流
 */
public class StreamDemo3 {
	public static void main(String[] args) {
		// 1.创建双列集合
		HashMap<String, Integer> hm = new HashMap<>();	// HashMap底层是hash表，不能保证存和取的顺序

		// 2.添加数据
		hm.put("aaa", 111);
		hm.put("bbb", 222);
		hm.put("ccc", 333);
		hm.put("ddd", 444);

		// 3.第一种获取stream流
		hm.keySet().stream().forEach(s -> System.out.println(s));
		System.out.println("========================");

		// 4.第二种获取stream流
		hm.entrySet().stream().forEach(s -> System.out.println(s));
	}
}
