package p07.textbook.exercise.ex07;

public class SnowTireExample {
	public static void main(String[] args) {
		SnowTire sT1 = new SnowTire();
		Tire tire = sT1;
		
		sT1.run();
		tire.run();
	
	}
}
