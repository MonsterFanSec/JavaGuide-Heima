package com.itheima.mydynamicproxy;

/*
 * 什么是动态代理？
 *      特点：无侵入式的给代码增加额外的功能
 *
 * 总结：
 * 	1.为什么需要代理？
 * 		代理可以无侵入式的给对象增强其他的功能
 * 		调用者-->代理-->对象
 *  2.代理长什么样？
 * 		代理里面就是对象要被代理的方法
 *  3.Java通过什么来保证代理的样子？
 * 		通过接口保证，后面的对象和代理需要实现同一个接口
 * 		接口中就是被代理的所有的方法
 *
 *
 * 需求：
 *      外面的人想要大明星唱一首歌
 *          1. 获取代理的对象
 *              代理对象 = ProxyUtil.createProxy(大明星的对象);
 *          2. 再调用代理的唱歌方法
 *              代理对象.唱歌的方法("只因你太美");
 */
public class Test {
	public static void main(String[] args) {
		// 1. 获取代理的对象
		BigStar bigStar = new BigStar("鸡哥");
		Star proxy = ProxyUtil.createProxy(bigStar);

		// 2. 调用唱歌的方法
		String result = proxy.sing("只因你太美");
		System.out.println(result);
	}
}
