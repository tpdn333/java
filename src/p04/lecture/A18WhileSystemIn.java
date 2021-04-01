package p04.lecture;

public class A18WhileSystenIn {
	public static void main(String[] args) throws Exception{
		// System.in : 키보드
		
		// System.in.read() : 키보드 키를 int로 리턴
		
		while(true) {
			int ket = System.in.read();
			System.out.println(ket);
		}
	}
}
