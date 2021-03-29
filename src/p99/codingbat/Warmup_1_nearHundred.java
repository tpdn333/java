package p99.codingbat;

public class Warmup_1_nearHundred {
	public boolean nearHundred(int n) {
		if (Math.abs(n - 100) <= 10) {
			return true;
		} else if (Math.abs(n - 200) <= 10) {
			return true;
		}
		return false;
	}
}
