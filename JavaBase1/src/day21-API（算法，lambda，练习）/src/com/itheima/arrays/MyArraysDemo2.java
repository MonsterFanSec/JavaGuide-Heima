package com.itheima.arrays;

import java.util.Arrays;
import java.util.Comparator;

/*
 * 第二个参数是一个接口，所以我们在调用方法的时候，需要传递这个接口的实现类对象，作为排序的规则。
 * 但是这个实现类，我只需要使用一次，所以就没有必要单独的去写一个类，直接采取匿名内部类的方式就可以了。
 *
 * 底层原理：
 * 利用插入排序 + 二分查找的方式进行排序的。
 *
 * 默认把0索引的数据当作是有序的序列，1索引到最后认为是无序的序列。
 * 遍历无序的序列得到里面的每一个元素，
 * 假设当前遍历得到的元素是A元素，
 * 把A往有序序列中进行插入，在插入的时候，是利用二分查找确定A元素的插入点。
 * 拿着A元素，跟插入点的元素进行比较，比较的规则就是compare方法的方法体。
 *
 * 如果方法的返回值是负数，拿着A继续跟前面的数据进行比较
 * 如果方法的返回值是整数，拿着A继续跟后面的数据进行比较
 * 如果方法的返回值是0，也拿着A继续跟后面的数据进行比较
 * 直到能确定A的最终位置为止。
 *
 * 返回值：
 * 负数：表示当前要插入的元素是小的，放在前面
 * 整数：表示当前要插入的元素是大的，放在后面
 * 0：表示当前要插入的元素跟现在的元素比是一样的，也会放在后面
 *
 * 简单理解：
 * o1 - o2：升序排列
 * o2 - o1：降序排列
 */
public class MyArraysDemo2 {
	public static void main(String[] args) {
		Integer[] arr = {10, 2, 4, 5, 8, 7, 3, 9, 1, 6};

		Arrays.sort(arr, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				System.out.println("o1:" + o1);
				System.out.println("o2:" + o2);
				System.out.println("---------------");
				return o2 - o1;
			}
		});
		System.out.println(Arrays.toString(arr));
	}
}
