package p99.codingbat.Warmup_1;

public class everyNth {
	public String everyNth(String str, int n) {
		String answer = "";
		for (int i = 0; i < str.length(); i += n) {
			answer += str.charAt(i);
		}
		return answer;
	}

}
