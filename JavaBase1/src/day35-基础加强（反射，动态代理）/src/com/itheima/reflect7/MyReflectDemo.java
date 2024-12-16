package com.itheima.reflect7;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/*
 * 练习二：跟配置文件结合动态创建
 * 反射可以跟配置文件结合的方式，动态的创建对象，并调用方法
 *
 *
 * 总结：
 * 	1.反射的作用：
 * 		a.获取任意一个类中的所有信息
 * 		b.结合配置文件动态创建对象
 * 	2.获取class字节码文件对象的三种方式
 * 		a.Class.forName("全类名");
 * 		b.类名.class
 * 		c.对象.getClass();
 *  3.如何获取构造方法、成员方法、成员变量
 * 		get：获取								set：设置
 * 		Constructor：构造方法						Parameter：参数
 * 		Field：成员变量							Modifiers：修饰符
 * 		Method：方法								Declared：私有的
 */
public class MyReflectDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
		// 1.读取配置文件中的信息
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("/Users/daykalif/Desktop/Java/JavaBase1/src/day35-基础加强（反射，动态代理）/src/com/itheima/reflect7/prop.properties");
		prop.load(fis);
		fis.close();
		System.out.println(prop);

		// 2.获取全类名和方法名
		String className = (String) prop.get("classname");
		String methodName = (String) prop.get("method");

		System.out.println(className);
		System.out.println(methodName);

		// 3.利用反射创建对象并运行方法（获取字节码文件对象）
		Class clazz = Class.forName(className);

		// 获取构造方法
		Constructor con = clazz.getDeclaredConstructor();
		// 利用构造方法创建对象
		Object o = con.newInstance();
		System.out.println(o);

		// 获取成员方法并运行
		Method method = clazz.getDeclaredMethod(methodName);
		method.setAccessible(true);
		method.invoke(o);
	}
}