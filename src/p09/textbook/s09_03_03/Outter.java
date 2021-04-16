package p09.textbook.s09_03_03;

public class Outter {
	// 자바7 이전
	public void method1(final int arg) {
		final int localVar = 1;
		// arg = 100;
		// localVar = 100;
		class Inner {
			public void method() {
				int result = arg + localVar;
			}
		}
	}

	// 자바8 이후
	public void method2(int arg) {
		int localVar = 1;
		// arg = 100;
		// localVar = 100;
		class Inner {
			public void method() {
				int result = arg + localVar;
			}
		}
	}
}
