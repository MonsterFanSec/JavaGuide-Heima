package com.itheima.unit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

/*
 * 在实际开发中，真正的完整的单元测试该怎么写？
 *
 * 前提：
 * 	以后在工作的时候，测试代码不能污染（修改/篡改）原数据。
 *
 * 1.利用Before去对数据做一个初始化的动作
 * 2.利用Test真正的去测试方法
 * 3.利用After去还原数据
 *
 * 需求：测试File类中的delete方法是否书写正确？？？
 */
public class JunitDemo3 {
	@Before
	public void beforeMethod() throws IOException {
		System.out.println("beforeMethod");
		//	先备份
		File src = new File("/Users/daykalif/Desktop/Java/JavaBase1/src/day36-基础加强（日志，类加载器，单元测试，xml，注解，羊了个羊）/src/com/itheima/unit/aaa.txt");
		File dest = new File("/Users/daykalif/Desktop/Java/JavaBase1/src/day36-基础加强（日志，类加载器，单元测试，xml，注解，羊了个羊）/src/com/itheima/unit/copy.txt");
		FileInputStream fis = new FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(dest);
		int b;
		while ((b = fis.read()) != -1) {
			fos.write(b);
		}
		fos.close();
		fis.close();
	}

	@Test
	public void method() {
		System.out.println("Test");

		File file = new File("/Users/daykalif/Desktop/Java/JavaBase1/src/day36-基础加强（日志，类加载器，单元测试，xml，注解，羊了个羊）/src/com/itheima/unit/aaa.txt");
		boolean delete = file.delete();

		// 检查a.txt是否存在
		boolean exists = file.exists();

		// 只有同时满足了下面所有的断言，才表示delete方法编写正确
		Assert.assertEquals("delete方法出错了", delete, true);
		Assert.assertEquals("delete方法出错了", exists, false);
	}

	@After
	public void afterMethod() throws IOException {
		System.out.println("afterMethod");
		//	还要对a.txt做一个还原
		File src = new File("/Users/daykalif/Desktop/Java/JavaBase1/src/day36-基础加强（日志，类加载器，单元测试，xml，注解，羊了个羊）/src/com/itheima/unit/copy.txt");
		File dest = new File("/Users/daykalif/Desktop/Java/JavaBase1/src/day36-基础加强（日志，类加载器，单元测试，xml，注解，羊了个羊）/src/com/itheima/unit/aaa.txt");
		FileInputStream fis = new FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(dest);
		int b;
		while ((b = fis.read()) != -1) {
			fos.write(b);
		}
		fos.close();
		fis.close();
		//	备份数据要删除
		src.delete();
	}
}
