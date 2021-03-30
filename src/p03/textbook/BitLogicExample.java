package p03.textbook;

public class BitLogicExample {
	public static void main(String[] args) {
		// 45 = 0010 1101
		// 25 = 0001 1001
		System.out.println("45 & 25 = " + (45 & 25)); // 0000 1001
		System.out.println("45 | 25 = " + (45 | 25)); // 0011 1101
		System.out.println("45 ^ 25 = " + (45 ^ 25)); // 0011 0100
		System.out.println("~45 = " + (~45));		  // 1101 0010
	}
}
