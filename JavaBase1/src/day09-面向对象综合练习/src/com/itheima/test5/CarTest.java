package com.itheima.test5;

import java.util.Scanner;

public class CarTest {
	public static void main(String[] args) {
		//1.创建一个数组用来存3个汽车对象
		Car[] arr = new Car[3];

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			// 创建汽车的对象
			Car c = createCar(sc);

			// 把汽车对象添加到数组当中
			arr[i] = c;
		}

		// 3.遍历数组
		for (int i = 0; i < arr.length; i++) {
			Car c = arr[i];
			System.out.println(c.getBrand() + c.getPrice() + c.getColor());
		}
	}

	// 2.创建汽车对象，数据来自于键盘录入
	private static Car createCar(Scanner s) {
		Car c = new Car();

		// 录入品牌
		System.out.println("请输入汽车的品牌");
		String brand = s.next();
		c.setBrand(brand);

		// 录入价格
		System.out.println("请输入汽车的价格");
		int price = s.nextInt();
		c.setPrice(price);

		// 录入颜色
		System.out.println("请输入汽车的颜色");
		String color = s.next();
		c.setColor(color);

		return c;
	}
}
