package com.itheima.xml.dom4jdemo;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Dom4jDemo1 {
	public static void main(String[] args) throws DocumentException {
		ArrayList<Person> list = new ArrayList<>();
		//	 1.创建解析器对象
		SAXReader saxReader = new SAXReader();
		//	2.利用解析器去读取xml文件，并返回文档对象
		File file = new File("/Users/daykalif/Desktop/Java/JavaBase1/src/day36-基础加强（日志，类加载器，单元测试，xml，注解，羊了个羊）/src/com/itheima/xml/persons.xml");
		Document document = saxReader.read(file);    // 拿到了document表示我已经拿到了xml文件的整体
		System.out.println(document);

		//	3.自己解析的时候，一定要一层一层的解析
		Element rootElement = document.getRootElement();
		System.out.println(rootElement.getName());

		//	4.获取根标签的子标签
		List<Element> elements = rootElement.elements("person");
		for (Element element : elements) {
			System.out.println(element.getName());
			//	5.继续获取里面的内容

			//	属性id
			Attribute id = element.attribute("id");
			String idValue = id.getText();
			System.out.println(idValue);

			//	标签name
			Element name = element.element("name");
			String nameValue = name.getText();
			System.out.println(nameValue);

			//	标签age
			Element age = element.element("age");
			String ageValue = age.getText();
			//	类型转换
			int ageInt = Integer.parseInt(ageValue);
			System.out.println(ageValue);

			//	把Person对象添加到集合当中
			Person p = new Person(idValue, nameValue, ageInt);
			list.add(p);
		}
		System.out.println(list);
		//	使用Stream流的方式进行打印
		list.stream().forEach(s -> System.out.println(s));
	}
}
