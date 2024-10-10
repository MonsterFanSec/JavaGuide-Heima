package com.itheima.doudizhu1;

import java.util.ArrayList;
import java.util.Collections;

public class PokerGame {
	/*
	 * 准备牌（不论创建几局，都只有一副牌）
	 * 		"♦", "♣", "♥", "♠"
	 * 		"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"
	 *
	 * 静态代码块
	 * 		特点：随着类的加载而加载，而且只执行一次。
	 *
	 */
	// 牌盒：♦3	♣3	...
	static ArrayList<String> list = new ArrayList<>();    // 静态方法只能访问静态变量，所以list也需要加上static

	static {
		String[] color = {"♦", "♣", "♥", "♠"};
		String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

		//	c：依次表示每一种花色
		for (String c : color) {
			// n：依次表示每一个数字
			for (String n : number) {
				list.add(c + n);    // ♦3	♦4	♦5	...
			}
		}

		list.add("小王");
		list.add("大王");
	}


	public PokerGame() {
		// 准备牌
		System.out.println("准备好一副扑克：" + list);
		System.out.println("====================================");


		//	洗牌
		Collections.shuffle(list);
		System.out.println("打乱好扑克牌：" + list);
		System.out.println("====================================");


		//	发牌（准备4个list：3个list装玩家的牌，1个list装底牌给地主用）
		ArrayList<String> lord = new ArrayList<>();        // lord：地主
		ArrayList<String> player1 = new ArrayList<>();
		ArrayList<String> player2 = new ArrayList<>();
		ArrayList<String> player3 = new ArrayList<>();

		// 遍历牌盒得到每一张牌，i：表示索引
		for (int i = 0; i < list.size(); i++) {
			String poker = list.get(i);        // 快捷键：command + option + v

			// 前3张牌发给底牌
			if (i <= 2) {
				lord.add(poker);
				continue;    // 结束本次执行，重新回到循环；
			}

			// 给3个玩家轮流发牌
			if (i % 3 == 0) {
				player1.add(poker);
			} else if (i % 3 == 1) {
				player2.add(poker);
			} else {
				player3.add(poker);
			}
		}

		//	看牌
		lookPoker("底牌", lord);
		lookPoker("张三", player1);
		lookPoker("李四", player2);
		lookPoker("王五", player3);
	}

	/**
	 * 看牌的方法
	 *
	 * @param name 玩家的名字
	 * @param list 每位玩家的牌
	 */
	public void lookPoker(String name, ArrayList<String> list) {
		System.out.print(name + "：");
		for (String poker : list) {
			System.out.print(poker + " ");
		}
		System.out.println();
	}
}
