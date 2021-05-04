package p18.lecture;

import java.io.*;

public class A24Serializable {
	public static void main(String[] args) throws Exception {
		String file = "src/p18/lecture/output24.txt";
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));

		oos.writeObject(new Book());
		
		oos.close();
	}
}
