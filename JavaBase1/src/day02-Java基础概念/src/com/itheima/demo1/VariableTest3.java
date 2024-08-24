package com.itheima.demo1;// 1.导包
import java.util.Scanner;

public class VariableTest3 {
	public static void main(String[] args) {
		/**
		 * 键盘录入：Java帮我们写好了一个类叫Scanner，这个类就可以接收键盘输入的数字。
		 *
		 * 步骤一：导包 --- Scanner这个类在哪
		 * import java.util.Scanner;	导包的动作必须出现在类定义的上边。
		 *
		 * 步骤二：创建对象 --- 表示我要开始用Scanner这个类了
		 * Scanner sc = new Scanner(System.in);
		 * 上面这个格式里面，只有sc是变量名，可以变，其他的都不允许变。
		 *
		 * 步骤三：接收数据 --- 真正开始干活了
		 * int i = sc.nextInt();	左边这个格式里面，只有i是变量名，可以比那，其他的都不允许变。
		 */

		// 2.创建对象
		Scanner sc = new Scanner(System.in);

		// 3.接收数据
		System.out.println("请输入第一个整数：");
		int num1 = sc.nextInt();
		System.out.println(num1);

		System.out.println("请输入第二个整数：");
		int num2 = sc.nextInt();
		System.out.println(num2);
	}
}
