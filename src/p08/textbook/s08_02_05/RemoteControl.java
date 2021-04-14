package p08.textbook.s08_02_05;

public interface RemoteControl {
	// 상수
	int MAX_VALUE = 10;
	int MIN_VALUE = 0;
	
	// 추상 메소드 ( abstract )
	void trunOn();
	void turnOff();
	void setVolume(int volume);
	
	// 디플토 메소드 ( default)
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	// 정적 메소드 ( static )
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
