package p99.Baekjoon;

import java.util.Scanner;

public class Step2 {
	// If문
	public static void s1330(String[] args) {
		Scanner s = new Scanner(System.in);
		int A = s.nextInt(), B = s.nextInt();
		System.out.println((A > B) ? ">" : (A < B) ? "<" : "==");
		s.close();
	}

	public static void s9498(String[] args) {
		Scanner s = new Scanner(System.in);
		int A = s.nextInt();
		System.out.println((A >= 90 && A <= 100) ? "A"
				: (A >= 80 && A < 90) ? "B" : (A >= 70 && A < 80) ? "C" : (A >= 60 && A < 70) ? "D" : "F");
//		if (A <= 100 && A >= 90) {
//			System.out.println("A");
//		} else if (A < 90 && A >= 80) {
//			System.out.println("B");
//		} else if (A < 80 && A >= 70) {
//			System.out.println("C");
//		} else if (A < 70 && A >= 60) {
//			System.out.println("D");
//		} else {
//			System.out.println("F");
//		}
	}

	public static void s2753(String[] args) {
		// 윤년
		Scanner s = new Scanner(System.in);
		int year = s.nextInt();
		if (year % 4 == 0) {
			if (year % 100 != 0 || year % 400 == 0) {
				System.out.println("1");
			} else
				System.out.println("0");
		} else {
			System.out.println("0");
		}
	}

	public static void s14681(String[] args) {
		// 사분면 고르기
		Scanner s = new Scanner(System.in);
		int X = s.nextInt(), Y = s.nextInt();
		if (X > 0) {
			if (Y > 0) {
				System.out.println("1");
			} else
				System.out.println("4");
		} else if (X < 0) {
			if (Y > 0) {
				System.out.println("2");
			} else
				System.out.println("3");

		}
	}

	public static void s2884(String[] args) {
		// 알람 시계
		Scanner s = new Scanner(System.in);
		int H = s.nextInt(), M = s.nextInt();
		if (M < 45) {
			H--;
			M = 60 - (45 - M);
			if (H < 0) {
				H = 23;
			}
			System.out.println(H + " " + M);
		} else
			System.out.println(H + " " + (M - 45));
	}

}
