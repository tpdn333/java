package p06.lecture.p9encapsulation;

public class Computer {
	String cpu;
	private int ram;
	
	
	public void setRam(int ram) {
		if (ram < 1) {
			System.out.println("0은 입력할 수 없습니다.");
		} else {
			this.ram = ram;
		}
	}
	
	public int getRam() {
		return this.ram;
	}
}
