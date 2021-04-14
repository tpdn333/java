package p08.textbook.s08_05_04;

public class DriverExample {
	public static void main(String[] args) {
		Driver d1 = new Driver();
		
		Bus b = new Bus();
		Taxi t = new Taxi();
		
		d1.drive(b);
		d1.drive(t);
	}
}
