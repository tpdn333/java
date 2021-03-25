package p02.lecture;

public class A03TypeByte {
	public static void main(String[] args) {
		// byte : 1byte 크기의 정수를 저장할 수 있음.
		// byte == 8bit (0000 0000 ~ 1111 1111)
		// 10진법 0 == 0000 0000
		// 10진법 1 == 0000 0001
		// 10진법 2 == 0000 0010
		// 10진법 3 == 0000 0011
		//         :
		//   -128 == 1000 0000 // 맨 왼쪽비트가 1이면 음수
		//   -127 == 1000 0001
		//         :
		//     -1 == 1111 1111
		//      0 == 0000 0000
		// 최소값: -128
		// 최대값: 127
		
		byte byteVar;
		byteVar = -128;
		byteVar = 127;
//		byteVar = -129; // X
//		byteVar = 128;  // X
		
	}         
}
