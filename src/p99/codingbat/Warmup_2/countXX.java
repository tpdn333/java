package p99.codingbat.Warmup_2;

public class countXX {
	int countXX(String str) {
		int cnt = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.substring(i, i + 2).equals("xx")) {
				cnt++;
			}
		}
		return cnt;
	}

}
