package com.itheima.object;

/*
 *	Object:
 * 		- Object是java中的顶级父类。所有的类都直接或间接的继承于Object类。
 * 		- Object类中的方法可以被所有子类访问，所以我们要学习Object类和其中的方法。
 *
 * 	Object的构造方法：
 * 		方法名：public Object()
 * 		说明：空参构造
 *
 * 	Object的成员方法：
 * 		public string tostring() 				返回对象的字符串表示形式
 * 		public boolean equals(Object obj) 		比较两个对象是否相等
 * 		protected object clone(int a) 			对象克隆
 */
public class Test {
	public static void main(String[] args) {
		// 1.tostring 返回对象的字符串表示形式
		Object obj = new Object();
		String str1 = obj.toString();
		System.out.println(str1); // java.lang.Object@36baf30c		// java.lang：包名，Object：类名，36baf30c：地址值


		Student stu = new Student();
		String str2 = stu.toString();
		System.out.println(str2);    //	com.itheima.object.Student@3c1


		/*
		 * 细节:
		 * 		System:类名
		 * 		out:静态变量
		 * 		system.out:获取打印的对象
		 * 		println():方法，方法里面的参数:表示打印的内容
		 *
		 *
		 * 核心逻辑:
		 * 		当我们打印一个对象的时候，底层会调用对象的tostring方法，把对象变成字符串。
		 * 		然后再打印在控制台上，打印完毕换行处理。
		 *
		 *
		 * 思考:默认情况下，因为Object类中的tostring方法返回的是地址值
		 * 		所以，默认情况下，打印一个对象打印的就是地址值，但是地址值对于我们是没什么意义的?
		 * 		我想要看到对象内部的属性值?我们该怎么办?
		 * 			处理方案：重写父类Object类中的toString方法
		 *
		 *
		 * tostring方法的结论:
		 * 		如果我们打印一个对象，想要看到属性值的话，那么就重写tostring方法就可以了。
		 * 		在重写的方法中，把对象的属性值进行拼接。
		 *
		 * 生成javabean快捷键：右键，Ptg To JavaBean
		 */
		System.out.println(stu);    //	com.itheima.object.Student@3c1
	}
}
