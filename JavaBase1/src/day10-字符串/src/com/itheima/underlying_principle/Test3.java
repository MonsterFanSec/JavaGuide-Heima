package com.itheima.underlying_principle;

public class Test3 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();

		//	容量：最多装多少
		//	长度：已经装了多少
		System.out.println(sb.capacity());    // 16
		System.out.println(sb.length());    // 0

		//sb.append("abc");
		//System.out.println(sb.capacity());    // 16
		//System.out.println(sb.length());    // 3

		//sb.append("abcdefghijklmnopqrstuvwxyz");
		//System.out.println(sb.capacity());    // 34
		//System.out.println(sb.length());    // 26

		sb.append("abcdefghijklmnopqrstuvwxyz0123456789");
		System.out.println(sb.capacity());    // 36
		System.out.println(sb.length());    // 36
	}
}
