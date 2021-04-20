package p99.Baekjoon;

import java.io.*;
import java.util.Scanner;

public class Step3 {
	// for문
	public static void s2739(String[] args) {
		// 구구단
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		for (int i = 1; i <= 9; i++) {
			System.out.println(N + " * " + i + " = " + N * i);
		}
	}

//	interface Main {
//		static void main(String[] z) throws Exception {
//			int m = 0, n = System.in.read() - 48;
//			while (m++ < 9)
//				System.out.println(n + " * " + m + " = " + n * m);
//		}
//	}
	public static void s10950(String[] args) {
		// A+B -3
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		int[] A = new int[T];
		int[] B = new int[T];
		for (int i = 0; i < T; i++) {
			A[i] = s.nextInt();
			B[i] = s.nextInt();
		}
		for (int i = 0; i < T; i++) {
			System.out.println(A[i] + B[i]);
		}
	}

	public static void s8393(String[] args) {
		// 합
		Scanner s = new Scanner(System.in);
		int result = 0;
		for (int i = s.nextInt(); i > 0; i--) {
			result += i;
		}
		System.out.println(result);
	}
	
	public static void s8393Speed(String[] args) throws IOException{
		// 합
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int result = 0;
		for(int i = 1; i <= T; i++) {
			result += i;
		}
		System.out.println(result);
		
	}
}
