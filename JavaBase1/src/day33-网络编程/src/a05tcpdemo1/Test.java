package a05tcpdemo1;

/*
 * TCP通信协议：
 * 		TCP通信协议是一种可靠的网络协议，它在通信的两端各建立一个Socket对象
 * 		通信之前要保证连接已经建立
 * 		通过Socket产生IO流来进行网络通信
 *
 * 客户端（Socket）：
 * 		1.创建客户端的Socket对象（Socket）与指定服务端连接
 * 			Socket（String host，int port）
 *
 * 		2.获取输出流，写数据
 * 			OutputStream getOutputStream()
 *
 * 		3.释放资源
 * 			void close()
 *
 *
 * 服务器（ServerSocket）：
 * 		1.创建服务器端的Socket对象（ServerSocket）
 * 			ServerSocket（int port）		// port与客户端port一致
 *
 * 		2.监听客户端连接，返回一个Socket对象
 * 			Socket accept()
 *
 * 		3.获取输入流，读数据，并把数据显示在控制台
 * 			InputStream getInputStream()
 *
 * 		4.释放资源
 * 			void close()
 */
public class Test {
}
