package com.itheima.anno.demo4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException {
		//	1.获取MockJunit这个类的字节码文件对象
		Class<?> clazz = Class.forName("com.itheima.anno.demo4.MockJunit");

		//	补一个对象
		MockJunit mtd = new MockJunit();

		//	2.获取所有方法
		Method[] methods = clazz.getDeclaredMethods();

		//	3.遍历得到每一个方法
		for (Method method : methods) {
			//	4.临时修改权限
			method.setAccessible(true);
			//	5.判断当前方法上面有没有MyTest注解
			if (method.isAnnotationPresent(MyTest.class)) {
				method.invoke(mtd);
			}
		}
	}
}
