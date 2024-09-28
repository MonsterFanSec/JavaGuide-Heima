package com.itheima.object;

import com.google.gson.Gson;

public class Test5 {
	public static void main(String[] args) {
		/*
		 * 以后一般会用第三方工具进行克隆：
		 * 		1.第三方写的代码添加到lib文件夹下，右键Add To Library，导入到项目中
		 * 		2.编写代码
		 */
		// 1.先创建一个对象
		int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 0};
		User u1 = new User(1, "zhangsan", "1234qwer", "girl11", data);

		Gson gson = new Gson();

		// 把对象变成一个字符串
		String s = gson.toJson(u1);

		// 再把字符串变回对象就可以了
		User user = gson.fromJson(s, User.class);

		int[] arr = u1.getData();
		arr[0] = 100;

		// 打印对象
		System.out.println(user);	// 克隆出来的对象不会跟着arr的更改而更改，实现了深克隆
	}
}
