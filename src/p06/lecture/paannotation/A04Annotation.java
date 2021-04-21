package p06.lecture.paannotation;

// 클래스
@MyAnnotation3
public class A04Annotation {
	// 필드
	@MyAnnotation3
	int field1;
	
	// 생성자
	@MyAnnotation3
	A04Annotation() {
		// TODO Auto-generated constructor stub
	}
	
	// 메소드
	@MyAnnotation3(999)
	public void method1() {
		@MyAnnotation3
		int val;
	}

	@MyAnnotation3(value = 999)
	public void method2() {
		
	}
	
	@MyAnnotation3(value = 999, attr1 = 456)
	public void method3() {
		
	}
	
}
