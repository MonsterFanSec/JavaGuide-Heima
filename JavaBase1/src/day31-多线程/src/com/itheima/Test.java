package com.itheima;

/*
 * 一、什么是多线程？
 * 线程：
 * 		线程是操作系统能够进行运算调度的最小单位。它被包含在进程之中，是进程中的实际运作单位。
 *
 * 进程：
 * 		进程是程序的基本执行实体
 *
 *
 * 多线程的应用场景：
 * 		软件中的耗时操作：
 * 			拷贝、迁移大文件
 * 			加载大量的资源文件
 * 		所有的聊天软件
 * 		所有的后台服务器
 *
 *
 * 总结：
 * 		1.什么是多线程？
 * 			有了多线程，我们就可以让程序同时做多件事情
 * 		2.多线程的作用？
 * 			提高效率
 * 		3.多线程的应用场景？
 * 			只要你想让多个事情同时运行就需要用到多线程
 * 			比如：软件中的耗时操作、所有的聊天软件、所有的服务器
 *
 *
 *
 * 二、并发和并行：
 * 		并发：在同一时刻，有多个指令在单个CPU上交替执行
 * 		并行：在同一时刻，有多个指令在多个CPU上同时执行
 *
 *
 * 三、多线程的实现方式
 * 		1.继承Thread类的方式进行实现
 * 			优点：编程比较简单，可以直接使用Thread类中的方法
 * 			缺点：可以扩展性较差，不能再继承其他的类
 *
 * 		2.实现Runnable接口的方式进行实现
 * 			优点：扩展性强，实现该类接口的同时还可以继承其他的类
 * 			缺点：编程相对复杂，不能直接使用Thread类中的方法
 *
 * 		3.利用Callable接口和Future接口方式实现
 * 			优点：扩展性强，实现该类接口的同时还可以继承其他的类
 * 			缺点：编程相对复杂，不能直接使用Thread类中的方法
 */
public class Test {
}
