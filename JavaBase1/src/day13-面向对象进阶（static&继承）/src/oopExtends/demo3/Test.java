package oopExtends.demo3;

import java.io.IOException;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws IOException {
		Zi z = new Zi();
		z.fuShow1();

		//z.a = 100;	// 报错：java: a 在 oopExtends.demo3.Fu 中是 private 访问控制
		z.b = 200;
		//System.out.println(z.a);
		System.out.println(z.b);
		System.out.println(z.c);

		//把对象的地址值z以16进制的形式打在控制台上
		//System.out.println(Long.toHexString(VM.current().addressOf(z)));

		//因为内存分析工具需要程序不停止
		Scanner sc = new Scanner(System.in);
		sc.next();
	}
}


class Fu {
	// 父类private和非private都会被子类继承下来；但是private属性无法被修改和访问
	private int a = 0x111;
	int b = 0x222;

	public void fuShow1() {
		System.out.println("public --- FuShow");
	}

	private void fuShow2() {
		System.out.println("private --- FuShow");
	}
}

class Zi extends Fu {
	int c = 0x333;

	public void ziShow() {
		System.out.println("public --- ZiShow");
	}
}

