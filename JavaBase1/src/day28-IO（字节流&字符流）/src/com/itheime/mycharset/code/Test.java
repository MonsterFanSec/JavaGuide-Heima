package com.itheime.mycharset.code;

/*
 * 原因1:读取数据时未读完整个汉字
 * 原因2:编码和解码时的方式不统一
 *
 * 如何不产生乱码？
 * 	1.不要用字节流读取文本文件
 *  2.编码解码时使用同一个码表，同一个编码方式
 */
public class Test {
}
