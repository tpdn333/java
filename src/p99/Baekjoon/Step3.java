package p99.Baekjoon;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

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

	public static void s8393Speed(String[] args) throws IOException {
		// 합
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int result = 0;
		for (int i = 1; i <= T; i++) {
			result += i;
		}
		System.out.println(result);

	}

	public static void s15552(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		int[] arr = new int[T];

		StringTokenizer st;
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int sum = A + B;

			bw.write(sum + "\n");
		}
		bw.flush();
		br.close();
		bw.close();
	}

	public static void s2741(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int N = s1.nextInt();
		for (int i = 1; i <= N; i++) {
			System.out.println(i);
		}
	}

	public static void s2742(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int N = s1.nextInt();
		for (int i = N; i > 0; i--) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		// A+B -7
		Scanner s = new Scanner(System.in);
		int T = s.nextInt();
		int[] A = new int[T];
		int[] B = new int[T];
		for (int i = 0; i < T; i++) {
			A[i] = s.nextInt();
			B[i] = s.nextInt();
		}
		for (int i = 0; i < T; i++) {
			System.out.println("Case #" + (i + 1) + ": " + (A[i] + B[i]));
		}
	}

}
