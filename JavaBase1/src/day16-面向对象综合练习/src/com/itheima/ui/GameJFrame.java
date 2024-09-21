package com.itheima.ui;

import javax.swing.*;

public class GameJFrame extends JFrame {
	//	在JAVA中，JFrame表示界面/窗体
	//	与此同时，子类也表示界面/窗体
	//	规定：GameJFrame这个界面表示的就是游戏的主界面，以后跟游戏相关的所有逻辑都写在这个类中

	public GameJFrame() {
		this.setSize(630, 680);
		this.setVisible(true);
	}
}
