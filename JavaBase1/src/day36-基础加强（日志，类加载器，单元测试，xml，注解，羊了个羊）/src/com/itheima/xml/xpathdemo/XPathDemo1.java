package com.itheima.xml.xpathdemo;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

public class XPathDemo1 {
	public static void main(String[] args) throws DocumentException {
		//	 1.创建解析器对象
		SAXReader saxReader = new SAXReader();
		//	2.利用解析器去读取xml文件，并返回文档对象
		File file = new File("/Users/daykalif/Desktop/Java/JavaBase1/src/day36-基础加强（日志，类加载器，单元测试，xml，注解，羊了个羊）/src/com/itheima/xml/persons.xml");
		Document document = saxReader.read(file);    // 拿到了document表示我已经拿到了xml文件的整体

		/*
		 * 3.获取到一个文档对象，然后就可以利用xpath方式进行快速检索
		 * 两个方法：
		 * 	1.检索单个	document.selectSingleNode("路径")
		 * 	2.检索多个	document.selectNodes()
		 */
		List<Element> list = document.selectNodes("/persons/person/name");
		System.out.println(list.size());

		for (Element element : list) {
			System.out.println(element.getName());
			System.out.println(element.getText());
		}
	}
}
