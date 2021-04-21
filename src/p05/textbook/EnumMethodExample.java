package p05.textbook;

public class EnumMethodExample {
	public static void main(String[] args) {
		// name() 메소드
		Week today = Week.MONDAY;
		String name = today.name();
		System.out.println(name);

		// ordinal() 메소드
		// Enum 위치값 0부터 시작
		int ordinal = today.ordinal();
		System.out.println(ordinal);

		// compareTO() 메소드
		// ordinal값 빼기
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);

		// valueOf() 메소드

		String strDay = "SUNDAY";
		Week wD = Week.valueOf(strDay);
		if (wD == Week.SATURDAY || wD == Week.SUNDAY) {
			System.out.println("주말이군요");
		} else {
			System.out.println("평일이군요");
		}

		// valuse() 메소드
		Week[] days = Week.values();
		for (Week day : days) {
			System.out.println(day);
		}

	}
}
