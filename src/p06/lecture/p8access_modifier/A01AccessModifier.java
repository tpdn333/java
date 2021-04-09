package p06.lecture.p8access_modifier;

import p06.lecture.p8access_modifier.package1.MyClass1;

public class A01AccessModifier {
	public static void main(String[] args) {
		MyClass1 o1 = new MyClass1();
		
		System.out.println(o1.publicValue);
//		System.out.println(o1.privateValue);  // 접근 불가능
//		System.out.println(o1.defaultValue);  // 접근 불가능
	}
}
