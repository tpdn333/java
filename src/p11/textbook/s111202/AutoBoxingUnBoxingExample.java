package p11.textbook.s111202;

public class AutoBoxingUnBoxingExample {
	public static void main(String[] args) {
		// Auto Boxing
		Integer obj = 100;
		System.out.println("value: " + obj.intValue());

		// 대입 시 자동 UnBoxing
		int value = obj;
		System.out.println("value: " + value);

		// 연산 시 자동 UnBoxing
		int result = obj + 100;
		System.out.println("result: " + result);
	}

}