package p08.textbook.s08_05_03;

import p08.textbook.s08_05_02.KumhoTire;

public class CarExample {
	public static void main(String[] args) {
		Car c1 = new Car();
		
		c1.run();
		
		c1.tires[0] = new KumhoTire();
		c1.tires[1] = new KumhoTire();
		
		c1.run();
	}
}
