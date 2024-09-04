package com.itheima.listdemo;

import java.util.ArrayList;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		// 创建int类型数组
		int[] arr = new int[3];


		//	1.创建集合的对象
		//	泛型<E>：限定集合中存储数据的类型


		// 集合中不能存基本数据类型，因此会报错
		//ArrayList<int> intList = new ArrayList<int>();


		// 创建String类型集合
		ArrayList<String> list1 = new ArrayList<String>();    // JDK7之前的写法
		ArrayList<String> list2 = new ArrayList<>();        // JDK7之后的写法，可以省略后面的类型书写，但是需要保留尖括号<>


		/**
		 * 我们创建的是ArrayList的对象，而ArrayList是java已经写好的一个类
		 * 		这个类在底层做了一些处理:
		 * 			a.打印对象不是地址值，而是集合中存储数据内容
		 * 			b.在展示的时候会拿[]把所有的数据进行包裹
		 */
		System.out.println(list2);    // []
	}
}
