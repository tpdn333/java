package p08.textbook.s08_05_06;

public class Driver {
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkPare();
		}
		vehicle.run();
	}
}
