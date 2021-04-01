package p04.textbook.exercise;

public class Exercise04 {
	public static void main(String[] args) {
		boolean run = true;
		int num1 = 0;
		int num2 = 0;
		while (run) {
			num1 = (int) (Math.random() * 6) + 1;
			num2 = (int) (Math.random() * 6) + 1;
			System.out.println("(" + num1 + ", " + num2 + ")");
			if (num1 + num2 == 5) {
				run = false;
			}
		}
	}
}
