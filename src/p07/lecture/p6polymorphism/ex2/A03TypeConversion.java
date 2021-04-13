package p07.lecture.p6polymorphism.ex2;

public class A03TypeConversion {
	public static void main(String[] args) {
		Gun g1 = new Gun();
		WaterGun g2 = new WaterGun();
		RainbowGun g3 = new RainbowGun();
		
		Gun g4 = g2;
		Gun g5 = g3;
		
//		process(g1);
	}
}
