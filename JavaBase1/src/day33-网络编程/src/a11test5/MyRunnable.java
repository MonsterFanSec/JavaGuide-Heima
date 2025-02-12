package a11test5;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class MyRunnable implements Runnable {
	Socket socket;

	public MyRunnable(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			// 3.读取数据并保存到本地文件中
			BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
			String name = UUID.randomUUID().toString().replace("-", "");
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("/Users/daykalif/Desktop/Java/JavaBase1/src/day33-网络编程/src/a11test5/serverdir/" + name + ".jpg"));
			int len;
			byte[] bytes = new byte[1024];
			while ((len = bis.read(bytes)) != -1) {
				bos.write(bytes, 0, len);
			}
			bos.close();
			// 4.回写数据
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			bw.write("上传成功");
			bw.newLine();
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 5.释放资源
			if (socket != null) {
				try {
					socket.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
