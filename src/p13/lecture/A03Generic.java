package p13.lecture;

public class A03Generic {
	// Generic이 있던 시절
	public static void main(String[] args) {
		Generic3<String> g3 = new Generic3<>();
		// T가 String이 됨.
		g3.setO("java");
		String s = g3.getO();
		// 형 변환이 필요없음.
		System.out.println(s);
		
		Generic3<Integer> g4 = new Generic3<>();
		// T가 Integer가 됨.
//		g4.setO("java"); // Integer는 String이 아니다
		g4.setO(2071);
		int i = g4.getO(); // auto unboxing
		System.out.println(i);
		
		Generic3<Double> g5 = new Generic3<>();
		// T가 Double이 됨
		g5.setO(3.14);
		double d = g5.getO();
		System.out.println(d);
				
	}
}

class Generic3<T> {
	// 타입이 사용될 때 결정됨
	private T o;

	public T getO() {
		return o;
	}

	public void setO(T o) {
		this.o = o;
	}
}
