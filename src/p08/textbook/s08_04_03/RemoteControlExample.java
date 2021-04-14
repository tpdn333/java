package p08.textbook.s08_04_03;

import p08.textbook.s08_02_05.RemoteControl;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl.changeBattery();
		System.out.println(RemoteControl.MAX_VALUE);
		System.out.println(RemoteControl.MIN_VALUE);
	}
}
