package p03.lecture.p2binary.p3logical;

public class A01Logical {
	public static void main(String[] args) {
		// and : &&, &
		// or : ||, |
		// xor : ^ (배타적 논리
		// not : !

		// and
		// 연산의 결과 boolean
		// 양변이 모두 true일때만 true, 나머지 모두 false
		System.out.println("========= AND =========");
		System.out.println(true && true); // true
		System.out.println(true && false); // false
		System.out.println(false && true); // false / short circuit
		System.out.println(false && false); // false / short circuit
		System.out.println();

		System.out.println(true & true); // true
		System.out.println(true & false); // false
		System.out.println(false & true); // false
		System.out.println(false & false); // false
		System.out.println();

		// short circuit (짧은 길)
		int i = 3;
		System.out.println("==== short circuit ====");
		System.out.println(true && (i++) > 0); // true
		System.out.println(i);
		System.out.println();
		
		System.out.println(false && (i++) > 0); // false / short circuit
		// and 연산자는 false면 무조건 fasle니깐 뒤코드를 실행안한다.
		// 그래서 i++ 계산이 안이뤄진다
		System.out.println(i);  // i = 4;
		System.out.println();
		
		System.out.println(false & (i++) > 0);
		// &가 하나면 짧은길로 안간다.
		System.out.println(i); // i = 5;
		System.out.println();
		
		// or
		// 양변이 false일때만 fasle이고 나머지 모두 true
		System.out.println("========= OR =========");
		System.out.println(true || true); // true / short circuit
		System.out.println(true || false); // true / short circuit
		System.out.println(false || true); // true
		System.out.println(false || false); // false
		System.out.println();
		
		System.out.println(true | true); // true
		System.out.println(true | false); // true
		System.out.println(false | true); // true
		System.out.println(false | false); // false
		System.out.println();
		
		System.out.println(true || (i++) > 0);
		System.out.println(i);
		System.out.println();
		
		System.out.println(false || (i++) > 0);
		System.out.println(i);
		System.out.println();
		
		System.out.println(true | (i++) > 0);
		System.out.println(i);
		System.out.println();
		
		System.out.println("========= XOR =========");
		System.out.println(true ^ true); // false
		System.out.println(true ^ false); // true 
		System.out.println(false ^ true); // true
		System.out.println(false ^ false); // false 
		
	
		
		
	}
}

