package p18.lecture;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class A22ObjectStream {
	public static void main(String[] args) throws Exception {
		String path = "src/p18/lecture/output22.txt";
		FileOutputStream fos = new FileOutputStream(path);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(new String("java"));
		oos.writeObject(new String[] { "ccs", "html" });

		oos.close();
		fos.close();

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));

		String s = (String) ois.readObject();
		String[] arr = (String[]) ois.readObject();
		System.out.println(s);
		System.out.println(Arrays.toString(arr));

		ois.close();
	}
}
