package p12.textbook.exercise.ex02;

public class ThreadExample {
	public static void main(String[] args) {
		Thread t1 = new MovieThread();
		t1.start();
		
		Thread t2 = new Thread(new MusicRunnable());
		t2.start();
				
	}
}
