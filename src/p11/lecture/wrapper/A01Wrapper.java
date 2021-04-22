package p11.lecture.wrapper;

public class A01Wrapper {
	public static void main(String[] args) {
		// Wrapper class들
		// Byte, Short, Integer, Long
		// Character, Boolean
		// Float, Double

		
		// 기본타입을 참조타입으로
		Integer i1 = new Integer(100);
		
		Object[] arr1 = new Object[] {"java", 3, true, 3.14f, 'a'};
		
		Object o1 = new Integer(3);	// Boxing
		Object o2 = 3; // Auto Boxing
		
		Integer i2 = new Integer(99);
		
	}
}
