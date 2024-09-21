package com.itheima.interfacedemo8;

/*
 *  接口中私有方法的定义格式：
 * 		一、普通的私有方法（给默认方法服务的）
 *      	格式1：private 返回值类型 方法名(参数列表) {   }
 *      	范例1：private void show() {   }
 *
 * 		二、静态的私有方法（给静态方法服务的）
 *      	格式2：private static 返回值类型 方法名(参数列表) {   }
 *     		范例2：private static void method() {   }
 *
 * 	总结：
 * 		1.JDK7以前：接口中只能定义抽象方法。
 * 		2.JDK8的新特性：接口中可以定义有方法体的方法。（默认、静态）
 * 		3.JDK9的新特性：接口中可以定义私有方法。
 * 		4.私有方法分两种：普通的私有方法（给默认的方法服务的），静态的私有方法（给静态的方法服务的）
 */
public class Test implements InterA{
	public static void main(String[] args) {

	}
}
