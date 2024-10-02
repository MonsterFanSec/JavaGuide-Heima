package com.itheima.a07mygenerics.generics_function;

import java.util.ArrayList;


/*
 * 泛型方法：
 *     方法中形参类型不确定时，可以使用类名后面定义的泛型<E>
 *
 * public class MyArrayList {
 *	 public <E> boolean add(E e) {
 *		 obj[size] = e;
 *		 size++;
 *		 return true;
 *	 }
 * }
 *
 * 方法中形参类型不确定时：
 * 		方案1:使用类名后面定义的泛型			（所有方法都能用）
 * 		方案2:在方法申明上定义自己的泛型			（只有本方法能用）
 *
 * 格式：
 * 		修饰符<类型>返回值类型 方法名(类型 变量名){
 *
 * 		}
 *
 * 举例：
 * 		public<T> void show(T t){
 *			// 调用该方法时，T就确定类型
 * 		}
 *
 *  此处T可以理解为变量，但是不是用来记录数据的，而是记录数据的类型，可以写成：T（type）、E（element）、K（key）、V（value）
 */


/*
 * 定义一个工具类：ListUtil
 * 类中定义一个静态方法addAll，用来添加多个集合的元素。
 */
public class GenericsDemo3 {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		ListUtil.addAll(list1, "aaa", "bbb", "ccc", "ddd");
		System.out.println(list1);

		ArrayList<Integer> list2 = new ArrayList<>();
		ListUtil.addAll(list2, 1, 2, 3, 4);
		System.out.println(list2);


		ArrayList<Integer> list3 = new ArrayList<>();
		ListUtil.addAll2(list3, 1, 2, 3, 4, 5, 6, 7, 8);
		System.out.println(list3);
	}
}
