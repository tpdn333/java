package p18.lecture;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class A06FileCopy {
	public static void main(String[] args) throws Exception {
		String origin = "src/p18/lecture/A02InputStream.java";
		String des = "src/p18/lecture/A02InputStream.copy";

		InputStream is = new FileInputStream(origin);
		OutputStream os = new FileOutputStream(des);

		int data = 0;
		while ((data = is.read()) != -1) {
			os.write(data);
		}
		System.out.println("복사 완료");
		
		is.close();
		os.close();
	}
}
