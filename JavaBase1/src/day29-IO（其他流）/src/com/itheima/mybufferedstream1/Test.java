package com.itheima.mybufferedstream1;

/*
 * 总结：
 * 		1.缓冲流有几种？
 * 			- 字节缓冲输入流：BufferedInputStream
 * 			- 字节缓冲输出流：BufferedOutputStream
 * 			- 字符缓冲输入流：BufferedReader
 * 			- 字符缓冲输出流：BufferedWriter
 *
 * 		2.缓冲流为什么能提高性能
 * 			- 缓冲流自带长度为8192的缓冲区
 * 				字节缓冲流缓冲区是byte类型，长度是8k
 *				字符缓冲流缓冲区是char类型，长度是16k
 * 			- 可以显著提高字节流的读写性能
 * 			- 对于字符流提升不明显，对于字符缓冲流而言关键点是两个特有的方法
 *
 * 		3.字符缓冲流的两个特有的方法是什么？
 * 			- 字符缓冲输入流BufferedReader：readLine()
 * 			- 字符缓冲输出流BufferedWriter：newLine()
 */
public class Test {
}
