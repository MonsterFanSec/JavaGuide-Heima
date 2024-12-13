package a02udpdemo1;

import java.io.IOException;
import java.net.*;

/*
 * UDP发送数据
 *
 * 发送数据的时候不会确保有没有发送成功；发送成功就成功，发送失败就拉到；
 */
public class SendMessageDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * 1.创建DatagramSocket对象(快递公司)
		 *
		 * 细节：
		 *      绑定端口，以后我们就是通过这个端口往外发送
		 *      空参：所有可用的端口中随机一个进行使用
		 *      有参：指定端口号进行绑定
		 */
		DatagramSocket ds = new DatagramSocket();

		// 2.打包数据
		String str = "你好威啊！！！";
		byte[] bytes = str.getBytes();
		InetAddress address = InetAddress.getByName("127.0.0.1");
		int port = 10086;    // 往10086端口发送数据

		DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, port);

		// 3.发送数据
		ds.send(dp);

		// 4.释放资源
		ds.close();
	}
}
