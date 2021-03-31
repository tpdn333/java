package p04.lecture;

public class A14Break {
	public static void main(String[] args) {
		// break : 가장 가까운 loog (for, while, switch) 종료

		for (int i = 0; i < 10; i++) {
			System.out.println(i);

			if (i == 3) {
				break;
			}
		}
		System.out.println("다음 실행 흐름....");
	}
}
