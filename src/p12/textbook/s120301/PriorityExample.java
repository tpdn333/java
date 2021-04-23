package p12.textbook.s120301;

public class PriorityExample {
	public static void main(String[] args) {
		for (int i = 1; i <= 20; i++) {
			Thread thread = new CalcThread("Thread" + i);
			if (i == 10) {
				thread.setPriority(10);
			} else {
				thread.setPriority(1);
			}
			thread.start();
		}
	}
}
