package p08.textbook.s08_05_05;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle v1 = new Bus();
		
		v1.run();
//		v1.checkFace();		// x
		
		Bus bus = (Bus) v1;
		
		bus.run();
		bus.checkFace();
	}
}
