package p07.textbook.s7_08_04;

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		
		System.out.println("-----");

		// 변수의 자동 타입 변환
		Animal a1 = null;
		a1 = new Dog();
		a1.sound();

		a1 = new Cat();
		a1.sound();
		System.out.println("-----");

		// 메소드의 다형성
		animalSound(new Dog());
		animalSound(new Cat());
	}

	public static void animalSound(Animal a1) {
		a1.sound();
	}
}
