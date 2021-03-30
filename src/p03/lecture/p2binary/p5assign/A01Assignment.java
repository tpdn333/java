package p03.lecture.p2binary.p5assign;

public class A01Assignment {
	public static void main(String[] args) {
		// = : 오른쪽 값을 왼쪽에 할당(대입)

		int a = 3;
		System.out.println(a);
		// += : 양변을 더한 후 왼쪽에 할당
		System.out.println(a += 5);

		String s = "java";
		System.out.println(s);
		s += "script";
		System.out.println(s);
		
		// *= : 양변을 곱한 후 왼쪽에 할당
		System.out.println(a *= 6);
		
		// /= : 왼쪽값을 오른쪽으로 나눈 값을 왼쪽에 할당
		System.out.println(a /= 3);
		
		// %= : 왼쪽값을 오른쪽으로 나눈 나머지값을 왼쪽에 할당
		System.out.println(a %= 5);
	}
}
