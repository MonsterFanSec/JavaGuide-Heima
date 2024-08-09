package demo1;

public class VariableTest2 {
	public static void main(String[] args) {
		/**
		 * 标识符命名规则 --- 硬性要求
		 *
		 * 由数字、字母、下划线(_)和美元符($)组成
		 * 不能以数字开头
		 * 不能是关键字
		 * 区分大小写
		 */

		//	定义变量记录姓名
		String name = "黑马谢广坤";

		// 定义变量记录年龄
		int age = 18;

		// 定义变量记录性别
		char gender = '男';

		//	定义变量记录身高
		double height = 180.1;

		//	定义变量记录是否单身
		boolean flag = true;

		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		System.out.println(height);
		System.out.println(flag);
	}
}
