package com.itheima.xml.dom4jdemo;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

import java.io.File;

public class Dom4jDemo1 {
	public static void main(String[] args) throws DocumentException {
		//	 1.创建解析器对象
		SAXReader saxReader = new SAXReader();
		//	2.利用解析器去读取xml文件，并返回文档对象
		File file = new File("/Users/daykalif/Desktop/Java/JavaBase1/src/day36-基础加强（日志，类加载器，单元测试，xml，注解，羊了个羊）/src/com/itheima/xml/persons.xml");
		Document document = saxReader.read(file);	// 拿到了document表示我已经拿到了xml文件的整体
		//	3.打印
		System.out.println(document);
	}
}
