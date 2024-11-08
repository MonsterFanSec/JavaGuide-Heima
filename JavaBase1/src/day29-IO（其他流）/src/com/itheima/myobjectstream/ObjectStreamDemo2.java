package com.itheima.myobjectstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
 * 需求：
 *      利用反序列化流/对象操作输入流，把文件中中的对象读到程序当中
 *
 * 构造方法：
 *      public ObjectInputStream(InputStream out)         把基本流变成高级流
 *
 * 成员方法：
 *      public Object readObject()                        把序列化到本地文件中的对象，读取到程序中来
 */
public class ObjectStreamDemo2 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// 1.创建反序列化流的对象
		String path = "/Users/daykalif/Desktop/Java/JavaBase1/src/day29-IO（其他流）/src/com/itheima/myobjectstream";

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path + "/a.txt"));

		// 2.读取数据
		Student o = (Student) ois.readObject();

		// 3.打印对象
		System.out.println(o);

		// 4.释放资源
		ois.close();//Student{name = zhangsan, age = 23, address = null}
	}
}
