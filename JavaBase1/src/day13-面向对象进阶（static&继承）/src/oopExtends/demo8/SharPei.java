package oopExtends.demo8;

/**
 * 子类：沙皮狗
 */
public class SharPei extends Dog {
	// 因为沙皮狗吃的狗粮和骨头
	// 父类中的方法不能满足我们的需求了，所以需要进行重写
	@Override
	public void eat() {
		super.eat();    // 吃狗粮

		// 在父类eat方法的基础上，额外增加内容
		System.out.println("狗啃骨头");
	}
}
