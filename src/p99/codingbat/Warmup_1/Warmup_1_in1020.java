package p99.codingbat;

public class Warmup_1_in1020 {
	public boolean in1020(int a, int b) {
//		  return ( a >= 10 && a <= 20 ) || ( b >= 10 && b <= 20 );
		if ( a >= 10 && a <= 20) {
			return true;
		}
		if ( b >= 10 && b <= 20) {
			return true;
		}
		return false;
		}
}
