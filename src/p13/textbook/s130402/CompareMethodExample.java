package p13.textbook.s130402;

public class CompareMethodExample {
	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<>(1, "사과");
		Pair<Integer, String> p2 = new Pair<>(1, "사과");
		boolean result1 = Util.<Integer, String>compare(p1, p2);
		if (result1) {
			System.out.println("논리적으로 동등한 객체입니다.");
			System.out.println(p1.getKey() + " == " + p2.getKey());
			System.out.println(p1.getValue() + " == " + p2.getValue());
		} else {
			System.out.println("논리적으로 동등하지 않은 객체입니다.");
		}

		Pair<String, String> p3 = new Pair<>("user1", "홍길동");
		Pair<String, String> p4 = new Pair<>("user2", "홍길동");

		boolean result2 = Util.<String, String>compare(p3, p4);
		if (result2) {
			System.out.println("논리적으로 동등한 객체입니다.");
			System.out.println(p3.getKey() + " == " + p4.getKey());
			System.out.println(p3.getValue() + " == " + p4.getValue());
		} else {
			System.out.println("논리적으로 동등하지 않은 객체입니다.");

		}
	}
}
