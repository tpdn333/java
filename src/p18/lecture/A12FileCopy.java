package p18.lecture;

import java.io.*;

public class A12FileCopy {
	public static void main(String[] args) throws Exception {
		// 파일 복사 Reader, Writer 이용
		String src = "src/p18/lecture/A12FileCopy.java";
		String des = "src/p18/lecture/A12FileCopy.copy";

		Reader rd = new FileReader(src);
		Writer wt = new FileWriter(des);

		int i = 0;
		int cnt = 0;

		while ((i = rd.read()) != -1) {
			cnt++;
			wt.write(i);
		}
		System.out.println(cnt + "byte 복사 완료");

		rd.close();
		wt.close();

	}
}
