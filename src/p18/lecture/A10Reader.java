package p18.lecture;

import java.io.*;

public class A10Reader {
	public static void main(String[] args) throws Exception {
		String file = "src/p18/lecture/A10Reader.java";
		Reader rd = new FileReader(file);

		char[] datas = new char[10];

		int i = rd.read(datas);
		System.out.println(i);

		int len = 0;
		int cnt = 0;
		while ((len = rd.read(datas)) != -1) {
			System.out.println(len + "개: " + new String(datas, 0, len));
		}

		rd.close();
	}
}
