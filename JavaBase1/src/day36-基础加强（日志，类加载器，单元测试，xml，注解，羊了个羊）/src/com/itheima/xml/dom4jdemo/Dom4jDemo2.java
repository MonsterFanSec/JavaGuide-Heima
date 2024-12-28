package com.itheima.xml.dom4jdemo;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Document 	表示整个文档对象
 * Element		表示标签
 * Attribute	表示属性
 * Text			表示文本
 *
 * Element、Attribute、Text有一个共同的父类：Node（节点）
 * 每一个标签、属性、文本都可以看成是节点。
 */
public class Dom4jDemo2 {
	public static void main(String[] args) throws DocumentException {
		ArrayList<User> list = new ArrayList<>();
		//	1.创建一个解析器对象
		SAXReader saxReader = new SAXReader();
		//	2.利用解析器去读取xml文件，获取一个文档对象
		File file = new File("/Users/daykalif/Desktop/Java/JavaBase1/src/day36-基础加强（日志，类加载器，单元测试，xml，注解，羊了个羊）/src/com/itheima/xml/dom4jdemo/users.xml");
		Document document = saxReader.read(file);
		System.out.println(document);

		//	思想：从外面一层一层的扒开
		Element rootElement = document.getRootElement();
		System.out.println(rootElement.getName());
		//	进入根标签，获取里面的user标签
		List<Element> elements = rootElement.elements();
		//	遍历集合得到每一个user标签
		for (Element element : elements) {
			//	获取user标签的属性id
			Attribute id = element.attribute("id");
			String idValue = id.getText();
			System.out.println(idValue);

			//	获取用户名
			Element username = element.element("username");
			String usernameValue = username.getText();

			//	获取密码
			Element password = element.element("password");
			String passwordValue = password.getText();

			//	获取personId
			Element personId = element.element("personid");
			String personIdValue = personId.getText();

			//	获取phoneId
			Element phoneId = element.element("phoneid");
			String phoneIdValue = phoneId.getText();

			//	获取权限，是否为管理员
			Element admin = element.element("admin");
			String adminValue = admin.getText();
			boolean b = Boolean.parseBoolean(adminValue);

			User user = new User(idValue, usernameValue, passwordValue, personIdValue, phoneIdValue, b);
			list.add(user);
		}

		//	打印登录
		System.out.println(list);

		//	登录操作
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String username = sc.nextLine();
		System.out.println("请输入密码：");
		String password = sc.nextLine();

		//	1.判断用户名是否存在，如果不存在提示用户名为注册
		int index = getIndex(list, username);
		if (index >= 0) {
			//	表示存在
			User user = list.get(index);
			if (user.getPassword().equals(password)) {
				System.out.println("登录成功");
			} else {
				System.out.println("密码输入错误");
			}
		} else {
			//	表示不存在
			System.out.println("用户名未注册");
		}
	}

	/*
	 * 查询username在集合中的索引
	 * 如果存在，返回索引
	 * 如果不存在，返回-1
	 */
	public static int getIndex(ArrayList<User> list, String username) {
		for (int i = 0; i < list.size(); i++) {
			User user = list.get(i);
			if (user.getUsername().equals(username)) {
				return i;
			}
		}
		return -1;
	}
}
