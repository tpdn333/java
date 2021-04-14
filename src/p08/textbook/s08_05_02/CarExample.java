package p08.textbook.s08_05_02;

public class CarExample {
	public static void main(String[] args) {
		Car c1 = new Car();

		c1.run();

		c1.frontLeftTire = new KumhoTire();
		c1.frontRightTire = new KumhoTire();

		c1.run();
	}
}
