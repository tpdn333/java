package p07.textbook.s7_07_06;

public class InstanceOfExample {
	public static void method1(Parent p1) {
		if(p1 instanceof Child) {
			Child c1 = (Child) p1;
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
	}
	
	public static void method2(Parent p1) {
		Child c1 =(Child) p1;
		System.out.println("method2 - Child로 변환 성공");
	}
	
	public static void main(String[] args) {
		Parent pA = new Child();
		method1(pA);
		method2(pA);
		
		Parent pB = new Parent();
		method1(pB);
		method2(pB);		// 예외
	}
}
