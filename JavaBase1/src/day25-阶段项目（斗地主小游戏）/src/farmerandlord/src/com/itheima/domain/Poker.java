package farmerandlord.src.com.itheima.domain;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Poker extends JLabel implements MouseListener {
	// 1.牌的名字  格式：数字-数字
	private String name;
	// 2.牌显示正面还是反面
	private boolean up;
	// 3.是否可点击
	private boolean canClick = false;
	/*
	 * 4.当前状态，是否已经被点击
	 * 		如果是没有点击的状态，此时被点击了，会执行弹起的操作
	 * 		如果是已经被点击的状态，此时被点击了，会执行降落的操作
	 */
	private boolean clicked = false;

	// 构造方法（牌必须要有名字和正反面，因此在此处不用写无参构造）
	public Poker(String name, boolean up) {
		this.name = name;
		this.up = up;

		// 判断当前的牌是显示正面还是背面
		if (this.up) {
			this.turnFront();
		} else {
			this.turnRear();
		}
		// 设置牌的宽高大小
		this.setSize(71, 96);
		// 把牌显示出来
		this.setVisible(true);
		// 给每一张牌添加鼠标监听
		this.addMouseListener(this);    // JLabel没有addActionListener
	}

	// 显示正面
	public void turnFront() {
		this.setIcon(new ImageIcon("JavaBase1/src/day25-阶段项目（斗地主小游戏）/src/farmerandlord/image/poker/" + name + ".png"));
		this.canClick = true;
	}

	// 显示背面
	public void turnRear() {
		this.setIcon(new ImageIcon("JavaBase1/src/day25-阶段项目（斗地主小游戏）/src/farmerandlord/image/poker/rear.png"));
		this.canClick = false;
	}

	/*
	 * 类实现MouseListener接口后，重写所有的方法
	 *
	 * 出牌时，需要点击牌：
	 * 	被点击之后，牌向上移动20个像素
	 * 	再次被点击，牌回落20个像素
	 */
	@Override
	public void mouseClicked(MouseEvent e) {
		// 点击：判断当前的牌是否可以被点击
		if (canClick) {
			int step = 0;
			// 当牌被点击之后，要么升起，要么降落
			if (clicked) {
				// 表示当前的牌已经被点击，需要降落（y 增加 20 像素）；因为y轴是负的，降落相当于增加像素
				step = 20;
			} else {
				// 表示当前的牌还没有被点击，需要升起（y 减少 20 像素）
				step = -20;
			}
			clicked = !clicked;

			// 修改一下牌的位置
			Point from = this.getLocation();
			// 创建一个Point的对象，表示结束位置
			Point to = new Point(from.x, from.y + step);
			// 把最新的位置设置给牌
			this.setLocation(to);
		}
	}

	public void mouseEntered(MouseEvent arg0) {
	}

	public void mouseExited(MouseEvent arg0) {
	}

	public void mouseReleased(MouseEvent arg0) {
	}

	public void mousePressed(MouseEvent e) {
	}


	/**
	 * 获取
	 *
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置
	 *
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 获取
	 *
	 * @return up
	 */
	public boolean isUp() {
		return up;
	}

	/**
	 * 设置
	 *
	 * @param up
	 */
	public void setUp(boolean up) {
		this.up = up;
	}

	/**
	 * 获取
	 *
	 * @return canClick
	 */
	public boolean isCanClick() {
		return canClick;
	}

	/**
	 * 设置
	 *
	 * @param canClick
	 */
	public void setCanClick(boolean canClick) {
		this.canClick = canClick;
	}

	/**
	 * 获取
	 *
	 * @return clicked
	 */
	public boolean isClicked() {
		return clicked;
	}

	/**
	 * 设置
	 *
	 * @param clicked
	 */
	public void setClicked(boolean clicked) {
		this.clicked = clicked;
	}
}
