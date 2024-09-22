package com.itheima.ui;

import javax.swing.*;

public class GameJFrame extends JFrame {
	//	在JAVA中，JFrame表示界面/窗体
	//	与此同时，子类也表示界面/窗体
	//	规定：GameJFrame这个界面表示的就是游戏的主界面，以后跟游戏相关的所有逻辑都写在这个类中

	public GameJFrame() {
		//	比如，宽高，直接展示出来
		this.setSize(630, 680);

		// 设置界面的标题
		this.setTitle("拼图单机版 v1.0");

		// 设置界面置顶
		this.setAlwaysOnTop(true);

		// 设置界面居中
		this.setLocationRelativeTo(null);

		// 设置关闭模式
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		//	让显示显示出来，建议写在最后
		this.setVisible(true);
	}
}
