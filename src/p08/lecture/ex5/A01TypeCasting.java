package p08.lecture.ex5;

public class A01TypeCasting {
	public static void main(String[] args) {
		Malamute m1 = new Malamute();
		m1.bark();
		m1.sit();
		m1.pull();
		
		Pet p1 = m1;
//		p1.bark();		// x
		p1.sit();		// o
//		p1.pull();		// x 
		
		SledDog s1 = m1;
//		s1.bark();		// x
//		s1.sit();		// x
		s1.pull();		// o
		
		KindaDog k1 = m1;
		k1.bark();		// o
//		k1.sit();		// x
//		k1.pull();		// x
		
		Malamute m2 = (Malamute) k1;
		m2.bark();
		m2.sit();
		m2.pull();
		
		Wolf w1 = (Wolf) k1;
		w1.bark();
		System.out.println("종료");
	}
}
