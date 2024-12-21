package com.itheima.unit;

import org.junit.Test;

public class JunitDemo1 {
	/*
	 * 1.用鼠标点击@Test
	 * 2.按快捷键 alt + 回车
	 * 3.选择导入的jar包。 选择第一个Junit4即可。
	 *
	 * 如果无法导入，解决方案有2个：
	 * 1.连一个外网。此时idea会自动的去下载Junit4的jar包。
	 * 2.如果连接外网还搞不定，那么把今天资料文件夹中的2个jar包手动导入即可。
	 */
	@Test
	public void method1() {
		int a = 10;
		int b = 20;
		int result = a + b;
		System.out.println(result);
	}

	@Test
	public void method2() {
		System.out.println(2/0);
		int a = 10;
		int b = 20;
		int result = a + b;
		System.out.println(result);
	}
}
