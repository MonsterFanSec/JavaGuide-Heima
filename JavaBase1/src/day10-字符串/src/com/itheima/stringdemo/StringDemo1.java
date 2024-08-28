package com.itheima.stringdemo;

public class StringDemo1 {
	public static void main(String[] args) {
		// 1.使用直接赋值的方式获取一个字符串对象
		/*
		 *	只有直接赋值的这种形式，才会创建出StringTable（串池）
		 * 	StringTable（串池）在jdk7以前是存放在方法区。jdk7之后被存放在堆内存中。
		 *
		 * 当使用双引号直接赋值时，系统会检查该字符串在串池中是否存在。
		 * 不存在时：创建新的
		 * 存在时：复用
		 */
		String s1 = "abc";
		String ss1 = "abc";
		System.out.println(s1);    //abc


		// 2.使用new的方式来获取一个字符串对象
		//空参构造：可以获取一个空白的字符串对象
		String s2 = new String();
		System.out.println("@" + s2 + "!");    //@!


		// 3.传递一个字符串，根据传递的字符串内容再创建一个新的字符串对象（几乎不用，只要知道有这种方式就行）
		String s3 = new String("abc");
		System.out.println(s3);


		// 4.传递一个字符数组，根据字符数组的内容再创建一个新的字符串对象
		/*
		 * 使用场景
		 * 		需求：我要修改字符串的内容。  将abc改为Qbc
		 * 		abc ----先拆成---->  {'a','b','c'}  ----修改索引0为Q---->  {'Q','b','c'} ----输出----> "Qbc"
		 */
		char[] chs = {'a', 'b', 'c', 'd'};
		String s4 = new String(chs);
		System.out.println(s4);        // abcd


		// 5.传递一个字节数组，根据字节数组的内容再创建一个新的字符串对象
		/*
		 * 使用场景：
		 * 		以后在网络当中传输的数据其实都是字节信息。
		 * 		我们一般要把字节信息进行转换，转成字符串，此时就要用到这个构造了。
		 */
		byte[] bytes = {97, 98, 99, 100};
		String s5 = new String(bytes);
		System.out.println(s5);        // abcd
	}
}
