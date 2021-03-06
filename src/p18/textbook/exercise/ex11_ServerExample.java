package p18.textbook.exercise;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ex11_ServerExample {
	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("172.30.1.12", 5001));
		System.out.println("[서버 시작]");

		while (true) {
			try {
				Socket socket = serverSocket.accept();

				InputStream is = socket.getInputStream();

				byte[] bytes = new byte[1000];
				int readByCount = -1;

				is.read(bytes, 0, 100);
				String fileName = new String(bytes, 0, 100);
				fileName = fileName.trim();

				System.out.println("[파일 받기 시작]" + fileName);
				FileOutputStream fos = new FileOutputStream("C:\\Temp\\" + fileName);
				int i = 0;
				while ((i = is.read(bytes)) != -1) {
					fos.write(bytes, 0, i);
				}
				System.out.println("[파일 받기 완료]");

				fos.close();
				is.close();
				socket.close();
			} catch (Exception e) {
				break;
			}
		}
		serverSocket.close();
		System.out.println("[서버 종료]");

	}
}
