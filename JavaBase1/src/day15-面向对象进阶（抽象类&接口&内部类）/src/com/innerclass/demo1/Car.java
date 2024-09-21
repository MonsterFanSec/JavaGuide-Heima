package com.innerclass.demo1;

public class Car {
	String carName;
	int carAge;
	private String carColor;


	// 外部类要访问内部类的成员，必须创建对象
	public void show(Car this) {
		// 是打印调用者车的名字：宾利
		System.out.println(this.carName);

		Engine e = new Engine();
		e.engineName = "xxx型发动机";
		System.out.println(e.engineName);
		e.show();
	}


	class Engine {
		String engineName;
		int engineAge;

		public void show() {
			System.out.println(engineName);
			System.out.println(carName);

			// 内部类可以直接访问外部类的成员，包括私有
			System.out.println(carColor);
		}
	}
}
