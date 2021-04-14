package p99.codingbat.Warmup_2;

public class stringSplosion {
	public String stringSplosion(String str) {
		String answer = "";
		for (int i = 0; i <= str.length(); i++) {
			answer += str.substring(0, i);
		}
		return answer;
	}

}
