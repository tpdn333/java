package p13.lecture;

public class A01Generic {
	// 타입파라미터를 가진 타입
	// 작성 규칙 : 대문자 1개
	// T : Type
	// N : Number
	// V : Value
	// K : Key
	// .....
	public static void main(String[] args) {
		GenericType1<Object> g1 = new GenericType1<Object>();
		GenericType1<String> g2 = new GenericType1<String>();
		GenericType1<Number> g3 = new GenericType1<>();
		// 뒤에 타입이 앞타입과 같으면 편이상 생략 가능

	}
}

class GenericType1<T> {

}

interface GenericTypeInterface1<T, S, U> {

}
