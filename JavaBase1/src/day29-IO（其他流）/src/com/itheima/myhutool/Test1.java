package com.itheima.myhutool;

import cn.hutool.core.io.FileUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/*
 * FileUtil类:
 * 		file：根据参数创建一个file对象
 * 		touch：根据参数创建文件
 *
 * 		writeLines：把集合中的数据写出到文件中，覆盖模式。
 * 		appendLines：把集合中的数据写出到文件中，续写模式。
 * 		readLines：指定字符编码，把文件中的数据，读到集合中。
 * 		readUtf8Lines：按照UTF-8的形式，把文件中的数据，读到集合中
 *
 * 		copy：拷贝文件或者文件夹
 */
public class Test1 {
	public static void main(String[] args) {
		String path = "/Users/daykalif/Desktop/Java/JavaBase1/src/day29-IO（其他流）/src/com/itheima/myhutool";

		File file1 = FileUtil.file(path, "aaa", "bbb", "a.txt");
		System.out.println(file1);    // /Users/daykalif/Desktop/Java/JavaBase1/src/day29-IO（其他流）/src/com/itheima/myhutool/aaa/bbb/a.txt

		File touch = FileUtil.touch(file1);
		System.out.println(touch);


		//ArrayList<String> list = new ArrayList<>();
		//list.add("新添加的数据1");
		//list.add("新添加的数据2");
		//list.add("新添加的数据3");
		//File file2 = FileUtil.writeLines(list, file1, "UTF-8", false);    // 第四个参数为是否追加，false表示不追加，即覆盖模式，默认第四个参数不传与传false相同
		//System.out.println(file2);

		//ArrayList<String> list2 = new ArrayList<>();
		//list2.add("新添加的数据4");
		//list2.add("新添加的数据5");
		//list2.add("新添加的数据6");
		//File file3 = FileUtil.appendLines(list2, file1, "UTF-8");
		//System.out.println(file3);


		List<String> list = FileUtil.readLines(path + "/aaa/bbb/a.txt", "UTF-8");
		System.out.println(list);
	}
}
