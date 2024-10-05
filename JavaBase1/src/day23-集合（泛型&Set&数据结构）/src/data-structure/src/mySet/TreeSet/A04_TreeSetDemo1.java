package mySet.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

/*
 * TreeSet的特点：
 *  - 不重复、无索引、可排序
 *  - 可排序：按照元素的默认规则（由小到大）排序。
 *  - TreeSet集合底层是基于红黑树的数据结构实现排序的，增删改查性能都较好。
 *
 *
 * 练习：TreeSet对象排序练习题
 *      需求：利用TreeSet存储整数并进行排序
 */
public class A04_TreeSetDemo1 {
	public static void main(String[] args) {
		// 1.创建TreeSet集合对象
		TreeSet<Integer> ts = new TreeSet<>();

		// 2.添加元素
		ts.add(4);
		ts.add(5);
		ts.add(1);
		ts.add(3);
		ts.add(2);

		// 3.打印集合
		System.out.println(ts);
		System.out.println("==========================");

		// 4.遍历集合（三种遍历）
		// 迭代器
		Iterator<Integer> it = ts.iterator();
		while (it.hasNext()) {
			int i = it.next();
			System.out.println(i);
		}
		System.out.println("--------------------------");

		// 增强for
		for (int t : ts) {
			System.out.println(t);
		}
		System.out.println("--------------------------");

		// lambda
		ts.forEach(i -> System.out.println(i));
	}
}
