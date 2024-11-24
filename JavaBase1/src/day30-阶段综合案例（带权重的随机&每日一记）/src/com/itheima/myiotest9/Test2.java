package com.itheima.myiotest9;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/*
 * Properties跟IO流结合的操作：
 * 		把集合中的数据以键值对的形式写到本地文件当中
 */
public class Test2 {
	public static void main(String[] args) throws IOException {
		// 1.创建集合
		Properties prop = new Properties();

		// 2.添加数据
		prop.put("aaa", "bbb");
		prop.put("bbb", "ccc");
		prop.put("ddd", "eee");
		prop.put("fff", "iii");

		/*
		 * 3.把集合中的数据以键值对的形式写到本地文件当中
		 */
		// 方法一：Map公共方法
		BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/daykalif/Desktop/Java/JavaBase1/src/day30-阶段综合案例（带权重的随机&每日一记）/src/com/itheima/myiotest9/a.properties"));
		Set<Map.Entry<Object, Object>> entries = prop.entrySet();
		for (Map.Entry<Object, Object> entry : entries) {
			Object key = entry.getKey();
			Object value = entry.getValue();
			bw.write(key + "=" + value);
			bw.newLine();
		}
		bw.close();


		// 方法二：利用properties特有方法
		FileOutputStream fos = new FileOutputStream("/Users/daykalif/Desktop/Java/JavaBase1/src/day30-阶段综合案例（带权重的随机&每日一记）/src/com/itheima/myiotest9/a.properties");
		prop.store(fos, "test");	// 第一个参数是IO流，第二个参数是注释信息
		fos.close();
	}
}
