package farmerandlord.src;

import farmerandlord.src.com.itheima.game.GameJFrame;
import farmerandlord.src.com.itheima.game.LoginJFrame;

public class App {
	public static void main(String[] args) {
		/*
		 * 如果是通过登录打开这个游戏，会导致发牌的动画不展示；这里需要用到后面所学知识；
		 * new LoginJFrame();
		 *
		 * 所以目前直接展示游戏界面
		 */
		new GameJFrame();
	}
}
