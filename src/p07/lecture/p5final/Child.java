package p07.lecture.p5final;

public final class Child extends Parent{
	@Override 
	public void method1() {
		System.out.println("method override");
	}
	
	// final 메소드는 오버라이딩 X
//	@Override
//	public void method2() {
//		System.out.println("method override");
//	}
}
