package com.itheima.interfacedemo6;

/*
 * JDK8开始接口中新增的方法
 * 		JDK7以前：接口中只能定义抽象方法。
 * 		JDK8的新特性：接口中可以定义有方法体的方法。（默认、静态）
 * 		JDK9的新特性：接口中可以定义私有方法。
 * 接口的应用
 * 适配器设计模式
 *
 *
 * JDK8以后接口中新增的方法：
 * 	- 允许接口中定义默认方法，需要使用关键字default修饰
 * 	  作用：解决接口升级的问题
 *
 * 	接口中默认方法的定义格式：
 * 	- 格式：public default 返回值类型 方法名(参数列表){}
 * 	  范例：public default void show(){}
 *
 * 	接口中默认方法的注意事项：
 * 	- 默认方法不是抽象方法，所有不强制被重写。但是如果被重写，重写的时候去掉default关键字
 * 	- public可以省略，default不能省略
 * 	- 如果实现了多个接口，多个接口中存在相同名字的默认方法，子类就必须对该方法进行重写
 */
public class Test {
	public static void main(String[] args) {
		//创建实现类的对象
		InterImpl ii = new InterImpl();
		ii.method();
		ii.show();
		ii.show1();
	}
}
