package p99.codingbat;

public class Warmup_1_hasTeen {
	public boolean hasTeen(int a, int b, int c) {
		if (a >= 13 && a <= 19) {
			return true;
		} else if (b >= 13 && b <= 19) {
			return true;
		} else if (c >= 13 && c <= 19) {
			return true;
		}
		return false;
//		return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c<=19);
	}

}
