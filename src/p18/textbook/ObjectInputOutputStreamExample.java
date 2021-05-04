package p18.textbook;

import java.io.*;
import java.util.Arrays;

public class ObjectInputOutputStreamExample {
	public static void main(String[] args) throws Exception {
		String path = "src/p18/textbook/Object.txt";
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));

		oos.writeObject(new Integer(10));
		oos.writeObject(new Double(Math.PI));
		oos.writeObject(new int[] { 1, 2, 3, 4 });
		oos.writeObject(new String("홍길동"));

		oos.flush();
		oos.close();

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));

		Integer obj1 = (Integer) ois.readObject();
		Double obj2 = (Double) ois.readObject();
		int[] obj3 = (int[]) ois.readObject();
		String obj4 = (String) ois.readObject();

		ois.close();
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(Arrays.toString(obj3));
		System.out.println(obj4);

	}
}
