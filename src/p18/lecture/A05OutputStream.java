package p18.lecture;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class A05OutputStream {
	public static void main(String[] args) throws Exception {
		String file = "src/p18/lecture/output05.txt";
		OutputStream os = new FileOutputStream(file);

		byte[] datas = new byte[50];
		// 50byte 파일이 만들어진다
		os.write(datas);
		os.write(datas);
		
		// 데이터, 시작위치, 갯수
		os.write(datas, 0, 33);
		
		os.close();
	}
}
