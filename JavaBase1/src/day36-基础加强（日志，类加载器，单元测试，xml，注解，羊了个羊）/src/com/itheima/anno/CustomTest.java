package com.itheima.anno;

/*
 * 自定义注解 -- 格式
 * - 自定义注解就是自己做一个注解来使用。
 *
 * public @interface 注解名称{
 *     public 属性类型 属性名() default 默认值;
 * }
 *
 * 属性类型：
 * 		基本数据类型
 * 		String
 * 		Class
 * 		注解
 * 		枚举
 * 		以上类型的一纬数组
 *
 *
 * 自定义注解和使用
 * 	使用自定义注解格式：
 * 	@注解名(属性名1=值1,属性名2=值2)
 *
 * 注意事项：
 * 	使用自定义注解时要保证注解每个属性值都有值
 * 	注解可以使用默认值
 *
 *
 * 特殊属性：
 * 	- value属性，如果只有一个value属性的情况下，使用value属性的时候可以省略value名称不写！！
 *  - 但是如果有多个属性，且多个属性没有默认值，那么value名称是不能省略的。
 */
@MyAnnoDemo1(name = "Daykalif", age = 18)
public class CustomTest {
	String aaa;
	String bbb;

	@MyAnnoDemo1(name = "Daykalif1", age = 19)
	public void method() {
		System.out.println("method 方法");
	}

	@MyAnnoDemo2("abc")
	public void metho2() {
		System.out.println("method2 方法");
	}

	@MyAnnoDemo3(age = 18, value = "hi")
	public void metho3() {
		System.out.println("method3 方法");
	}
}
