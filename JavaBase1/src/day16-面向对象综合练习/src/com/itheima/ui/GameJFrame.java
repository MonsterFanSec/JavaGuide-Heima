package com.itheima.ui;

import javax.swing.*;

public class GameJFrame extends JFrame {
	//	在JAVA中，JFrame表示界面/窗体
	//	与此同时，子类也表示界面/窗体
	//	规定：GameJFrame这个界面表示的就是游戏的主界面，以后跟游戏相关的所有逻辑都写在这个类中

	// 空参构造
	public GameJFrame() {
		// 初始化界面
		initJFrame();    // 快捷键：command+option+M（抽取方法）

		// 初始化菜单
		initJMenuBar();

		// 初始化图片
		initImage();

		// 让显示显示出来，建议写在最后
		this.setVisible(true);
	}

	private void initImage() {
		int number = 1;
		//	外循环--把内循环重复执行了4次
		for (int i = 0; i < 4; i++) {
			//	内循环--表示在一行添加4张图片
			for (int j = 0; j < 4; j++) {

				// 创建一个图片ImageIcon的对象，传入路径
				ImageIcon icon = new ImageIcon("/Users/daykalif/Desktop/Java/JavaBase1/src/day16-面向对象综合练习/image/animal/animal3/" + number + ".jpg");
				// 创建一个JLabel的对象（管理容器）
				JLabel jLabel = new JLabel(icon);
				// 指定图片位置，如果不设置位置,默认会放到界面正中央
				jLabel.setBounds(105 * j, 105 * i, 105, 105);
				// 把管理容器添加到界面中
				this.getContentPane().add(jLabel);
				// 添加一次之后，number需要自增，表示下一次加载后面一张图片
				number++;
			}
		}
	}

	private void initJMenuBar() {
		// 创建整个菜单对象
		JMenuBar jMenuBar = new JMenuBar();
		// 创建菜单上面的两个选项的对象（功能、关于我们）
		JMenu functionJMenu = new JMenu("功能");
		JMenu aboutJMenu = new JMenu("关于我们");

		// 创建选项下面的条目对象
		JMenuItem replayItem = new JMenuItem("重新游戏");
		JMenuItem reLoginItem = new JMenuItem("重新登录");
		JMenuItem closeItem = new JMenuItem("关闭游戏");

		JMenuItem accountItem = new JMenuItem("公众号");

		// 将每一个选项下面的条目添加到选项中
		functionJMenu.add(replayItem);
		functionJMenu.add(reLoginItem);
		functionJMenu.add(closeItem);

		aboutJMenu.add(accountItem);

		// 将菜单里面的两个选项添加到菜单当中
		jMenuBar.add(functionJMenu);
		jMenuBar.add(aboutJMenu);

		// 给整个界面设置菜单
		this.setJMenuBar(jMenuBar);
	}

	private void initJFrame() {
		// 比如，宽高，直接展示出来
		this.setSize(630, 680);

		// 设置界面的标题
		this.setTitle("拼图单机版 v1.0");

		// 设置界面置顶
		this.setAlwaysOnTop(true);

		// 设置界面居中
		this.setLocationRelativeTo(null);

		// 设置关闭模式
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		// 取消默认的居中放置，只有取消了才会按照XY轴的形式添加组件
		this.setLayout(null);
	}
}
