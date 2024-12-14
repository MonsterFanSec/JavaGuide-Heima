package a08test2;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 客户端：发送一条数据，接收服务端反馈的消息并打印
 * 服务器：接收数据并打印，再给客户端反馈消息
 */
public class Server {
	public static void main(String[] args) throws IOException {
		// 5.创建对象并绑定10007端口
		ServerSocket ss = new ServerSocket(10087);

		// 6.等待客户端连接
		Socket socket = ss.accept();

		// 7.socket中获取输入流读取数据
		InputStream is = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is);  // 转换流，将字节流变成字符流
		int b;
		/*
		 * 8.细节：
		 *      read方法会从连接通道中读取数据
		 *      但是，需要有一个结束标记，此处的循环才会停止
		 *      否则，程序就会一直停在read方法这里，等待读取下面的数据
		 */
		while ((b = isr.read()) != -1) {
			System.out.println((char) b);
		}

		// 10.回写数据
		String str = "到底有多开心？";
		OutputStream os = socket.getOutputStream();
		os.write(str.getBytes());

		// 9.释放资源
		socket.close();
		ss.close();
	}
}