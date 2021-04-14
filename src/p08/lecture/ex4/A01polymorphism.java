package p08.lecture.ex4;

public class A01polymorphism {
	public static void main(String[] args) {
		System.out.println("영웅 생성");
		Hero h1 = new Hero();
		
		System.out.println("무기 장착");
		h1.setGun(new NormalGun());
		
		System.out.println("공격");
		h1.attack();
		
		System.out.println("새 무기장착");
		h1.setGun(new WaterGun());
		
		System.out.println("공격");
		h1.attack();
	}
}
