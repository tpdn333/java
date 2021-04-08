package p06.lecture.p5static;

public class MyClass3 {
	int i;
	static int j;
	static void method1() {
		System.out.println("method1()");
		method3();
//		this.method3(); // static 맴버는 안됨
		// static 맴버에서 instance맴버는 겁근 불가능
//		method4(); 
//		System.out.println(i);
		System.out.println(j);
	}
	
	static void method3() {
		System.out.println("method3()");
	}
	
	void method2() {
		System.out.println("metdho2()");
		this.method4();
		
		// instance 맴버는 static 맴버에 접근가능
		method3();
	}
	
	void method4() {
		System.out.println("method4()");
	}
}
