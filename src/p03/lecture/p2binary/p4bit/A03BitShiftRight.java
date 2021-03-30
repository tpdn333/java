package p03.lecture.p2binary.p4bit;

public class A03BitShiftRight {
	public static void main(String[] args) {
		// >> : 왼쪽을 부호비트로 채움
		// >>> : 왼쪽을 0으로 채움

		// 1111 1111 1111 1111 1111 1111 1110 0100
		int a = -28;

		// a >> 1
		// 1111 1111 1111 1111 1111 1111 1111 0010 / 0 떨어져나감
		System.out.println(a >> 1);
		
		// a >>> 1
		// 0111 1111 1111 1111 1111 1111 1111 0010 / 0 떨어져나가고 왼쪽은 0으로 채움
		System.out.println(a >>> 1);
	}	
}
