package p08.lecture.ex1;

public class A01Interface {
	public static void main(String[] args) {
		Cat c1 = new Cat();
		Malamute m1 = new Malamute();

		KindaCat k1 = c1;
		Pet p1 = c1;
		p1.sit();

		KindaDog k2 = m1;
		Pet p2 = m1;
		p2.sit();
		m1.sit();
		
		
//		Pet p1 = new Pet(); // x
	}
}
