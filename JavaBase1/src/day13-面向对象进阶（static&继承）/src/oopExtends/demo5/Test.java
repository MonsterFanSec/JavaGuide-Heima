package oopExtends.demo5;

/*
 * 1.继承中成员变量访问特点：就近原则。
 * 	 先在局部位置找，本类成员位置找，父类成员位置找，逐级往上。
 * 2.如果出现了重名的成员变量怎么办？
 * 	 System.out.println(name);			// 从局部位置开始往上找
 * 	 System.out.println(this.name);		// 从本类成员位置开始往上找
 * 	 System.out.println(super.name);    // 父类成员位置开始往上找
 */
public class Test {
	public static void main(String[] args) {
		Zi z = new Zi();
		z.show();
	}
}

class Fu {
	String name = "Fu";
	String hobby = "喝茶";

}

class Zi extends Fu {
	String name = "Zi";
	String game = "吃鸡";

	public void show() {
		// 如何打印子类：Zi
		System.out.println(name);    // Zi
		System.out.println(this.name); // Zi，this：不会在方法里面找，只会在本类成员位置找

		// 如何打印父类：Fu
		System.out.println(super.name);    // Fu

		// 如何打印喝茶
		System.out.println(hobby);    // 喝茶，先在局部位置找，再到本类成员位置找，再到父类成员位置找
		System.out.println(this.hobby);    // 喝茶，先在本类成员位置找，再到父类成员位置找
		System.out.println(super.hobby);    // 喝茶，直接到父类成员位置找

		// 如何打印吃鸡
		System.out.println(game);	// 吃鸡
		System.out.println(this.game);	// 吃鸡
	}
}
