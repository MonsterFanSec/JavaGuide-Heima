package com.itheima.reflect4;

import java.lang.reflect.Field;

/*
 * Class类中用于获取成员变量的方法
 *      Field[] getFields()：                返回所有公共成员变量对象的数组
 *      Field[] getDeclaredFields()：        返回所有成员变量对象的数组
 *      Field getField(String name)：        返回单个公共成员变量对象
 *      Field getDeclaredField(String name)：返回单个成员变量对象
 *
 * Field类中用于创建对象的方法
 *      void set(Object obj, Object value)：赋值
 *      Object get(Object obj)              获取值
 */
public class MyReflectDemo {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
		// 1.获取class字节码文件的对象
		Class clazz = Class.forName("com.itheima.reflect4.Student");

		// 2.获取所有的成员变量
		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field);
		}

		// 获取单个的成员变量
		Field name = clazz.getDeclaredField("name");
		System.out.println(name);

		/*
		Field name1 = clazz.getField("name");
		System.out.println(name1);	// 报错，因为name是私有的
		*/

		// 获取权限修饰符
		int modifiers = name.getModifiers();
		System.out.println(modifiers);

		// 获取成员变量的名字
		String n = name.getName();
		System.out.println(n);

		// 获取成员变量的数据类型
		Class<?> type = name.getType();
		System.out.println(type);

		// 获取成员变量记录的值
		Student s = new Student("zhangsan", 23, "男");

		// 暴力反射：表示临时取消权限校验
		name.setAccessible(true);
		String value = (String) name.get(s);
		System.out.println(value);

		// 用反射的方式，修改对象里面记录的值
		name.set(s, "lisi");

		System.out.println(s);
	}
}