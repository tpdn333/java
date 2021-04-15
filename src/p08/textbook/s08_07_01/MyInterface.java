package p08.textbook.s08_07_01;

public interface MyInterface {
	public void method1();
	public default void method2() {
		System.out.println("myinterface-method2");
	}
}
