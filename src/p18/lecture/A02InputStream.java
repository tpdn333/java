package p18.lecture;

import java.io.FileInputStream;
import java.io.InputStream;

public class A02InputStream {
	public static void main(String[] args) throws Exception {
		String file = "src/p18/lecture/A02InputStream.java";
		InputStream is = new FileInputStream(file);

//		int b1 = is.read();
//		System.out.println(b1);

		int b = 0;
		int cnt = 0;
		while ((b = is.read()) != -1) {
			++cnt;
			System.out.println(b);

		}
		System.out.println(cnt);
		is.close();
	}
}
