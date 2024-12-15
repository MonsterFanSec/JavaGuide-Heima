package com.itheima.reflect3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;

/*
 * Class类中用于获取构造方法的方法
 * 		Constructor<?>[] getConstructors()                                返回所有公共构造方法对象的数组
 * 		Constructor<?>[] getDeclaredConstructors()                        返回所有构造方法对象的数组
 * 		Constructor<T> getConstructor(Class<?>... parameterTypes)         返回单个公共构造方法对象
 * 		Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes) 返回单个构造方法对象
 *
 *
 * 	Constructor类中用于创建对象的方法
 * 		T newInstance(Object... initargs)                                 根据指定的构造方法创建对象
 * 		setAccessible(boolean flag)                                       设置为true,表示取消访问检查
 */
public class MyReflectDemo {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
		//1.获取class字节码文件对象
		Class clazz = Class.forName("com.itheima.reflect3.Student");

		System.out.println("----------------返回所有公共构造方法对象的数组：---------------------");

		//2.获取构造方法
		Constructor[] cons1 = clazz.getConstructors();
		for (Constructor con : cons1) {
			System.out.println(con);
		}

		System.out.println("================返回所有构造方法对象的数组：====================");

		Constructor[] cons2 = clazz.getDeclaredConstructors();
		for (Constructor con : cons2) {
			System.out.println(con);
		}

		System.out.println("----------------返回单个构造方法对象：---------------------");


		Constructor cona = clazz.getDeclaredConstructor();
		System.out.println("cona-->" + cona);

		Constructor conb = clazz.getDeclaredConstructor(String.class);
		System.out.println("conb-->" + conb);

		Constructor conc = clazz.getDeclaredConstructor(int.class);
		System.out.println("conc-->" + conc);

		Constructor cond = clazz.getDeclaredConstructor(String.class, int.class);
		System.out.println("cond-->" + cond);

		System.out.println("================单个构造方法对象的应用场景一：获取构造方法中的内容=====================");

		int modifiers = cond.getModifiers();    // 获取构造方法中的权限修饰符；	应用场景：如idea，获取到权限修饰符为私有的时候，就不提供代码提示功能
		System.out.println(modifiers);

		Parameter[] parameters = cond.getParameters();    // 获取这个构造方法的参数
		for (Parameter parameter : parameters) {
			System.out.println(parameter);
		}

		System.out.println("================单个构造方法对象的应用场景二：利用构造方法创建对象=====================");

		// 暴力反射：表示临时取消权限校验
		cond.setAccessible(true);

		Student stu = (Student) cond.newInstance("张三", 23);
		System.out.println(stu);
	}
}