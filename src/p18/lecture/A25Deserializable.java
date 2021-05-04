package p18.lecture;

import java.io.*;

public class A25Deserializable {
	public static void main(String[] args) throws Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/p18/lecture/output24.txt"));

		Book b = (Book) ois.readObject();
		System.out.println(b);
		ois.close();
	}
}
