package com.itheima.a01InetAddressdemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * static InetAddress getByName(String host)  确定主机名称的IP地址。主机名称可以是机器名称，也可以是IP地址
 * String getHostName()                        获取此IP地址的主机名
 * String getHostAddress()                     返回文本显示中的IP地址字符串
 */
public class MyInetAddressDemo1 {
	public static void main(String[] args) throws UnknownHostException {
		// 1.获取InetAddress的对象
		// IP的对象 一台电脑的对象
		InetAddress address = InetAddress.getByName("MAC");
		System.out.println(address);    // Mac/192.168.50.53

		String name = address.getHostName();
		System.out.println(name);    // MAC

		String ip = address.getHostAddress();
		System.out.println(ip);    // 192.168.50.53
	}
}
