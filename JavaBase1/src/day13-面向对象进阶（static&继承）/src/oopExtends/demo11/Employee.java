package oopExtends.demo11;

/**
 * 规范：
 * 1.类名见名知意
 * 2.所有的成员变量都需要私有
 * 3.构造方法（空参，带全部参数的构造）
 * 4.get/set
 * 5.其他方法
 */
public class Employee {
	private String id;
	private String name;
	private double salary;

	public Employee() {
	}

	public Employee(String id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	// 工作
	public void work() {
		System.out.println("员工在工作");
	}

	public void eat() {
		System.out.println("员工在吃米饭");
	}
}
