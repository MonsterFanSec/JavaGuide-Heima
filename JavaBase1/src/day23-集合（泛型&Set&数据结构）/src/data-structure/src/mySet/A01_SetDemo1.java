package mySet;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

/*
 * 练习：存储字符串并遍历
 * 利用Set系列的集合，添加字符串，并使用多种方式遍历。
 *  1.迭代器
 *  2.增强for
 *  3.Lambda表达式
 */
public class A01_SetDemo1 {
	public static void main(String[] args) {
		// 1.创建一个Set集合的对象
		Set<String> s = new HashSet<>();    // Set是一个接口，因此不能创建Set的对象，只能创建它实现类的对象

		/*
		 * 2,添加元素
		 * 	如果当前元素是第一次添加，那么可以添加成功，返回true
		 * 	如果当前元素是第二次添加，那么添加失败，返回false
		 */
		s.add("张三");
		s.add("张三");
		s.add("李四");
		s.add("王五");

		// 3.打印集合
		System.out.println(s); // [李四, 张三, 王五]		// 无序，且没有索引
		System.out.println("==========================================");

		//迭代器遍历
		Iterator<String> it = s.iterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
		System.out.println("==========================================");


		//增强for
		for (String str : s) {
			System.out.println(str);
		}
		System.out.println("==========================================");


		// Lambda表达式-完整格式
		s.forEach(new Consumer<String>() {
			@Override
			public void accept(String str) {
				System.out.println(str);
			}
		});


		// Lambda表达式-简化格式
		s.forEach(str -> System.out.println(str));
	}
}
