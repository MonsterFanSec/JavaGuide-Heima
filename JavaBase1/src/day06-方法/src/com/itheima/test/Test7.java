package com.itheima.test;

public class Test7 {
	/**
	 * 判断是否存在
	 * 定义一个方法判断数组中的某一个数是否存在，将结果返回给调用处
	 */
	public static void main(String[] args) {
		// 1.定义数组
		int[] arr = {1, 5, 3, 83, 22, 40, 25};

		// 2.判断一个数字再数值中是否存在了
		boolean flag = contains(arr, 40);
		System.out.println(flag);
	}


	// 1.我要干嘛？	--判断是否存在
	// 2.我干这件事情需要什么才能完成？	--数组,需要查询的数字
	// 3.方法的调用处是否需要继续使用结果？	--需要返回值
	public static boolean contains(int[] arr, int number) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == number) {
				return true;
			}
		}

		// 什么时候才能断定89，再数组中是不存在的？
		// 当数组里面所有的数据全部比较完毕之后，才能断定
		return false;
	}
}


/**
 * return，break 关键字的区别？
 * <p>
 * return：其实跟循环没有什么关系，跟方法有关的；
 * 表示1: 结束方法
 * 表示2: 返回结果
 * 如果方法执行到了return，那么整个方法全部结束，里面的循环也会随之结束了。
 * <p>
 * break关键字：其实跟方法没有什么关系，用于结束循环或者switch的。
 */