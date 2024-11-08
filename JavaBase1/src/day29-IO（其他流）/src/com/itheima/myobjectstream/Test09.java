package com.itheima.myobjectstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Test09 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// 1.创建反序列化流的对象
		String path = "/Users/daykalif/Desktop/Java/JavaBase1/src/day29-IO（其他流）/src/com/itheima/myobjectstream";
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path + "/b.txt"));

		// 2.读取数据
		ArrayList<Student> list = (ArrayList<Student>) ois.readObject();

		for (Student student : list) {
			System.out.println(student);
		}

		/*Student s4 = (Student) ois.readObject();	// 取不到数据时，报错
		System.out.println(s4);*/

		//3.释放资源
		ois.close();
	}
}
