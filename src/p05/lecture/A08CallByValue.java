package p05.lecture;

public class A08CallByValue {
	public static void main(String[] args) {
		int i = 3;
		int j = 4;
		method1(i);
		method1(j);
		
		String s = "java";
		String y = new String("java");
		System.out.println(System.identityHashCode(s));
		method2(s);
		method2(y);
	}
	public static void method1 (int a) {
		System.out.println(a);
		
	}
	public static void method2(String s) {
		System.out.println(s);
		System.out.println(System.identityHashCode(s));
	}
}
