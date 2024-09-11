package oopExtends.demo2;

/*
 * 只能有一个类能被public修饰
 * - 被public所修饰的类，类名要和文件名保持一致
 */
public class Test {
	public static void main(String[] args) {
		// 利用空参构造创建子类对象
		Zi z1 = new Zi();

		// 利用带参构造创建子类对象
		// Zi z2 = new Zi("zhangsan",23);	// 报错；因为子类不能继承父类的构造方法
	}
}

class Fu {
	String name;
	int age;

	public Fu() {
	}

	public Fu(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

class Zi extends Fu {
	// 如果一个类中没有构造方法，虚拟机会自动的给你添加一个默认的空参构造
}



