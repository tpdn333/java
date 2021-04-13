package p07.textbook.s7_07_02;

public class KumhoTire extends Tire {
	// 필드

	// 생성자
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	// 메소드
	@Override
	public boolean roll() {
		++accumulatedRoatation;
		if (accumulatedRoatation < maxRotation) {
			System.out.println(location + " KumhoTire 수명: " + (maxRotation - accumulatedRoatation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " KumhoTire 펑크 ***");
			return false;
		}

	}
}
