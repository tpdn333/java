package p04.lecture;

import java.util.Scanner;

public class A13ForGCD {
	public static void main(String[] args) {
		// 최대공약수 : greatest common divisor

		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하세요");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
//		
//		 유클리드 호제법
//		int temp;
//		while (num2 != 0) {
//			temp = num1 % num2;
//			num1 = num2;
//			num2 = temp;
//		}
//		System.out.printf("최대 공약수는 %d 입니다.\n", num1);
//		System.out.println("최대 공약수는 " + num1 + " 입니다.");
		
		for (int d = num1; d >= 1; d--) {
			if ((num1 % d == 0) && (num2 % d == 0)) {
				System.out.printf("최대 공약수는 %d 입니다.\n", d);
				sc.close();
				return;
			}
		}

		sc.close();
	}
}
