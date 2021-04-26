package p13.textbook.s130501;

public class BoundedTypeParameterExample {
	public static void main(String[] args) {
//		String str = Util.compare("a", "b");
		// string은 number타입이 아님

		int result1 = Util.compare(10, 20);
		// int -> Integer로 auto Boxing
		System.out.println(result1);

		int result2 = Util.compare(4.5, 3);
		// doulbe -> Double로 auto Boxing
		System.out.println(result2);
	}
}
