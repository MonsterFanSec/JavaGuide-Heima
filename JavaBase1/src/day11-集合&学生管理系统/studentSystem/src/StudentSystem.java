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

	//添加学生
	public static void addStudent(ArrayList<Student> list) {
		System.out.println("addStudent");
	}

	//删除学生
	public static void deleteStudent(ArrayList<Student> list) {
		System.out.println("deleteStudent");
	}

	//修改学生
	public static void updateStudent(ArrayList<Student> list) {
		System.out.println("updateStudent");
	}

	//查询学生
	public static void queryStudent(ArrayList<Student> list) {
		System.out.println("queryStudent");
	}
}
