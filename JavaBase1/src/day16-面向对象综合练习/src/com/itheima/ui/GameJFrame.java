package com.itheima.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

/*
 * 小结：
 * 	1.将15张小图片移动到界面的中央偏下方
 * 	2.添加背景图片
 * 		细节：代码中后添加的，塞在下方
 * 	3.添加图片的边框
 * 		jLabel.setBorder(new BevelBorder(1));
 * 	4.优化路径
 * 		- 从盘符开始的：绝对路径
 * 		- 非盘符开始的：相对路径
 *
 * 07-移动图片小结：
 *	1.本类实现KeyListener接口，并重写所有抽象方法
 * 	2.给整个界面添加键盘监听事件
 * 	3.统计一下空白方块对应的数字0在二维数组中的位置
 * 	4.在keyReleased方法当中实现移动的逻辑
 * 	5.Bug修复：
 * 		- 当空白方块在最下方时，无法再次进行上移
 * 		- 当空白方块在最上方时，无法再次进行下移
 * 		- 当空白方块在最左侧时，无法再次进行右移
 * 		- 当空白方块在最右侧时，无法再次进行左移
 */

public class GameJFrame extends JFrame implements KeyListener {
	//	在JAVA中，JFrame表示界面/窗体
	//	与此同时，子类也表示界面/窗体
	//	规定：GameJFrame这个界面表示的就是游戏的主界面，以后跟游戏相关的所有逻辑都写在这个类中

	// 创建一个二维数组，目的：用来管理数据；加载图片的时候，会根据二维数组中的数据进行加载
	int[][] data = new int[4][4];

	// 记录空白方块在二维数组中的位置
	int x = 0;
	int y = 0;


	// 空参构造
	public GameJFrame() {
		// 初始化界面
		initJFrame();    // 快捷键：command+option+M（抽取方法）

		// 初始化菜单
		initJMenuBar();

		// 初始化数据(打乱图片索引)
		initData();

		// 初始化图片（根据打乱之后的结果去加载图片）
		initImage();

		// 让显示显示出来，建议写在最后
		this.setVisible(true);
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

		//	给整个界面添加键盘监听事件
		this.addKeyListener(this);
	}

	private void initData() {
		// 1.定义一个一维数组
		int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

		// 2.打乱数组中的数据的顺序
		// 遍历数组，得到每一个元素，拿着每一个元素跟随机索引上的数据进行交换
		Random r = new Random();
		for (int i = 0; i < tempArr.length; i++) {
			// 获取到随机索引
			int index = r.nextInt(tempArr.length);

			// 拿着遍历到的每一个数据，跟随机索引上的数据进行交换
			int temp = tempArr[i];
			tempArr[i] = tempArr[index];
			tempArr[index] = temp;
		}

		/*
		 * 3.给二维数组添加数据
		 */
		// 解法一：遍历一维数组tempArr得到每一个元素，把每一个元素依次添加到二维数组当中
		for (int i = 0; i < tempArr.length; i++) {
			if (tempArr[i] == 0) {
				x = i / 4;
				y = i % 4;
			}
			data[i / 4][i % 4] = tempArr[i];
		}
	}

	// 细节：先加载的图片在上方，后加载的图片塞在下面。
	private void initImage() {
		// 清空原本已经出现的所有图片
		this.getContentPane().removeAll();

		/*
		 *	路径分为两种：
		 * 	绝对路径：一定是从根路径开始的。/
		 *  	相对路径：不是从盘符开始的
		 *      相对路径相对当前项目而言的。 aaa/bbb
		 *      在当前项目下，去找aaa文件夹，里面再找bbb文件夹。
		 */
		String path = "/Users/daykalif/Desktop/Java/JavaBase1/src/day16-面向对象综合练习";


		//	外循环--把内循环重复执行了4次
		for (int i = 0; i < 4; i++) {
			//	内循环--表示在一行添加4张图片
			for (int j = 0; j < 4; j++) {
				// 获取当前要加载图片的序号
				int num = data[i][j];

				// 创建一个图片ImageIcon的对象，传入路径
				ImageIcon icon = new ImageIcon(path + "/image/animal/animal3/" + num + ".jpg");
				// 创建一个JLabel的对象（管理容器）
				JLabel jLabel = new JLabel(icon);
				// 指定图片位置，如果不设置位置,默认会放到界面正中央
				jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
				// 给图片添加边框；0:表示让图片凸起来，1：表示让图片凹下去
				jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
				// 把管理容器添加到界面中
				this.getContentPane().add(jLabel);
			}
		}


		// 添加背景图片
		JLabel background = new JLabel(new ImageIcon(path + "/image/background.png"));
		background.setBounds(40, 40, 508, 560);
		// 把背景图片添加到界面当中
		this.getContentPane().add(background);

		// 向上移动时刷新一下界面
		this.getContentPane().repaint();
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// 对上，下，左，右进行判断
		// 左：37 上：38 右：39 下：40
		int code = e.getKeyCode();
		System.out.println("键盘触发的事件key：" + code);

		if (code == 37) {
			System.out.println("向左移动");
			if (y == 3) {
				return;
			}
			// 逻辑：把空白方块右方的数字往左移动
			data[x][y] = data[x][y + 1];
			data[x][y + 1] = 0;
			y++;

			// 调用方法按照最新的数字加载图片
			initImage();
		} else if (code == 38) {
			System.out.println("向上移动");

			if (x == 3) {
				// 表示空白方块已经在最下方了，他的下面没有图片再能移动了
				return;
			}

			// 逻辑：把空白方块下方的数字往上移动		// x，y  表示空白方块；x + 1， y 表示空白方块下方的数字
			// 把空白方块下方的数字赋值给空白方块
			data[x][y] = data[x + 1][y];
			data[x + 1][y] = 0;
			x++;

			// 调用方法按照最新的数字加载图片
			initImage();
		} else if (code == 39) {
			System.out.println("向右移动");

			if (y == 0) {
				return;
			}
			// 逻辑：把空白方块左方的数字往右移动
			data[x][y] = data[x][y - 1];
			data[x][y - 1] = 0;
			y--;

			// 调用方法按照最新的数字加载图片
			initImage();
		} else if (code == 40) {
			System.out.println("向下移动");
			if (x == 0) {
				return;
			}
			// 逻辑：把空白方块上方的数字往下移动
			data[x][y] = data[x - 1][y];
			data[x - 1][y] = 0;
			x--;

			// 调用方法按照最新的数字加载图片
			initImage();
		}
	}
}
