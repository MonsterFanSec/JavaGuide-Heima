package com.itheima.objects;

import com.itheima.object.Student;

import java.util.Objects;

/*
 * Objects：
 * 		Objects是一个工具类，提供了一些方法取完成一些功能。
 *
 * 	public static boolean equals(Object a, Object b)        先做非空判断，比较两个对象
 * 	public static boolean isNull(Object obj)                判断对象是否为null，为nul1返回true ，反之
 * 	public static boolean nonNull(Object obj)               判断对象是否为null，跟isNull的结果相反
 *
 *
 * 总结：
 * 	1.Objects是一个工具类，提供了一些操作对象的方法
 *  2.equals(对象1,对象2):先做非空判断，比较两个对象
 * 	3.isNull(对象):判断对象是否为空
 * 	4.nonNull(对象):判断对象是否不为空
 */
public class demo2 {
	public static void main(String[] args) {
		// 1.创建学生类的对象
		Student s1 = null;
		Student s2 = new Student("zhangsan", 23);

		boolean result = Objects.equals(s1, s2);
		System.out.println(result);        // false

		/*
		 * 细节：
		 * 	1.方法的底层会判断s1是否为null，如果为null，直接返回false
		 * 	2.如果s1不为null，那么就利用s1再次调用equals方法
		 * 	3.此时s1是student类型，所以最终还是会调用student中的equals方法。
		 *
		 * 	如果没有重写，比较地址值，如果重写了，就比较属性值。
		 */
		Student s3 = new Student();
		Student s4 = null;

		System.out.println(Objects.isNull(s3));    // false
		System.out.println(Objects.isNull(s4));    // true

		System.out.println(Objects.nonNull(s3));    // true
		System.out.println(Objects.nonNull(s4));    // false
	}
}
