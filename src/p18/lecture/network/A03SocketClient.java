package p18.lecture.network;

import java.net.*;
import java.io.*;

public class A03SocketClient {
	public static void main(String[] args) {
		Socket socket = null;
		InputStream is = null;
		InputStreamReader isr = null;
		try {
			socket = new Socket();
			System.out.println("[연결 요청]");
			socket.connect(new InetSocketAddress("172.30.1.12", 5001));
			System.out.println("[연결 성공]");

			char[] cbuf = new char[100];
			is = socket.getInputStream();
			isr = new InputStreamReader(is);
			int len = isr.read(cbuf);
			String message = new String(cbuf, 0, len);
			System.out.println(message);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (isr != null) {
				try {
					isr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (socket != null) {
				try {
					socket.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
