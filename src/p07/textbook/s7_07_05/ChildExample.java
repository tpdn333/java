package p07.textbook.s7_07_05;

public class ChildExample {
	public static void main(String[] args) {
		Parent p1 = new Child();
		p1.field1 = "data1";
		p1.method1();
		p1.method2();
		
		// 불가능
//		p1.field2 = "data2";
//		p1.method3();
		
		Child c1 = (Child) p1;
		c1.field2 = "yyy";
		c1.method3();
	}
}
