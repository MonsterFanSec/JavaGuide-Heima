package com.itheima.a06args;

/*
 * 可变参数的小细节：
 *  1.在方法的形参中最多只能写一个可变参数，不能写多个可变参数
 *      可变参数，理解为一个大胖子，有多少吃多少
 *  2.在方法的形参当中，如果出了可变参数以外，还有其他的形参，那么可变参数要写在最后
 *
 *
 * 总结：
 * 	1.可变参数本质上就是一个数组
 * 	2.作用：在形参中接收多个数据
 * 	3.格式：数据类型...参数名称
 * 		 - 举例：int...a
 *  4.注意事项：
 * 		- 形参列表中可变参数只能有一个
 * 		- 可变参数必须放在形参列表的最后
 */
public class ArgsDemo4 {
	public static void main(String[] args) {
		getSum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	}

	/*
		// 报错：
		public static int getSum(int... a, int... args) {
			return 0;
		}
	*/
	public static int getSum(int a, int... args) {
		return 0;
	}
}
