package com.itheima.xml;

/*
 * 关于XPath的小结：
 * 		1.XPath底层依赖于dom4j。在刚开始导包的时候一定要把dom4j的jar一起导入
 * 		2.有两个检索的方法：
 * 			selectNodes("路径")：查询所有
 * 			selectSingleNodes("路径")：查询单个的，如果结果有多个，默认返回第一个。
 * 		3.四种检索方式：
 * 			/： 表示单级路径
 * 			//：表示多级路径
 * 			@：	表示属性
 *
 * 			a.绝对路径：一定是从根节点开始
 * 			b.相对路径：从现在的自己节点开始的。
 * 					用根节点调用selectNodes，那么此时就是相对于根节点而言。
 * 					用name节点调用selectNodes，那么此时就是相对于name标签而言。
 * 			c.全文检索：只要xml文件中存在，就可以找到
 * 					//name：表示在整个xml中找name这个标签
 * 					扩展用法：
 * 						//person/name：先找person，再找person的子标签name。
 * 						//person//name：先找person，再找person的子标签name，但是此时name可以是孙标签。
 * 			d.带属性的查询：
 * 					查属性：
 * 						//@属性名：表示在全文中查找指定的属性。
 * 					查带有指定属性的标签：
 * 						//标签[@属性名]
 * 					查带有指定属性值的标签：
 * 						//标签名[@属性名='值']
 */
public class Test7 {
}
