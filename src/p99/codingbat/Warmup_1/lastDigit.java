package p99.codingbat.Warmup_1;

public class lastDigit {
	public boolean lastDigit(int a, int b) {
		int digit1 = a % 10;
		int digit2 = b % 10;
		return (digit1 == digit2);
	}

}
