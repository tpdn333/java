package p09.lecture;

public class A04LocalClassAccess {
	void method(int param) {
		int localVar = 3;
//		localVar = 4;	// 값이 변하면 안됨
		// param과 localVar는 묵시적 final
		class LocalClass{
			void method1() {
				System.out.println(localVar);
				System.out.println(param);
			}
		}
	}
}
