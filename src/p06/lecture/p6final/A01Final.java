package p06.lecture.p6final;

public class A01Final {
	
	int a;
	final int b = 4;
	
	A01Final(){
//		this.b = 4;
	}
	
	final static int c = 5;

	public static void main(String[] args) {
		// final 변수(지역변수, 파라미터, 필드)
		// 값을 한 번만 할당 받을 수 있음
		final int i;
		int j;
		j = 3;
		j = 2;
		i = 6;
//		i = 12; // 컴파일 에러

	}

	static void method1(final int i) {
		System.out.println(i);
//		i = 5;  // 컴파일 에러
	}
}
