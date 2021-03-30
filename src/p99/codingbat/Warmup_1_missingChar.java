package p99.codingbat;

public class Warmup_1_missingChar {
	public static void main(String[] args) {
		String str = "kitten";
		String answer = "";
		
		int n = 1;
		answer = str.substring(n-1,n);
		System.out.println(answer);
	}
}
