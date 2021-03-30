package p03.textbook;

public class BitShiftExample {
	public static void main(String[] args) {
		// 1 : 0000 0001
		// -8 : 1111 1000
		System.out.println("1 << 3 = " + (1 << 3));
		// 0000 1000
		
		System.out.println("-8 >> 3 = " + (-8 >> 3));
		// 1111 1111
		
		System.out.println("-8 >>> 3 = " + (-8 >>> 3));
		// 0001 1111
	}
}
