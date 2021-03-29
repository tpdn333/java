package p03.lecture.p2binary.p2compare;

public class A03CompareString {
	public static void main(String[] args) {
		String a = "abcd";
		String b = "abcd";

//		System.out.println(a < b);			// 컴파일 오류
		// String 끼리는 크기 비교 연산 불가능
		// == , != 는 가능
		
		System.out.println(a == b);
		
		String c = "ab";
		String d = "cd";
		String f = c + d;
		System.out.println(a);
		System.out.println(f);
		System.out.println(a == f);			// false
		
		// 문자열이 같은지 확인하는 메소드
		// equals
		System.out.println(a.equals(f));	// true;
	}
}
