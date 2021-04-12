package p07.textbook.s7_04_01;

public class ComputerExample {
	public static void main(String[] args) {
		int r = 10;

		Calculator c1 = new Calculator();
		System.out.println("원면적 : " + c1.areaCircle(r));
		System.out.println();

		Computer c2 = new Computer();
		System.out.println("원면적 : " + c2.areaCircle(r));
	}
}
