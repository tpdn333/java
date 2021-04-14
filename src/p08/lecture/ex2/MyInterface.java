package p08.lecture.ex2;

public interface MyInterface {
	// public static final 필드
	public static final int MY_FIELD1 = 1;
	int MY_FIELD2 = 2;
	String MY_FIELD = "hello";
	// 생성자 X

	// public abstract 메소드 (인스턴스 메소드)
	public abstract void method1();
	void method2(); // public abstract 생략 가능
	

	// public static 메소드 ( 클래스 메소드)
	static void staticMethod1() { 		// public 생략 가능
		System.out.println("Interface method1()");
	}

	// public default 메소드 (인스턴스 메소드)
	public default void defaultMethod1() {
		System.out.println("defaultMethod1()");
	}
	
	default void defaultMethod2() {		// public 생략 가능
		System.out.println("defaultMethod2()");
	}

}
