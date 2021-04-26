package p13.lecture;

public class A05GenericMethod {
	public static void main(String[] args) {
		MyClass5 o5 = new MyClass5();
		o5.<String>method1();
		o5.<String>method2("java");
		o5.method2("spring");

		o5.<String>method3();

	}
}

class MyClass5 {
	public <T> void method1() {

	}

	public <T> void method2(T param) {

	}

	public <T> T method3() {
		return null;
	}
}
