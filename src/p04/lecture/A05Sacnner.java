package p04.lecture;

import java.util.Scanner;

public class A05Sacnner {
	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("입력>");
		String str = scan1.nextLine();  // String 입력
		
		System.out.println("출력>");
		System.out.println(str);
		
		System.out.println("수 입력>");
		int num = scan1.nextInt();
		System.out.println("출력>");
		System.out.println(num);
	}
}
