package test;

public class Test3 {
	public static void main(String[] args) {
		/**
		 * 字符串的“+”操作
		 * 1.当“+”操作中出现字符串时，这个“+”是字符串连接符，而不是算术运算符了。
		 *   会将后面的数据进行拼接，并产生一个新的字符串。
		 *	“123” + 123 ： “123123”
		 *
		 * 2.连续进行“+”操作时，从左到右逐个执行。
		 * 1+99+“年黑马”	： “100年黑马”
		 */
		System.out.println(3.7 + "abc");    // "3.7abc"
		System.out.println("abc" + true);    // "abctrue"
		System.out.println("中" + "abc" + true);    // "中abctrue"

		int age = 18;
		System.out.println("我的年龄是：" + age + "岁");    // “我的年龄是18岁”
		System.out.println("我的年龄是：" + "age" + "岁");    // “我的年龄是age岁”

		System.out.println(1 + 2 + "abc" + 2 + 1);    // "3abc21"
	}
}
