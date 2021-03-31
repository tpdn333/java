package p04.lecture;

import java.util.Scanner;

public class A12ForPrimeNumber {
	public static void main(String[] args) {
		// 소수 (prime number): 약수가 1과 자기자신
		// ex) 2, 3, 5, 7, 11, 13

		Scanner sc = new Scanner(System.in);

		System.out.println("입력한 수>");
		int number = sc.nextInt();
//		System.out.println(number);

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				System.out.println("소수가 아닙니다.");
				sc.close();		// Line 10에서 열었으니 닫아줘야된다.
				return;
			}
		}
		System.out.println(number + "는 소수 입니다.");
		
		sc.close();

	}

}
