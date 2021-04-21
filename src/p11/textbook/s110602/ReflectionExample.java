package p11.textbook.s110602;

import java.lang.reflect.*;

public class ReflectionExample {
	public static void main(String[] args) throws Exception {
		Class c1 = Class.forName("p06.textbook.s6_08_01.Calculator");

		System.out.println("[클래스 이름]");
		System.out.println(c1.getName());
		System.out.println();

		System.out.println("[생성자 정보]");
		Constructor[] c2 = c1.getDeclaredConstructors();
		for (Constructor c : c2) {
			System.out.print(c.getName() + "(");
			Class[] p1 = c.getParameterTypes();
			printParameters(p1);
			System.out.println(")");
		}
		System.out.println();
		
		System.out.println("[필드 정보]");
		Field[] f1 = c1.getDeclaredFields();
		for (Field f : f1) {
			System.out.println(f.getType().getSimpleName() + " " + f.getName());
		}
		System.out.println();
		
		System.out.println("[메소드 정보]");
		Method[] m1 = c1.getDeclaredMethods();
		for (Method m : m1) {
			System.out.print(m.getName() + "(");
			Class[] p1 = m.getParameterTypes();
			printParameters(p1);
			System.out.println(")");
		}

	}

	private static void printParameters(Class[] p1) {
		for (int i = 0; i < p1.length; i++) {
			System.out.print(p1[i].getName());
			if (i < (p1.length - 1)) {
				System.out.print(",");
			}
		}

	}

}
