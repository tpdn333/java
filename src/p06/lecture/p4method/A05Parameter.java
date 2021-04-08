package p06.lecture.p4method;

import java.util.Arrays;

public class A05Parameter {
	public static void main(String[] args) {
		MyClass5 o1 = new MyClass5();
		o1.method1();
		o1.method2(2);

		int x = 5;
		int y = 7;
		o1.method3(x, y);
		o1.method3(10, 20);

		int[] arr1 = { 1, 2, 3 };
		o1.method4(arr1);
		System.out.println("arr1[0] : " + arr1[0]);
		System.out.println(Arrays.toString(arr1));
	}
}
