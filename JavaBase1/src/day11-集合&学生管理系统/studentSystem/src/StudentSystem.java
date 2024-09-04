import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();

		// 选中循环体，快捷键：command+option+T
		customLoopName:
		// customLoopName表示循环的名称叫customLoopName
		while (true) {
			System.out.println("-----------------欢迎来到黑马学生管理系统-------------------");
			System.out.println("1:添加学生");
			System.out.println("2:删除学生");
			System.out.println("3:修改学生");
			System.out.println("4:查询学生");
			System.out.println("5:退出");

			System.out.println("请输入您的选择：");
			Scanner sc = new Scanner(System.in);
			String choose = sc.next();

			switch (choose) {
				case "1" -> addStudent(list);
				case "2" -> deleteStudent(list);
				case "3" -> updateStudent(list);
				case "4" -> queryStudent(list);
				case "5" -> {
					System.out.println("退出");
					//break; // break可以单独跳出switch，也可以单独跳出循环，但是没法跳出嵌套

					//break loop;	// 跳出循环方式1：break + 循环名称customLoopName
					System.exit(0); // 跳出循环方式2：停止虚拟机运行
				}
				default -> System.out.println("没有这个选项");
			}
		}
	}

	// 添加学生
	public static void addStudent(ArrayList<Student> list) {
		// 利用空参构造先创建学生对象
		Student s = new Student();

		Scanner sc = new Scanner(System.in);
		String id = null;

		while (true) {
			System.out.println("请输入学生的id");
			id = sc.next();
			boolean flag = contains(list, id);
			if (flag) {
				// 表示id已经存在，需要重新录入
				System.out.println("id已经存在，请重新录入");
			} else {
				// 表示id不存在，表示可以使用
				s.setId(id);
				break;
			}
		}

		System.out.println("请输入学生的姓名");
		String name = sc.next();
		s.setName(name);

		System.out.println("请输入学生的年龄");
		int age = sc.nextInt();
		s.setAge(age);

		System.out.println("请输入学生的家庭住址");
		String address = sc.next();
		s.setAddress(address);

		// 把学生对象添加到集合当中
		list.add(s);

		// 提示一下用户
		System.out.println("学生信息添加成功");
	}

	// 判断id在集合中是否存在
	public static boolean contains(ArrayList<Student> list, String id) {
		// 循环遍历集合得到里面的每一个学生对象
        /*
			for (int i = 0; i < list.size(); i++) {
				//拿到学生对象后，获取id并进行判断
				Student stu = list.get(i);
				String sid = stu.getId();
				if(sid.equals(id)){
					//存在，true
					return true;
				}
			}
			// 不存在false
			return false;
        */
		return getIndex(list, id) >= 0;
	}

	// 通过id获取索引的方法
	public static int getIndex(ArrayList<Student> list, String id) {
		// 遍历集合
		for (int i = 0; i < list.size(); i++) {
			// 得到每一个学生对象
			Student stu = list.get(i);
			// 得到每一个学生对象的id
			String sid = stu.getId();
			// 拿着集合中的学生id跟要查询的id进行比较
			if (sid.equals(id)) {
				// 如果一样，那么就返回索引
				return i;
			}
		}
		// 当循环结束之后还没有找到，就表示不存在，返回-1.
		return -1;
	}


	// 删除学生
	public static void deleteStudent(ArrayList<Student> list) {
		System.out.println("deleteStudent");
	}

	// 修改学生
	public static void updateStudent(ArrayList<Student> list) {
		System.out.println("updateStudent");
	}

	// 查询学生
	public static void queryStudent(ArrayList<Student> list) {
		if (list.size() == 0) {
			System.out.println("当前无学生信息，请添加后再查询");
			//结束方法
			return;
		}

		// 打印表头信息
		System.out.println("id\t\t\t姓名\t年龄\t家庭住址");    // \t：制表符，长度可变的空格，需要补齐8个字符，或者8的倍数

		// 当代码执行到这里，表示集合中是有数据的
		for (int i = 0; i < list.size(); i++) {
			Student stu = list.get(i);
			System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress());
		}
	}
}
