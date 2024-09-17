package com.innerclass.demo1;

public class Car {
	String carName;
	int carAge;
	private String carColor;


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
			System.out.println(carColor);
		}
	}
}
