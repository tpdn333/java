package p18.lecture;

import java.io.*;
import java.util.Scanner;

public class A14ToTextFile {
	public static void main(String[] args) throws Exception {
		String file = "src/p18/lecture/output14.txt";
		Writer wt = new FileWriter(file);
		Scanner s = new Scanner(System.in);

		String line = "";

		while (!line.equals("종료")) {
			System.out.print("입력>");
			line = s.nextLine();
			wt.write(line + "\n");
		}
		s.close();
		wt.close();
	}
}
