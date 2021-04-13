package p07.textbook.s7_07_02;

public class Tire {
	// 필드
	public int maxRotation;				// 최대 회전수
	public int accumulatedRoatation;	// 누적 회전수
	public String location;				// 타이어의 위치
	
	// 생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	// 메소드
	public boolean roll() {				// 누적 회전수 1증가
		++accumulatedRoatation;
		if(accumulatedRoatation < maxRotation) {
			System.out.println(location + " Tire 수명: " + (maxRotation-accumulatedRoatation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + "Tire 펑크 ***");
			return false;
		}
	}
}
