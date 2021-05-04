package p18.textbook.exercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;

public class ex11_ClientExample {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("172.30.1.12", 5001);
		OutputStream os = socket.getOutputStream();

		String filePath = "C:\\myworkspace\\1_Java\\java_core\\src\\p18\\textbook\\exercise\\ex11_ClientExample.java";
		File file = new File(filePath);

		String fileName = file.getName();
//		byte[] fileNameBytes = fileName.getBytes("UTF-8");
//        fileNameBytes = Arrays.copyOf(fileNameBytes, 100);
//        os.write(fileNameBytes);
		byte[] arr1 = new byte[100];
		fileName.getBytes(0, fileName.length(), arr1, 0);
		os.write(arr1, 0, 100);

		System.out.println("[파일 보내기 시작]" + fileName);
		FileInputStream fis = new FileInputStream(filePath);

		int len = 0;
		while ((len = fis.read(arr1)) != -1) {
			os.write(arr1, 0, len);
		}

		os.flush();
		System.out.println("[파일 보내기 완료]");

		fis.close();
		os.close();
		socket.close();

	}
}
