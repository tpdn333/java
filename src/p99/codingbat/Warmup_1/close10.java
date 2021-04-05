package p99.codingbat.Warmup_1;

public class close10 {
	public int close10(int a, int b) {
		int close = 0;
		if (Math.abs(10 - a) > Math.abs(10 - b)) {
			close = b;
		} else if (Math.abs(10 - a) < Math.abs(10 - b)) {
			close = a;
		} else
			close = 0;

		return close;
	}

}
