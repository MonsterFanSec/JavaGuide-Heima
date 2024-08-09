package test;

/**
 * 请问最终的运算结果是什么类型的？
 */
public class Test2 {
	public static void main(String[] args) {
		byte b1 = 10;
		byte b2 = 20;
		//数据类型 result = b1 + b2;    // 数据类型: int

		int i = 10;
		long n = 100L;
		double d = 20.0;
		//数据类型 result = i + n + d;    // 数据类型: double

		byte b = 10;
		short s = 20;
		long h = 100L;
		//数据类型 result = b + s + h;    // 数据类型: long


		/**
		 * 隐式转换总结：
		 *
		 * 1.取值范围：
		 * byte < short < int < long < float < double
		 *
		 * 2.什么时候转换？
		 * 数据类型不一样，不能进行计算，需要转成一样的才可以进行计算。
		 *
		 * 3.转换规则1:
		 * 取值范围小的，和取值范围大的进行运算，小的会先提升为大的，再进行运算
		 *
		 * 4.转换规则2:
		 * byte short char 三种类型的数据在运算的时候，都会直接先提升为int，然后再进行运算
		 */


		byte b3 = 10;
		byte b4 = 20;
		int result1 = b3 + b4;    // 这种是正确的，不需要强转
		byte result2 = (byte)(b3 + b4);    // 正确
		//byte result3 = byte(b3) + byte(b4);    // 错误
		System.out.println(result2);

		/**
		 * 强制转换总结：
		 *
		 * 1.如果把一个取值范围大的数值，赋值给取值范围小的变量。
		 * 是不允许直接赋值的。如果一定要这么做，就需要加入强制转换。
		 *
		 * 2.格式：目标数据类型 变量名 = （目标数据类型）被强转的数据;
		 */
	}
}
