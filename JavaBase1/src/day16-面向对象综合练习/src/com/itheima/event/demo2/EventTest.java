package com.itheima.event.demo2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 *	事件：
 * 		事件是可以被组件识别的操作
 * 		当你对组件干了某件事情之后，就会执行对应的代码
 *
 * 	- 事件源：按钮 图片 窗体...
 * 	- 事件：某些操作
 * 		如：鼠标单击，鼠标划入...
 * 	- 绑定监听：当事件源上发生了某个事件，则执行某段代码
 *
 * 	KeyListener：键盘监听
 * 	MouseListener：鼠标监听
 * 	ActionListener：动作监听
 */
public class EventTest {
	public static void main(String[] args) {
		JFrame jFrame = new JFrame();
		// 设置界面的宽高
		jFrame.setSize(603, 680);
		// 设置界面的标题
		jFrame.setTitle("事件演示");
		// 设置界面置顶
		jFrame.setAlwaysOnTop(true);
		// 设置界面居中
		jFrame.setLocationRelativeTo(null);
		// 设置关闭模式
		jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		// 取消默认的居中放置，只有取消了才会按照XY轴的形式添加组件
		jFrame.setLayout(null);


		// 创建一个按钮对象
		JButton jtb = new JButton("点我啊");
		// 设置位置和宽高
		jtb.setBounds(0, 0, 100, 50);

		/*
		 * 给按钮添加动作监听:
		 * 		jtb:组件对象，表示你要给哪个组件添加事件
		 * 		addActionListener：表示我要给组件添加哪个事件监听（动作监听包含鼠标左键点击，空格）
		 * 		参数：表示事件被触发之后要执行的代码
		 *
		 * 由于每个按钮的事件不一致，因此MyActionListener只能被使用一次，其他的按钮用不了MyActionListener的逻辑，因此这个类没有必要单独定义一个类。
		 * 可以使用匿名内部类替换
		 */
		// jtb.addActionListener(new MyActionListener());

		// 匿名内部类的写法，表示一个匿名类继承ActionListener类，并重写里面的actionPerformed方法，之后再new一个空参构造
		jtb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("达咩~不要点我哟~");
			}
		});

		//把按钮添加到界面当中
		jFrame.getContentPane().add(jtb);

		jFrame.setVisible(true);
	}
}
