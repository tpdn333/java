package p07.textbook.s7_08_03;

public class PhoneExample {
	public static void main(String[] args) {
//		Phone p1 = new Phone();
		
		SmartPhone sP1 = new SmartPhone("홍길동");
		
		sP1.turnOn();
		sP1.internetSearch();
		sP1.turnOff();
	}	
}
