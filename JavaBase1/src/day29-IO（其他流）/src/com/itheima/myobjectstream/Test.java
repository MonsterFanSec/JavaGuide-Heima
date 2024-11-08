package com.itheima.myobjectstream;

/*
 * 系列化流/反序列化流的细节汇总：
 * 		1.使用序列号流将对象写到文件时，需要让Javabean类实现Serializable接口.
 * 		  否则会出现NotSerializableException异常
 *
 * 		2.序列化流写到文件中的数据是不能修改的，一旦修改就无法再次读回来了。
 *
 * 		3.序列化对象后，修改了Javabean类，再次反序列化，会不会有问题？
 * 		  会出问题，会抛出InvalidClassException异常
 * 		  解决方案：给Javabean类添加serialVersionUID（序列号、版本号）
 *
 * 		4.如果一个对象中的某个成员变量的值不想被序列化，又该如何实现呢？
 * 		  解决方案：给该成员变量加transient关键字修饰，该关键字标记的成员变量不参与序列化过程
 */
public class Test {
}
