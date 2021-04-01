package p04.lecture;

public class A19DoWhile {
	public static void main(String[] args) {

		boolean a = false;
		while (a) {
			System.out.println("while code block");
		}
		do {
			System.out.println("do while code block");
		} while (a);
		System.out.println("프로그램 종료...");

	}
}
