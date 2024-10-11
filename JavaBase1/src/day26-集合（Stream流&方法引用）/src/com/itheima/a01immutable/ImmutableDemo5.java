package com.itheima.a01immutable;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 创建Map的不可变集合,键值对的数量超过10个
 * 使用：ofEntries方法
 */
public class ImmutableDemo5 {
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
		Map<Object, Object> map = Map.ofEntries(hm.entrySet().toArray(new Map.Entry[0]));
		map.put("bbb", "222");    // 报错

		// 3.第2步的方式太过麻烦，java提供了copyOf，底层会判断是否是不可变集合；JDK10之后才出现
		Map<String, String> map1 = Map.copyOf(hm);
		map1.put("bbb", "222");    // 报错
	}
}
