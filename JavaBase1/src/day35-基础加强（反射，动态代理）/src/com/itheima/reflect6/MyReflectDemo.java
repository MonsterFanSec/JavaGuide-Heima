package com.itheima.reflect6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

/*
 * 反射的作用：
 *      1.获取一个类里面所有的信息，获取到了之后，再执行其他的业务逻辑
 *      2.结合配置文件，动态的创建对象并调用方法
 *
 *
 * 练习一：保存信息
 *      对于任意一个对象，都可以把对象所有的字段名和值，保存到文件中去
 */
public class MyReflectDemo {
	public static void main(String[] args) throws IllegalAccessException, IOException {
		Student s = new Student("小A", 23, '女', 167.5, "睡觉");
		Teacher t = new Teacher("播妞", 10000);
		saveObject(t);
	}

	//把对象里面所有的成员变量名和值保存到本地文件中
	public static void saveObject(Object obj) throws IllegalAccessException, IOException {
		// 1.获取字节码文件的对象
		Class clazz = obj.getClass();

		// 2. 创建IO流
		BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/daykalif/Desktop/Java/JavaBase1/src/day35-基础加强（反射，动态代理）/src/com/itheima/reflect6/a.txt"));

		// 3. 获取所有的成员变量
		Field[] fields = clazz.getDeclaredFields();

		for (Field field : fields) {
			field.setAccessible(true);
			// 获取成员变量的名字
			String name = field.getName();
			// 获取成员变量的值
			Object value = field.get(obj);
			// 写出数据
			bw.write(name + "=" + value);
			// 换行
			bw.newLine();
		}

		// 关流
		bw.close();
	}
}