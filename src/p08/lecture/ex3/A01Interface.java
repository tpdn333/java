package p08.lecture.ex3;

public class A01Interface {
	public static void main(String[] args) {
		Malamute m1 = new Malamute();
		Pet p1 = m1;
		p1.sit();
//		p1.pull();		// x 
		
		SledDog s1 = m1;
		s1.pull();
//		s1.sit();		// x
	}
}
