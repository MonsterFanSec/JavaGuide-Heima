package com.itheima.classLoader;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/*
 * 类加载器：
 * 		public static ClassLoader getSystemClassLoader()				获取系统类加载器
 * 		public inputStream getResourceAsStream(String name)				加载某一个资源文件
 */
public class Test2 {
	public static void main(String[] args) throws IOException {
// 获得系统类加载器
		ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();

		/*
		 * 利用加载器去加载一个指定的文件
		 * 参数：文件的路径
		 * 返回值：字节流
		 */
		InputStream is = systemClassLoader.getResourceAsStream("prop.properties");
		Properties prop = new Properties();
		prop.load(is);

		System.out.println(prop);
		is.close();
	}
}
