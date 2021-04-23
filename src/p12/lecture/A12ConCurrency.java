package p12.lecture;

public class A12ConCurrency {
	static long sharValue = 0;

	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 100_0000; i++) {
					sharValue++;
				}
			}
		});
		t.start();

		for (int i = 0; i < 100_0000; i++) {
			sharValue++;
		}

		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(sharValue);

	}
}
