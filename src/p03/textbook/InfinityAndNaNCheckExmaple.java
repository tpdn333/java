package p03.textbook;

public class InfinityAndNaNCheckExmaple {
	public static void main(String[] args) {

		int x = 5;
		double y = 0.0;

		double z = x / y;	// 큰타입인 double 타입으로 전환
		// double z = x % y;	// NaN

		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));

		System.out.println(z + 2);
	}
}
