package p06.lecture.p4method;

import java.util.Arrays;

public class MyClass7 {
	void method1(int i) {
		System.out.println("method1");
	}

	void method2(int i, int j) {
		System.out.println("method2");

	}

	// varargs 여러개의 인트인 파라미터를 받겠다.
	// 배열로 사용됨.
	void method3(int... i) {
		System.out.println("method3");
		System.out.println(i.length);
		System.out.println(Arrays.toString(i));
	}
	// varargs를 쓰려면 맨뒤에 위치해야됨
	void method4(double b, int... i) {
		System.out.println("method4");
	}
}
