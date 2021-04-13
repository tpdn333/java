package p07.textbook.s7_07_04;

public class DriverExample {
	public static void main(String[] args) {
		
		Driver d1 = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		d1.drive(bus);
		d1.drive(taxi);
	}
}
