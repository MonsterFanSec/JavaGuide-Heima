package com.itheima.underlying_principle;

/**
 * 问题：下列代码的运行结果是？
 *
 * 字符串拼接的时候，如果有变量：
 * 	JDK8以前：系统底层会自动创建一个StringBuilder对象，然后再调用其append方法完成拼接。
 * 			 拼接后，再调用其toString方法转换为String类型，而toString方法的底层是直接new了一个字符串对象。
 * 	JDK8版本：系统会预估要字符串拼接之后的总大小，把要拼接的内容都放在数组中，此时也是产生一个新的字符串。
 */

public class Test1 {
	public static void main(String[] args) {
		String s1 = "abc";    // 记录串池中的地址值
		String s2 = "ab";
		String s3 = s2 + "c";    // 新new出来的对象
		System.out.println(s1 == s3);    // false
	}
}
