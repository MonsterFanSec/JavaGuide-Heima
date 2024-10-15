package com.itheima.a02mystream;

import java.util.stream.Stream;

/*
 * 一堆零散数据   public static<T> Stream<T> of(T... values)           Stream接口中的静态方法
 *
 * 演示：一堆零散数据获取stream流，需要保证传入的数据类型一致
 */
public class StreamDemo5 {
	public static void main(String[] args) {
		Stream.of(1, 2, 3, 4, 5).forEach(s -> System.out.println(s));
		System.out.println("==========================");
		Stream.of("a", "b", "c", "d", "e").forEach(s -> System.out.println(s));
		System.out.println("==========================");


		/*
		 * 注意：
		 * 		Stream接口中静态方法of的细节
		 * 		方法的形参是一个可变参数，可以传递一堆零散的数据，也可以传递数组
		 * 		但是数组必须是引用数据类型的，如果传递基本数据类型，是会把整个数组当做一个元素，放到Stream当中。
		 */
		// 创建数组
		int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};    // 基本数据类型
		String[] arr2 = {"a", "b", "c"};                 // 引用数据类型
		Stream.of(arr1).forEach(s -> System.out.println(s));    // [I@41629346
		System.out.println("==========================");
		Stream.of(arr2).forEach(s -> System.out.println(s));    // a b c
	}
}
