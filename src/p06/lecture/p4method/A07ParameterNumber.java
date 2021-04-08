package p06.lecture.p4method;

public class A07ParameterNumber {
	public static void main(String[] args) {
		MyClass7 o1 = new MyClass7();
		o1.method1(4);
		
		o1.method2(2, 3);
		
		o1.method3();
		o1.method3(1);
		o1.method3(3,4);
		o1.method3(3,4,5);
	}
}
