package com.itheima.a08call_the_roll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/*
 * 班级里有5个学生
 * 要求：
 *      被点到的学生不会再被点到。
 *      但是如果班级中所有的学生都点完了，需要重新开启第二轮点名。
 */
public class Test3 {
	public static void main(String[] args) {
		// 1.定义集合
		ArrayList<String> list1 = new ArrayList<>();

		// 2.添加数据
		Collections.addAll(list1, "范闲", "范建", "范统", "杜子腾", "杜琦燕", "宋合泛", "侯笼藤", "朱益群", "朱穆朗玛峰", "袁明媛");


		/*
		 * 有问题的写法：
		 * 		第一次随机的时候：i=0	长度=10
		 * 		第二次随机的时候：i=1	长度=9
		 * 		第三次随机的时候：i=2	长度=8
		 * 		第四次随机的时候：i=3	长度=7
		 * 		第五次随机的时候：i=4	长度=6
		 * 		第六次随机的时候：i=5	长度=5	（5 < 5，循环结束）
		 *
		 * Random p = new Random();
		 * for (int j = 0; j < list1.size(); j++) {
		 * 		int index = p.nextInt(list1.size());
		 * 		String name = list1.remove(index);
		 * 		System.out.println("删除的元素：" + name);
		 * }
		 */


		/*
		 * 正确的写法：
		 */
		// 创建一个临时的集合，用来存已经被点到学生的名字
		ArrayList<String> list2 = new ArrayList<>();

		// 外循环：表示轮数
		for (int i = 1; i <= 10; i++) {
			System.out.println("=========第" + i + "轮点名开始了======================");
			// 3.获取集合的长度
			int count = list1.size();
			// 4.随机点名
			Random r = new Random();
			// 内循环：每一轮中随机循环抽取的过程
			for (int j = 0; j < count; j++) {
				int index = r.nextInt(list1.size());
				String name = list1.remove(index);
				list2.add(name);
				System.out.println(name);
			}
			// 此时表示一轮点名结束：list1 空了；list2 10个学生的名字
			list1.addAll(list2);
			list2.clear();
		}
	}
}
