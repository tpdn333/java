package p08.lecture.ex5;

public class A02InstanceOf {
	public static void main(String[] args) {
		KindaDog d1 = new Malamute();
		
		
		// 강제 형변환 가능
		System.out.println(d1 instanceof KindaDog);		// true
		System.out.println(d1 instanceof Malamute);		// true
		System.out.println(d1 instanceof Pet);			// true
		System.out.println(d1 instanceof SledDog);		// true
		
		// 강제 형변환 불가능!
		System.out.println(d1 instanceof Wolf);			// false
		
		Malamute m1 = (Malamute) d1;
		Pet p1 = (Pet) d1;
		SledDog s1 = (SledDog) d1;
//		Wolf w1 = (Wolf) d1;			// 오류
		
		// 문제가 없으면 프린트문 실행
		System.out.println("종료");
	}
}
