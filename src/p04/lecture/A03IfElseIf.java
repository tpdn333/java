package p04.lecture;

public class A03IfElseIf {
	public static void main(String[] args) {
		// else if : if (또는 else if)의 조건의 false일때
		// 새로운 조건을 확인하여 실행

		int a = 50;
		System.out.println("실행1");

		if (a > 100) {
			System.out.println("실행2");
		} else if (a > 0) {
			System.out.println("실행3");
		} else if (a > -50) {
			System.out.println("실행3.1");
		}
		System.out.println("실행4");
	}
}
