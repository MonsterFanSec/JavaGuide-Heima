package com.itheima.a02mystream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;
import java.util.stream.Stream;

/*
 * Stream流的作用：
 * 		结合了Lambda表达式，简化集合、数组的操作
 *
 * Stream流的使用步骤：
 * 		1.先得到一条Stream流（流水线），并把数据放上去
 * 			单列集合      default Stream<E> stream()                              Collection中的默认方法
 * 			双列集合      无                                                      无法直接使用stream流，需要先通过KeySet()或entrySet()先转成单列集合
 * 			数组          public static <T> Stream<T> stream(T[] array)          Arrays工具类中的静态方法
 * 			一堆零散数据   public static<T> Stream<T> of(T... values)             Stream接口中的静态方法，values需要保持类型一致
 *
 * 		2.利用Stream流中的中间方法对流水线上的数据进行操作
 * 			过滤、转换		中间方法：方法调用完毕之后，还可以调用其他方法
 *
 * 		3.利用Stream流中的终结方法对流水线上的数据进行操作
 * 			统计、打印		终结方法：最后一步，调用完毕之后，不能调用其他方法
 */


/**
 * 演示：单列集合获取stream流
 */
public class StreamDemo2 {
	public static void main(String[] args) {
		// 1.单列集合获取Stream流
		ArrayList<String> list = new ArrayList<>();
		Collections.addAll(list, "a", "b", "c", "d", "e");

		/*
		 * ArrayList 是 Collection的实现类，可以直接调用list.stream()
		 *
		 * 获取到一条流水线，并把集合中的数据放到流水线上
		 */
		Stream<String> stream1 = list.stream();

		// 使用终结方法打印一下流水线上的所有数据
		stream1.forEach(new Consumer<String>() {
			@Override
			public void accept(String s) {
				// s:依次表示流水线上的每一个数据
				System.out.println(s);
			}
		});
		System.out.println("============================");

		// 链式编程
		list.stream().forEach(s -> System.out.println(s));
	}
}







