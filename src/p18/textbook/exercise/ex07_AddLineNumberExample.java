package p18.textbook.exercise;

import java.io.*;

public class ex07_AddLineNumberExample {
	public static void main(String[] args) throws Exception {
		String path = "src/p18/textbook/BufferedReaderExample.java";

		BufferedReader br = new BufferedReader(new FileReader(path));
		String line = null;
		int i = 1;
		while ((line = br.readLine()) != null) {
			System.out.println(i + ": " + line);
			i++;
		}
		br.close();

	}
}
