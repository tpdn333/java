package p04.lecture;

import java.util.Scanner;

public class A06IfSample {
	public static void main(String[] args) {
		int dice = (int) (Math.random() * 6) + 1;
		System.out.println("주사위의 수를 맞춰보세요>");
		Scanner scan1 = new Scanner(System.in);
		int user = scan1.nextInt();
		
		if(user==dice) {
			System.out.println("맞췄습니다.");
		} else {
			System.out.println("다시 시대해주세요");
			System.out.println("주사위의 수는 "+ dice + "입니다.");
		}
			
	}
}
