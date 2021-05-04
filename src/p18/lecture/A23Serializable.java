package p18.lecture;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class A23Serializable {
	public static void main(String[] args) throws Exception {
		String path = "src/p18/lecture/output23.txt";
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));

		oos.writeObject(new Car()); // serialization( 직렬화 )
		oos.close();

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));

		Car c = (Car) ois.readObject(); // deserialization( 역직렬화 )
		System.out.println(c);
		ois.close();

	}
}

class Car implements Serializable {

	private String name;
	private int id;

}
