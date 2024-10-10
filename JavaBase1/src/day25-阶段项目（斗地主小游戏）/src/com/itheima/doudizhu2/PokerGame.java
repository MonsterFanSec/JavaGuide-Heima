package com.itheima.doudizhu2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerGame {
	/*
	 * 牌盒 Map:
	 * 	如果集合需要排序，就用TreeMap
	 * 	如果集合不需要排序，就用HashMap，它的效率更高
	 *
	 * 此时我们只需要把牌跟序号产生对应关系就可以了，不需要按照序号进行排序，所以只要HashMap就可以了。
	 *
	 * 如果按TreeMap存储：
	 * 		♦3	♦4	♦5	♦6	♦7
	 * 		1	2	3	4	5
	 *
	 * 如果按HashMap存储：
	 * 		♦3	♦5	♦4	♦7	♦6
	 * 		1	3	2	5	4
	 *
	 * 如果玩家一拿到的序号是：145，
	 * 		则按TreeMap存储时，取到的牌为：♦3	♦6	♦7
	 * 		按HashMap存储时，取到的牌也为：♦3	♦6	♦7
	 * 因此，这个map的侧重点是牌与序号的对应关系，和顺序无关。
	 */
	static HashMap<Integer, String> hm = new HashMap<>();

	// 单列集合，存储的是发给玩家的序号
	static ArrayList<Integer> list = new ArrayList<>();

	static {
		String[] color = {"♦", "♣", "♥", "♠"};
		String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
		/*
		 * int serialNumber = 1;
		 * for (String c : color) {
		 * 		for (String n : number) {
		 * 			hm.put(serialNumber, c + n);
		 * 			serialNumber++;
		 * 		}
		 * 	}
		 * 	hm.put(serialNumber, "小王");
		 * 	serialNumber++;
		 * 	hm.put(serialNumber, "大王");
		 *
		 * 	以这种方式排序出来的map为：
		 * {
		 * 		1=♦3, 2=♦4, 3=♦5, 4=♦6, 5=♦7, 6=♦8, 7=♦9, 8=♦10, 9=♦J, 10=♦Q, 11=♦K,12=♦A, 13=♦2,
		 * 		14=♣3, 15=♣4, 16=♣5, 17=♣6, 18=♣7, 19=♣8, 20=♣9, 21=♣10, 22=♣J, 23=♣Q, 24=♣K,25=♣A, 26=♣2,
		 * 		27=♥3, 28=♥4, 29=♥5, 30=♥6, 31=♥7, 32=♥8, 33=♥9, 34=♥10, 35=♥J, 36=♥Q, 37=♥K,38=♥A, 39=♥2,
		 * 		40=♠3, 41=♠4, 42=♠5, 43=♠6, 44=♠7, 45=♠8, 46=♠9, 47=♠10, 48=♠J, 49=♠Q, 50=♠K, 51=♠A, 52=♠2,
		 * 		53=小王, 54=大王
		 * }
		 *
		 * 玩家一：	1	2	3	4	5	14
		 * 			♦3	♦4	♦5	♦6	♦7	♣3
		 *
		 * 此时♣3的位置不正确
		 * -----------------------------------------
		 * 正确写法如下：
		 */

		// 牌的序号：
		int serialNumber = 1;

		// n：依次表示每一个数字
		for (String n : number) {
			//	c：依次表示每一种花色
			for (String c : color) {
				hm.put(serialNumber, c + n);
				list.add(serialNumber);
				serialNumber++;
			}
		}

		hm.put(serialNumber, "小王");
		list.add(serialNumber);
		serialNumber++;
		hm.put(serialNumber, "大王");
		list.add(serialNumber);

		/*
		 * {
		 * 		1=♦3, 2=♣3, 3=♥3, 4=♠3,
		 * 		5=♦4, 6=♣4, 7=♥4, 8=♠4,
		 * 		9=♦5, 10=♣5, 11=♥5, 12=♠5,
		 * 		13=♦6, 14=♣6, 15=♥6, 16=♠6,
		 * 		17=♦7, 18=♣7, 19=♥7, 20=♠7,
		 * 		21=♦8, 22=♣8, 23=♥8, 24=♠8,
		 * 		25=♦9, 26=♣9, 27=♥9, 28=♠9,
		 * 		29=♦10, 30=♣10, 31=♥10, 32=♠10,
		 * 		33=♦J, 34=♣J, 35=♥J, 36=♠J,
		 * 		37=♦Q, 38=♣Q, 39=♥Q, 40=♠Q,
		 * 		41=♦K, 42=♣K, 43=♥K, 44=♠K,
		 * 		45=♦A, 46=♣A, 47=♥A, 48=♠A,
		 * 		49=♦2, 50=♣2, 51=♥2, 52=♠2,
		 * 		53=小王, 54=大王
		 * }
		 */
		System.out.println("双列集合（牌与序号的对应关系）：" + hm);
		System.out.println("==========================================");
		System.out.println(list);    // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54]
		System.out.println("==========================================");
	}

	public PokerGame() {
		// 洗牌
		Collections.shuffle(list);

		// 发牌，TreeSet针对Integer，会默认按照从小到大进行排序；ArrayList也能做，但是需要自定义排序；
		TreeSet<Integer> lord = new TreeSet<>();
		TreeSet<Integer> player1 = new TreeSet<>();
		TreeSet<Integer> player2 = new TreeSet<>();
		TreeSet<Integer> player3 = new TreeSet<>();

		// i：依次表示每一个索引
		for (int i = 0; i < list.size(); i++) {
			// list.get(i)：牌的序号
			Integer serialNumber = list.get(i);

			if (i <= 2) {
				lord.add(serialNumber);
				continue;
			}

			if (i % 3 == 0) {
				player1.add(serialNumber);
			} else if (i % 3 == 1) {
				player2.add(serialNumber);
			} else {
				player3.add(serialNumber);
			}
		}

		System.out.println("底牌与玩家随机到的序号：");
		System.out.println(lord);
		System.out.println(player1);
		System.out.println(player2);
		System.out.println(player3);
		System.out.println("==========================================");

		//	看牌
		System.out.println("底牌与玩家随机到的牌");
		lookPoker("底牌", lord);
		lookPoker("张三", player1);
		lookPoker("李四", player2);
		lookPoker("王五", player3);
	}

	/**
	 * 看牌
	 *
	 * @param name 玩家的名字
	 * @param ts   牌的序号
	 */
	public void lookPoker(String name, TreeSet<Integer> ts) {
		System.out.print(name + ": ");
		// 遍历TreeSet集合，得到每一个序号，再拿着序号到Map集合中去找真正的牌
		for (Integer serialNumber : ts) {
			String poker = hm.get(serialNumber);
			System.out.print(poker + " ");
		}
		System.out.println();
	}
}
