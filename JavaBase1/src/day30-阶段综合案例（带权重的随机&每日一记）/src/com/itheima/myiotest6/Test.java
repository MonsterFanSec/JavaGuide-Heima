package com.itheima.myiotest6;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {
	public static void main(String[] args) throws IOException {
		String path = "/Users/daykalif/Desktop/Java/JavaBase1/src/day30-阶段综合案例（带权重的随机&每日一记）/src/com/itheima/myiotest6";

		// 1.把文件中所有的学生信息读取到内存中
		ArrayList<Student> list = new ArrayList<>();
		BufferedReader br = new BufferedReader(new FileReader(path + "/names.txt"));
		String line;
		while ((line = br.readLine()) != null) {
			String[] arr = line.split("-");
			Student stu = new Student(arr[0], arr[1], Integer.parseInt(arr[2]), Double.parseDouble(arr[3]));
			list.add(stu);
		}
		br.close();

		// 2.计算权重的总和
		double weight = 0;
		for (Student stu : list) {
			weight = weight + stu.getWeight();
		}

		// 3.计算每一个人的实际占比：[0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1]
		double[] arr = new double[list.size()];
		int index = 0;
		for (Student stu : list) {
			arr[index] = stu.getWeight() / weight;
			index++;
		}

		// 4.计算每一个人的权重占比范围
		for (int i = 1; i < arr.length; i++) {
			arr[i] = arr[i] + arr[i - 1];
		}

		// 5.随机抽取
		// 获取一个0.0~1.0之间的随机数
		double number = Math.random();
		/*
		 * 判断number在arr中的位置
		 *
		 * 二分查找法
		 * 		binarySearch方法返回：
		 * 			结果 = -插入点 - 1；
		 * 		获取number这个数据在数组当中的插入点位置:
		 * 			插入点 = -结果 - 1
		 */
		int result = -Arrays.binarySearch(arr, number) - 1;
		System.out.println(Arrays.toString(arr));
		System.out.println(number);
		System.out.println(result);
		System.out.println("==========================");

		Student stu = list.get(result);
		System.out.println(stu);

		// 6.修改当前学生的权重
		double w = stu.getWeight() / 2;
		stu.setWeight(w);

		// 7.把集合中的数据再次写到文件中
		BufferedWriter bw = new BufferedWriter(new FileWriter(path + "/names.txt"));
		for (Student s : list) {
			bw.write(s.toString());    // javabean类中改写toString方法
			bw.newLine();
		}
		bw.close();
	}
}
