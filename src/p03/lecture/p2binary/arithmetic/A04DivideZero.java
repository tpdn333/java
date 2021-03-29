package p03.lecture.p2binary.arithmetic;

public class A04DivideZero {
	public static void main(String[] args) {
		int a = 3;
		int b = 0;

//		int c = a / b;		// 0으로 나누지못함 / error나서 코드 진행이 안됨
		// ArithmeticExeption 발생
//		System.out.println(c);

		// 실수는 0으로 나누면 무한대
		double x = 3.0;
		double y = -0.0;

		double z = x / y;
		System.out.println(z);

		double w = z - 3.15;
		System.out.println(w);
		
		// 실수의 0으로 나눈 나머지는 NaN(Not a Number)
		double e = 0.5;
		double f = 0.0;
		double g = e % f; //NaN
		System.out.println(g);
		
		double h = g + 3.14;
		System.out.println(h);
	}
}
