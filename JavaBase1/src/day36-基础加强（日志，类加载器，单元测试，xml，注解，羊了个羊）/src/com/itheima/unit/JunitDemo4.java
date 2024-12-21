package com.itheima.unit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 默认情况下，相对路径是相对项目而言。
 *
 * 扩展点：
 * 		在单元测试中，相对路径是相对当前模块而言的。
 */
public class JunitDemo4 {
	@Before
	public void beforeMethod() throws IOException {
		File file = new File("daykalifhaoshuai.txt");
		// 此时是把daykalifhaoshuai.txt这个文件新建到模块中了。
		file.createNewFile();
	}

	@Test
	public void method() {

	}

	@After
	public void afterMethod() throws IOException {

	}
}
