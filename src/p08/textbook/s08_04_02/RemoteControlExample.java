package p08.textbook.s08_04_02;

import p08.textbook.s08_02_05.RemoteControl;
import p08.textbook.s08_03_01.Television;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.setMute(true);
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);
		
		
	}
}
