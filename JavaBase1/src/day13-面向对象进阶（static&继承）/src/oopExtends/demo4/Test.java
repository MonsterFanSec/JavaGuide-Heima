package oopExtends.demo4;

/**
 * 继承中：成员变量的特点
 * 就近原则：谁离我近，我就用谁
 */

public class Test {
	public static void main(String[] args) {
		Zi z = new Zi();
		z.ziShow();
	}
}

class Ye {
	String name = "Ye";
	int age = 100;
}

class Fu extends Ye {
	String name = "Fu";
}

class Zi extends Fu {
	String name = "Zi";

	public void ziShow() {
		String name = "ziShow";
		System.out.println(name);    // ziShow，局部位置找，找到打印
		System.out.println(age);    // 100，布局位置找，一直往上找，直到找到

		System.out.println(this.name);    // Zi，this：会再本类的成员位置找
		System.out.println(super.name);    // Fu，super：表示父类
	}
}
