package com.itheima.a02mystream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * collect(Collector collector)            收集流中的数据，放到集合中 (List Set Map)
 *
 * 注意点：如果我们要收集到Map集合当中，键不能重复，否则会报错
 */
public class StreamDemo10 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		Collections.addAll(list, "张无忌-男-15", "周芷若-女-14", "赵敏-女-13", "张强-男-20",
				"张三丰-男-100", "张翠山-男-40", "张良-男-35", "王二麻子-男-37", "谢广坤-男-41");


		// 收集List集合当中
		// 需求：我要把所有的男性收集起来
		List<String> newList1 = list.stream()
				.filter(s -> "男".equals(s.split("-")[1]))
				.collect(Collectors.toList());    // Collectors是一个工具类
		System.out.println(newList1);
		System.out.println("=================================");


		// 收集Set集合当中（底层是HashSet，无序，不重复）
		// 需求：我要把所有的男性收集起来
		Set<String> newList2 = list.stream().filter(s -> "男".equals(s.split("-")[1]))
				.collect(Collectors.toSet());
		System.out.println(newList2);
		System.out.println("=================================");


		/*
		 * 收集Map集合当中
		 *
		 * 需要思考：谁作为键,谁作为值.
		 *
		 * 需求：我要把所有的男性收集起来
		 * 		键：姓名。 值：年龄
		 */
		Map<String, Integer> map = list.stream()
				.filter(s -> "男".equals(s.split("-")[1]))
				/*
				 * toMap : 参数一表示键的生成规则
				 *         参数二表示值的生成规则
				 *
				 * 参数一：
				 *       Function泛型一：表示流中每一个数据的类型
				 *               泛型二：表示Map集合中键的数据类型
				 *
				 *        方法apply形参：依次表示流里面的每一个数据
				 *               方法体：生成键的代码
				 *               返回值：已经生成的键
				 *
				 *
				 * 参数二：
				 *        Function泛型一：表示流中每一个数据的类型
				 *                泛型二：表示Map集合中值的数据类型
				 *
				 *       方法apply形参：依次表示流里面的每一个数据
				 *               方法体：生成值的代码
				 *               返回值：已经生成的值
				 * */
				.collect(Collectors.toMap(
						// 键的规则
						new Function<String, String>() {
							@Override
							public String apply(String s) {	// s：张无忌-男-15 ...
								return s.split("-")[0];
							}
						},
						// 值的规则
						new Function<String, Integer>() {
							@Override
							public Integer apply(String s) {
								return Integer.parseInt(s.split("-")[2]);
							}
						}));
		System.out.println(map);
		System.out.println("=================================");


		Map<String, Integer> map2 = list.stream()
				.filter(s -> "男".equals(s.split("-")[1]))
				.collect(
						Collectors.toMap(
								s -> s.split("-")[0],
								s -> Integer.parseInt(s.split("-")[2])
						)
				);
		System.out.println(map2);
	}
}
