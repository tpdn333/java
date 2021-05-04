package p18.lecture;

import java.io.*;

public class A21BufferedOutputStream {
	public static void main(String[] args) throws Exception {
		String path = "src/p18/lecture/output21.txt";
		FileOutputStream os = new FileOutputStream(path);
		BufferedOutputStream bo = new BufferedOutputStream(os);
		long start = System.nanoTime();
		for (int i = 0; i < 3000; i++) {
			bo.write('a');

		}
		long end = System.nanoTime();
		System.out.println(end - start);
		bo.close();
		os.close();
	}
}
