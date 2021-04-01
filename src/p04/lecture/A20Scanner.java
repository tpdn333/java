package p04.lecture;

import java.util.Scanner;

public class A20Scanner {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Scanner sc = new Scanner(System.in);
		
		// 스페이스, 엔터 = token
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//
		String d = sc.next();
		
		// 직전 token부터 엔터까지
		String c = sc.nextLine();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
		System.out.println(c);
		
		
		sc.close();
		System.out.println("프로그램 종료");
	}
}

