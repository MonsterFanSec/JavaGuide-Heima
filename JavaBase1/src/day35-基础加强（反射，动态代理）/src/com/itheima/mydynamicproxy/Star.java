package com.itheima.mydynamicproxy;

/*
 * 我们可以把所有想要被代理的方法定义在接口当中
 */
public interface Star {
	// 唱歌
	public abstract String sing(String name);

	// 跳舞
	public abstract void dance();
}
