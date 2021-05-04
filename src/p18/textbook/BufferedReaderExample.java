package p18.textbook;

import java.io.*;

public class BufferedReaderExample {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("입력: ");
		String lineString = br.readLine();

		System.out.println("출력: " + lineString);
		
		br.close();
	}
}
