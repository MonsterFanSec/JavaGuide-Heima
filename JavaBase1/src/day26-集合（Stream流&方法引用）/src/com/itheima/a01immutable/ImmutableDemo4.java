package com.itheima.a01immutable;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 创建Map的不可变集合,键值对的数量超过10个
 * 使用：ofEntries方法
 *
 * 这份文档太过复杂，可参考demo5，在JDK10之后，使用copyOf方法
 */
public class ImmutableDemo4 {
	public static void main(String[] args) {
		// 1.创建一个普通的Map集合
		HashMap<String, String> hm = new HashMap<>();
		hm.put("张三", "南京");
		hm.put("李四", "北京");
		hm.put("王五", "上海");
		hm.put("赵六", "北京");
		hm.put("孙七", "深圳");
		hm.put("周八", "杭州");
		hm.put("吴九", "宁波");
		hm.put("郑十", "苏州");
		hm.put("刘一", "无锡");
		hm.put("陈二", "嘉兴");
		hm.put("aaa", "111");

		// 2.利用上面的数据来获取一个不可变的集合

		// 获取到所有的键值对对象（Entry对象）
		Set<Map.Entry<String, String>> entries = hm.entrySet();
		System.out.println(entries);

		/*
		 * 如果创建的时候调用空参，没有指定类型，则会使用Object类型
		 *
		 * 		Object[] objects = entries.toArray();
		 * 		for (Object object : objects) {
		 * 			System.out.println(object);
		 *      }
		 */


		/*
		 * 把entries变成一个数组：
		 * 		Map.Entry[] arr = entries.toArray(new Map.Entry[0]);
		 *
		 * toArray方法在底层会比较集合的长度跟数组的长度两者的大小：
		 * 		如果集合的长度 > 数组的长度 ：数据在数组中放不下，此时会根据实际数据的个数，重新创建数组
		 * 		如果集合的长度 <= 数组的长度：数据在数组中放的下，此时不会创建新的数组，而是直接用；多余未赋值的部分赋值为null
		 */
		Map.Entry[] arr1 = new Map.Entry[20];    // map.entries是个内部接口，可以定义一对泛型(Entry<K,V>)[20]，20是数组的长度
		Map.Entry[] arr2 = entries.toArray(arr1);


		// ofEntries方法创建大于10个键值对的不可变的map集合
		Map map = Map.ofEntries(arr2);
		map.put("bbb", "222");    // 报错
	}
}
