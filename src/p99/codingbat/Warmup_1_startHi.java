package p99.codingbat;

public class Warmup_1_startHi {
	public boolean startHi(String str) {
		if (str.length() < 2) {
			return false;
		} else if (str.substring(0, 2).equals("hi")) {
			return true;
		}
		return false;

	}

}
