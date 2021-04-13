package p07.lecture.p6polymorphism.ex1;

public class A01Polymorphism {
	public static void main(String[] args) {
		Cat c1 = new Cat();
		Tiger t1 = new Tiger();
		
		c1.cry();
		t1.cry();
		
		KindaCat k1;
		k1 = c1;
		
		System.out.println(k1 == c1);
		System.out.println(System.identityHashCode(c1));
		System.out.println(System.identityHashCode(k1));
		
		KindaCat k2;
		k2 = t1;
		
		System.out.println(k2 == t1);
		System.out.println(System.identityHashCode(t1));
		System.out.println(System.identityHashCode(k2));
		
		KindaCat k3 = new Cat();
		KindaCat k4 = new Tiger();
//		c1 = k1;	// x
//		t1 = k2;  	// x
	}
}
