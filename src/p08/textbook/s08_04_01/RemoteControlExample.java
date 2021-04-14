package p08.textbook.s08_04_01;

import p08.textbook.s08_02_05.RemoteControl;
import p08.textbook.s08_03_01.Audio;
import p08.textbook.s08_03_01.Television;
import p08.textbook.s08_03_03.Searchable;
import p08.textbook.s08_03_03.SmartTelevision;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		
		rc = new SmartTelevision();
		rc.turnOn();
		rc.turnOff();
		
		Searchable s1 = new SmartTelevision();
		s1.search("daum");
		
		System.out.println(rc instanceof RemoteControl);
		System.out.println(rc instanceof SmartTelevision);
		System.out.println(rc instanceof Searchable);
	}
}
