package p08.textbook.s08_05_03;

import p08.textbook.s08_05_02.HankookTire;
import p08.textbook.s08_05_02.Tire;

public class Car {
	Tire[] tires = {
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
	};
	
	void run() {
		for(Tire tire : tires) {
			tire.roll();
		}
			
	}
}
