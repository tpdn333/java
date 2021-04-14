package p08.textbook.s08_04_02;

import p08.textbook.s08_02_05.RemoteControl;

public class Audio implements RemoteControl {
	private int volume;
	private boolean mute;

	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VALUE) {
			this.volume = RemoteControl.MAX_VALUE;
		} else if (volume < RemoteControl.MIN_VALUE) {
			this.volume = RemoteControl.MIN_VALUE;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨: " + this.volume);
	}

	@Override
	public void setMute(boolean mute) {  // dafault 메소드를 재정의
		this.mute = mute;
		if (mute) {
			System.out.println("Audio를 무음 처리합니다.");
		} else {
			System.out.println("Audio를 무음 해제합니다.");
		}
	}

}
