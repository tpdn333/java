package p09.lecture;

public class A02LocalClass {
	// non-static inner class
	class InnerClass {
	}

	// static nested Class
	static class StaticClass {

	}
	
	void method1() {
		// local class
		class LocalClass{
			// 필드
			// 생성자
			// 메소드
		}
		LocalClass o1 = new LocalClass();
	}
}
