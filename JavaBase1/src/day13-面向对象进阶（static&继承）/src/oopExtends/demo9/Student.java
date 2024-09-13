package oopExtends.demo9;

public class Student extends Person {
	// 子类的无参构造
	public Student() {
		// 子类构造方法中隐藏的super()去访问父类的无参构造
		super();
		System.out.println("子类的无参构造");
	}

	// 子类的有参构造
	public Student(String name, int age) {
		// 调用父类的有参构造
		super(name, age);
	}
}
