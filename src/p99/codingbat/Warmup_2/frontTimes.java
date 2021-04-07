package p99.codingbat.Warmup_2;

public class frontTimes {
	public String frontTimes(String str, int n) {
		String res = "";
		if (str.length() < 3) {
			for (int i = 0; i < n; i++) {
				res += str;
			}
		} else {
			for (int k = 0; k < n; k++) {
				res += str.substring(0, 3);
			}
		}
		return res;
	}

}
