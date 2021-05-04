package p18.lecture;

import java.io.*;
import java.util.*;

public class A15PrintWriter {
	public static void main(String[] args) throws Exception {
		String file = "src/p18/lecture/output15.txt";
		Scanner s = new Scanner(System.in);

		PrintWriter pw = new PrintWriter(file);

		String line = "";

		while (!line.equals("종료")) {
			System.out.print("입력>");
			line = s.nextLine();
			pw.println(line);
		}

		pw.close();
		s.close();
	}
}
