package p99.codingbat;

public class Warmup_1_posNeg {
	public boolean posNeg(int a, int b, boolean negative) {
		if (negative) {
			return (a < 0 && b < 0);
		} else {
			return (a < 0 && b > 0) || (a > 0 && b < 0);
		}
	}

}
