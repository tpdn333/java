package p04.textbook.exercise;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) throws Exception {
		boolean run = true;

		int balance = 0;
		int keyCode = 0;
		int input = 0;
		Scanner sc = new Scanner(System.in);

		while (run) {
			if (keyCode != 13 && keyCode != 10) {
				System.out.println("---------------------------------");
				System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
				System.out.println("---------------------------------");
				System.out.print("선택> ");
			}

			keyCode = System.in.read();

			if (keyCode == 49) {
				System.out.print("예금액> ");
				input= sc.nextInt();
				balance += input;
//				System.out.println("예금액> " + balance);
			} else if (keyCode == 50) {
				System.out.print("출금액> ");
				int output = sc.nextInt();
				balance -= output;
//				System.out.println("출금액> " + money);
			} else if (keyCode == 51) {
				System.out.println("잔고> " + balance);
			} else if (keyCode == 52) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
		sc.close();
	}
}
