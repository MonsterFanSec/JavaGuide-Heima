package com.itheime.mycharset.code;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
 * Java中编码的方法
 *      public byte[] getBytes()                        使用默认方式进行编码
 *      public byte[] getBytes(String charsetName)      使用指定方式进行编码
 *
 * Java中解码的方法
 *      String(byte[] bytes)                            使用默认方式进行解码
 *      String(byte[] bytes, String charsetName)        使用指定方式进行解码
 *
 *  eclipse默认使用GBK
 *  idea默认使用utf-8
 */
public class CharSetDemo3 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "ai你哟";

		// 1.编码
		byte[] bytes1 = str.getBytes();
		System.out.println(Arrays.toString(bytes1));
		// 2.解码
		String str2 = new String(bytes1);
		System.out.println(str2);

		System.out.println("===================================");

		// 1.编码
		byte[] bytes2 = str.getBytes("GBK");
		System.out.println(Arrays.toString(bytes2));
		// 2.解码
		String str3 = new String(bytes1);
		System.out.println(str3);
		String str4 = new String(bytes1, "GBK");
		System.out.println(str4);
		String str5 = new String(bytes2, "GBK");
		System.out.println(str5);
	}
}