package com.itheima.myiotest9;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * 读取本地Properties文件里面的数据
 */
public class Test3 {
	public static void main(String[] args) throws IOException {
		// 1.创建集合
		Properties prop = new Properties();

		// 2.读取本地Properties文件里面的数据
		FileInputStream fis = new FileInputStream("/Users/daykalif/Desktop/Java/JavaBase1/src/day30-阶段综合案例（带权重的随机&每日一记）/src/com/itheima/myiotest9/a.properties");
		prop.load(fis);
		fis.close();

		// 3.打印集合
		System.out.println(prop);
	}
}
