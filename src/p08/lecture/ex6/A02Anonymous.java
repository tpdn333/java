package p08.lecture.ex6;

public class A02Anonymous {
	public static void main(String[] args) {
		Parent p1 = new Child();
		p1.method1();
		
		// 익명클래스의 객체
		Parent p2 = new Parent() {
			@Override
			public void method1() {
				System.out.println("Anonymous Class method1()");
			}
			
		};
		p2.method1();
	}
}
