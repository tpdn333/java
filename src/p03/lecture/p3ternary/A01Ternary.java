package p03.lecture.p3ternary;

public class A01Ternary {
	public static void main(String[] args) {
		// 1항 ? 2항 : 3항
		// 결과는 1항이 true이면 2항 
		// 				false이면 3항
		boolean a = true;
		System.out.println(a ? 3 : 4);
		System.out.println(!a ? 3 : 4);
		
		int b = 5;
		String s = b > 0 ? "양수" : "음수 또는 0";
		System.out.println(s);
	}
}
