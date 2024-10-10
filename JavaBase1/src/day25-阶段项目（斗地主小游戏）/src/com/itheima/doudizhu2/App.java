package com.itheima.doudizhu2;

/*
 * 利用序号进行排序：
 * 	- 如果原始数据的规律非常复杂，我们可以先手动排序让每一个数据跟唯一的序号产生对应关系。
 * 	- 序号就是数字，规律非常简单，后续的所有操作，我们以序号为准。
 *  - 当真正需要操作原始数据的时候，再通过序号找到原始数据即可。
 *
 */
public class App {
	public static void main(String[] args) {
		new PokerGame();
	}
}
