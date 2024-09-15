package com.itheima.packagedemo1;

import com.itheima.packagedemo2.Teacher;

/*
 * 1.什么是包？
 * 		包就是文件夹。用来管理各种不同功能的Java类，方便后期代码维护。
 *
 * 2.包名的规则：
 * 		公司域名反写+包的作用，需要全部英文小写，见名知意。com.itheima.domain
 *
 * 	如：
 * 		com.itheima.domain;
 *
 * 		public class Student{
 * 			私有化成员变量
 * 			构造方法
 * 			成员方法
 * 		}
 *
 * 3.全类名/全限定名：
 * 		com.itheima.domain.Student
 *
 * 4.使用其他类时，需要使用全类名。
 *  如：
 * 	public class Test {
 * 		public static void main(String[] args) {
 *			com.itheima.domain.Student s = new com.itheima.domain.Student();
 *		}
 *	}
 *
 *  简化：
 * 	import com.itheima.domain.Student;
 *
 * 	public class Test {
 * 		public static void main(String[] args) {
 * 			Student s = new Student();
 * 		}
 * 	}
 *
 * 5.使用其他类的规则：
 * 	- 使用同一个包中的类时，不需要导包。
 * 	- 使用java.lang包中的类时，不需要导包。
 * 	- 其他情况都需要导包。
 * 	- 如果同时使用两个包中的同名类，需要用全类名。
 *
 * 总结：
 * 	1.包的作用？
 * 		包就是文件夹，用来管理各种不同功能的java类。
 * 	2.包名书写的规则？
 * 		公司域名反写+包的作用，需要全部英文小写，见名知意。
 * 	3.什么是全类名？
 * 		包名 + 类名
 *  4.什么时候需要导包？什么时候不需要导包？
 * 		使用同一个包中的类时，不需要导包。
 * 		使用java.lang包中的类时，不需要导包。
 * 		其他情况都需要导包。
 * 		如果同时使用两个包中的同名类，需要用全类名。
 */
public class Test {
	public static void main(String[] args) {
		// 使用同一个包中的类时，不需要导包。
		Student s = new Student();
		s.setName("张三");
		s.setAge(23);

		System.out.println(s.getName() + ", " + s.getAge());


		// 使用java.lang包中的类时，不需要导包。
		String s1 = "abc";
		System.out.println(s1);

		// 其他情况都需要导包。
		Teacher t = new Teacher();

		// 如果同时使用两个包中的同名类，需要用全类名。
		com.itheima.packagedemo2.Teacher t2 = new com.itheima.packagedemo2.Teacher();
		com.itheima.packagedemo3.Teacher t3 = new com.itheima.packagedemo3.Teacher();
	}
}

