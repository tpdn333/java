package p07.textbook.s7_07_01;

public class ChildExample {
	public static void main(String[] args) {
		Child c1 = new Child();
		
		Parent p1 = c1;
		p1.method1();
		p1.method2();
//		p1.method3();	// 호출 불가능
	}
}
