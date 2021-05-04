package p18.lecture;

import java.io.*;

public class A27HandleException {
	public static void main(String[] args) {
		String path = "src/p18/lecture/A27HandleException.java";

		// try resources
		try (FileInputStream fis = new FileInputStream(path); FileOutputStream fos = new FileOutputStream(path);) {
			fis.read();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
