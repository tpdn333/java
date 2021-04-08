package p06.lecture.p5static;

public class MyClass4 {
	int i = 3;
	int k;

	static int a = 5;
	static int b;

	static {
		b = 50;
	}

	MyClass4() {
		// 인스턴스 필드 초기화
		this.k = 5;
	}
}
