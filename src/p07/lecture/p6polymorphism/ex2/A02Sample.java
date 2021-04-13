package p07.lecture.p6polymorphism.ex2;

public class A02Sample {
	public static void main(String[] args) {
		Hero h1 = new Hero();

		System.out.println("기본 총 창작");
		h1.setGun(new Gun());

		System.out.println("적 만남");
		h1.attack();
		
		System.out.println("물총을 주웠다");
		h1.setGun(new WaterGun());
		
		System.out.println("적 만남");
		h1.attack();
		
		System.out.println("무지개총을 주웠다.");
		h1.setGun(new RainbowGun());
		
		System.out.println("적 만남");
		h1.attack();
	}
}
