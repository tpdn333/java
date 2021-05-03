package p18.lecture;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class A04OutputStream {
	public static void main(String[] args) throws Exception {
		String file = "src/p18/lecture/output04.txt";
		OutputStream os = new FileOutputStream(file);

		os.write(97);
		os.write(98);
		os.close();
	}
}
