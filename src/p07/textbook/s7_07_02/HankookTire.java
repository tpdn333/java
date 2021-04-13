package p07.textbook.s7_07_02;

public class HankookTire extends Tire {
	// 필드

	// 생성자
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	// 메소드
	@Override
	public boolean roll() {
		++accumulatedRoatation;
		if (accumulatedRoatation < maxRotation) {
			System.out.println(location + " HankookTire 수명: " + (maxRotation - accumulatedRoatation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + " HankookTire 펑크 ***");
			return false;
		}

	}
}
