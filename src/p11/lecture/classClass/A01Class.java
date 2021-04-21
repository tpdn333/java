package p11.lecture.classClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class A01Class {
	public static void main(String[] args) throws Exception {
		MyClass o1 = new MyClass();
		
		Class c1 = Class.forName("p11.lecture.classClass.MyClass");
		
		System.out.println(c1.getName());
		Field[] fields = c1.getDeclaredFields();
		System.out.println(fields[0]);
		System.out.println(fields[1]);
		System.out.println(fields.length);
		
		Constructor[] constructor = c1.getDeclaredConstructors();
		
		System.out.println(constructor.length);
		
		Method[] method = c1.getDeclaredMethods();
		System.out.println(method.length);
		System.out.println(method[0]);
		
		
	}
}

class MyClass {
	private int field1;
	private int field2;

	MyClass() {

	}

	MyClass(int param1) {

	}

	public void method1() {

	}

	public void method2() {

	}

}
