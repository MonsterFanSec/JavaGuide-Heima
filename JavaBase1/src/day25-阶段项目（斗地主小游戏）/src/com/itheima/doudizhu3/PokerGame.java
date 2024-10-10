package com.itheima.doudizhu3;

import java.util.*;

public class PokerGame {
	// 牌盒 Map
	static ArrayList<String> list = new ArrayList<>();

	// 创建一个集合，用来添加牌的价值
	static HashMap<String, Integer> hm = new HashMap<>();

	static {
		String[] color = {"♦", "♣", "♥", "♠"};
		String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

		// n：依次表示每一个数字
		for (String n : number) {
			//	c：依次表示每一种花色
			for (String c : color) {
				list.add(c + n);
			}
		}

		// 需要有一个空格，在走到getValue方法的时候，没有空格时substring会只截取到“王”，导致map集合中未找到，进入else，类型转换报错
		list.add(" 小王");
		list.add(" 大王");

		System.out.println(list);
		System.out.println("==========================================");

		/*
		 * 指定牌的价值
		 *
		 * 在排序的时候，获取牌上的数字到Map集合中判断是否存在：
		 * 		如果存在，则通过Map获取价值（J、Q、K、A、2、小王、大王）
		 * 		如果不存在，则牌本身的数字就是价值（3-10）
		 */
		hm.put("J", 11);
		hm.put("Q", 12);
		hm.put("K", 13);
		hm.put("A", 14);
		hm.put("2", 15);
		hm.put("小王", 50);
		hm.put("大王", 100);
	}

	public PokerGame() {
		// 洗牌
		Collections.shuffle(list);

		// 发牌，TreeSet针对Integer，会默认按照从小到大进行排序；ArrayList也能做，但是需要自定义排序；
		ArrayList<String> lord = new ArrayList<>();
		ArrayList<String> player1 = new ArrayList<>();
		ArrayList<String> player2 = new ArrayList<>();
		ArrayList<String> player3 = new ArrayList<>();

		// i：依次表示每一个索引
		for (int i = 0; i < list.size(); i++) {
			String poker = list.get(i);

			if (i <= 2) {
				lord.add(poker);
				continue;
			}

			if (i % 3 == 0) {
				player1.add(poker);
			} else if (i % 3 == 1) {
				player2.add(poker);
			} else {
				player3.add(poker);
			}
		}

		System.out.println("底牌与玩家随机到的牌（未排序版）：");
		System.out.println(lord);
		System.out.println(player1);
		System.out.println(player2);
		System.out.println(player3);
		System.out.println("==========================================");

		// 排序
		order(lord);
		order(player1);
		order(player2);
		order(player3);

		//	看牌
		System.out.println("底牌与玩家随机到的牌（排序版）：");
		lookPoker("底牌", lord);
		lookPoker("张三", player1);
		lookPoker("李四", player2);
		lookPoker("王五", player3);
	}

	/**
	 * 利用牌的价值进行排序
	 *
	 * @param list 牌的集合
	 */
	public void order(ArrayList<String> list) {
		Collections.sort(list, new Comparator<String>() {
			// 底层是用Array.sort（插入排序 + 二分查找）
			@Override
			/*
			 * o1：表示当前要插入到有序序列中的牌
			 * o2：表示已经在有序序列中的牌
			 *
			 * 负数：o1小，插入到前面
			 * 正数：o1大，插入到后面
			 * 0：o1的数字跟o2的数字是一样的，需要按照花色再次排序
			 */
			public int compare(String o1, String o2) {
				// 1.计算o1的花色和价值
				String color1 = o1.substring(0, 1);
				int value1 = getValue(o1);

				//	2.计算o2的花色和价值
				String color2 = o2.substring(0, 1);
				int value2 = getValue(o2);

				/*
				 * 3.比较o1和o2的价值：
				 * 		如果牌的价值一样，则比较花色 ♥3 ♣3
				 * 		如果牌的价值不一样，则以牌的价值为准
				 */
				int i = value1 - value2;
				return i == 0 ? color1.compareTo(color2) : i;
			}
		});
	}

	/**
	 * 计算牌的价值
	 *
	 * @param poker 牌
	 * @return 价值
	 */
	public int getValue(String poker) {
		// 获取牌上的数字
		String number = poker.substring(1);// 从索引1开始截取，到最后
		// 拿着数字到map集合中判断是否存在
		if (hm.containsKey(number)) {
			//	如果存在，获取价值
			return hm.get(number);
		} else {
			//	如果不存在，类型转换
			return Integer.parseInt(number);
		}
	}

	/**
	 * 看牌
	 *
	 * @param name 玩家的名字
	 * @param list 牌
	 */
	public void lookPoker(String name, ArrayList<String> list) {
		System.out.print(name + ": ");
		for (String poker : list) {
			System.out.print(poker + " ");
		}
		System.out.println();
	}
}
