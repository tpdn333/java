package p08.textbook.s08_03_02;

import p08.textbook.s08_02_05.RemoteControl;

public class RemoteControlExample {
	public static void main(String[] args) {
		// interface로는 인스턴스를 만들수 없는데 
		// 익명 클래스를 만들어줘서 생성해줌
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void turnOn() {
				
			}
			
			@Override
			public void turnOff() {
				
			}
			
			@Override
			public void setVolume(int volume) {
				
			}
		};
		rc.setMute(false);
	}
}
