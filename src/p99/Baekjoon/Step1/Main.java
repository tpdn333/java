package p99.Baekjoon.Step1;

import java.util.Scanner;

public class Main {
	public static void s2557(String[] args) {
		// Hellow World!
		System.out.println("Hello World!");
	}

	public static void s10718(String[] args) {
		// We love Kriii
		System.out.println("강한친구 대한육군");
		System.out.println("강한친구 대한육군");
	}

	public static void s10171(String[] args) {
		// 고양이
		/*
		 * \ /\ ) ( ') ( / ) \(__)|
		 */
		System.out.println("\\    /\\");
		System.out.println(" )  ( ')");
		System.out.println("(  /  )");
		System.out.println(" \\(__)|");
	}

	public static void s10172(String[] args) {
		// 개
		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("|\"^\"`    |");
		System.out.println("||_/=\\\\__|");
	}

	public static void s1000(String[] args) {
		// A + B
		Scanner s1 = new Scanner(System.in);
		int A = s1.nextInt();
		int B = s1.nextInt();
		System.out.println(A + B);
	}

	public static void s1001(String[] args) {
		// A - B
		Scanner s1 = new Scanner(System.in);
		System.out.println(s1.nextInt() - s1.nextInt());
	}

	public static void s10998(String[] args) {
		// A X B
		Scanner s1 = new Scanner(System.in);
		System.out.println(s1.nextInt() * s1.nextInt());
	}

	public static void s1008(String[] args) {
		// A / B
		Scanner s1 = new Scanner(System.in);
		System.out.println((double) s1.nextInt() / s1.nextInt());
	}

	public static void s10869(String[] args) {
		// 사칙연산
		Scanner s1 = new Scanner(System.in);
		int A = s1.nextInt();
		int B = s1.nextInt();
		System.out.println(A + B);
		System.out.println(A - B);
		System.out.println(A * B);
		System.out.println(A / B);
		System.out.println(A % B);
	}

	public static void s10430(String[] args) {
		// 나머지
		Scanner s1 = new Scanner(System.in);
		int A = s1.nextInt();
		int B = s1.nextInt();
		int C = s1.nextInt();
		System.out.println((A + B) % C);
		System.out.println(((A % C) + (B % C)) % C);
		System.out.println((A * B) % C);
		System.out.println(((A % C) * (B % C)) % C);
	}

	public static void s2588(String[] args) {
		// 곱셈
		Scanner s1 = new Scanner(System.in);
		int A = s1.nextInt(), B = s1.nextInt();
		System.out.println(A * (B % 10));
		System.out.println(A * ((B / 10) % 10));
		System.out.println(A * (B / 100));
		System.out.println(A * B);
	}
}
