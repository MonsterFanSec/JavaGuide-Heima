package com.itheima.myobjectstream;

import com.itheima.myobjectstream.Student;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/*
 * 需求：将多个自定义对象序列化到文件中，但是对象的个数不确定，反序列化流该如何操作呢？
 */
public class Test08 {
	public static void main(String[] args) throws IOException {
		// 1.序列化多个对象
		Student s1 = new Student("zhangsan", 23, "南京");
		Student s2 = new Student("lisi", 24, "重庆");
		Student s3 = new Student("wangwu", 25, "北京");

		ArrayList<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);

		String path = "/Users/daykalif/Desktop/Java/JavaBase1/src/day29-IO（其他流）/src/com/itheima/myobjectstream";
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path + "/b.txt"));
		oos.writeObject(list);

		oos.close();
	}
}
