package p18.lecture;

import java.io.*;

public class A20BufferedReader {
	public static void main(String[] args) throws Exception {
		String path = "src/p18/lecture/A20BufferedReader.java";
		Reader rd = new FileReader(path);
		BufferedReader br = new BufferedReader(rd);
		
//		System.out.println((char) br.read());
//		System.out.println((char) br.read());
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
		
		String line = null;
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		
		rd.close();
		br.close();
	}
}
