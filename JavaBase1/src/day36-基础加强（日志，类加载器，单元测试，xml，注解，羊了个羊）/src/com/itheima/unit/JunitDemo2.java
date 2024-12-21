package com.itheima.unit;

import org.junit.Assert;
import org.junit.Test;

/*
 * 以后在实际开发中，如果想要测试一个方法是否正确，并不是直接在当前方法的上面写@Test，
 * 而是自己独立编写一个测试类。（不要写main方法）
 * 在这个类中，编写一些方法。
 * 在方法里面调用要被测试的方法即可。
 *
 * 举例：测试JunitDemo1类中的add方法
 */
public class JunitDemo2 {
	@Test
	public void method() {
		//	去调用被测试方法即可
		JunitDemo1 jd = new JunitDemo1();
		// result: 方法的实际返回结果
		int result = jd.add(2, 10);
		/*
		 * 预计结果：我们的测试人员，按照公司的业务逻辑去推导，这个方法应该返回什么结果。
		 * 推到这个方法应该返回12.
		 * 如果实际返回的结果跟预计返回的结果一致，表示方法的逻辑是正确的。
		 * 如果实际返回的结果跟预计返回的结果不一致，表示方法的逻辑是错误的。
		 *
		 *
		 *
		 * 扩展点：
		 * 	在单元测试中，使用断言。
		 * 	参数一：当两个结果一样的时候，出现的提示消息
		 */
		Assert.assertEquals("add方法出错了", result, 12);
	}
}
