package p99.codingbat;

public class Warmup_1_missingChar {
	public String missingChar(String str, int n) {
		  return str.substring(0,n) + str.substring(n+1);
		}
}
