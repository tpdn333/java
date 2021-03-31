package p04.textbook;

public class ForMultiplicationTableExample {
	public static void main(String[] args) {
//		for (int m = 2; m <= 9; m++) {
//			System.out.println("*** " + m + "단 ***");
//			for (int n = 1; n < 10; n++) {
//				System.out.println(m + " X " + n + " = " + m * n);
//			}
//		}

		// 2단 ~ 9단 짝수단
//		for (int i = 2; i < 10; i += 2) {
//			System.out.println("*** " + i + "단 ***");
//			for (int k = 1; k <= 9; k++) {
//				System.out.println(i + " X " + k + " = " + i * k);
//			}
//		}
		// 2단~ 9단 *짝수
		for (int i = 2; i < 10; i++) {
			System.out.println("*** " + i + "단 ***");
			for (int k = 2; k < 9; k += 2) {
				System.out.println(i + " X " + k + " = " + i * k);
			}
		}
		// 9단 ~ 2단
//		for (int i = 9; i > 1; i --) {
//			System.out.println("*** " + i + "단 ***");
//			for (int k = 1; k <= 9; k++) {
//				System.out.println(i + " X " + k + " = " + i * k);
//			}
//		}
		// 9단 ~ 2단
//		for (int i = 9; i > 1; i --) {
//			System.out.println("*** " + i + "단 ***");
//			for (int k = 9; k > 0; k--) {
//				System.out.println(i + " X " + k + " = " + i * k);
//			}
//		}
	}
}
