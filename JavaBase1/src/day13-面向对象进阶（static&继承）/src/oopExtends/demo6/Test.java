package oopExtends.demo6;

/*
 *	方法的重写：
 * 		当父类的方法不能满足子类现在的需求时，需要进行方法重写
 * 	书写格式：
 * 		在继承体系中，子类出现了和父类中一模一样的方法声明，我们就称子类这个方法是重写的方法。
 * 	@Override 重写注解：
 * 		1.@Override是放在重写后的方法上，校验子类重写时语法是否正确。
 * 		2.加上注解后如果有红色波浪线，表示语法错误。
 * 		3.建议重写方法都加@Override注解，代码安全，优雅！
 */

public class Test {
	public static void main(String[] args) {
		Student s = new Student();
		s.lunch();

		OverseasStudent os = new OverseasStudent();
		os.lunch();
	}
}

/**
 * 父类
 */
class Person {
	public void eat() {
		System.out.println("吃米饭，吃菜");
	}

	public void drink() {
		System.out.println("喝开水");
	}
}

/**
 * 普通学生
 */
class Student extends Person {
	public void lunch() {
		// 先在本类中查看eat和drink方法，就会调用子类的，如果没有，就会调用从父类中继承下来的eat和drink方法
		this.eat();    // 吃米饭，吃菜
		this.drink();    // 喝开水

		// 直接调用父类中的eat和drink方法
		super.eat();    // 吃米饭，吃菜
		super.drink();    // 喝开水
	}
}


/**
 * 留学生
 */
class OverseasStudent extends Person {
	public void lunch() {
		this.eat(); // 吃意大利面
		this.drink(); // 喝凉水

		super.eat(); // 吃米饭，吃菜
		super.drink(); // 喝开水
	}

	// 应用场景：当父类中方法，不能满足子类现在的需求时，我们就需要把这个方法进行重写。
	// 注意：子类中重写的方法上面需要加上@override
	@Override
	public void eat() {
		System.out.println("吃意大利面");
	}

	@Override
	public void drink() {
		System.out.println("喝凉水");
	}
}
