package p18.lecture.network;

import java.io.*;
import java.net.*;

public class A02Socket {
	public static void main(String[] args) {
		ServerSocket sS = null;
		Socket socket = null;
		OutputStream os = null;
		OutputStreamWriter osw = null;
		try {
			sS = new ServerSocket();
			sS.bind(new InetSocketAddress("172.30.1.12", 5001));

			System.out.println("[연결 기다림]");
			socket = sS.accept();
			System.out.println("[연결 완료]");
			InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
			System.out.println(isa.getAddress());

			os = socket.getOutputStream();
			osw = new OutputStreamWriter(os);
			osw.write("hello client");
			osw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (os != null) {
				try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (osw != null) {
				try {
					osw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			try {
				if (socket != null)
					socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (socket != null)
					sS.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}
}
