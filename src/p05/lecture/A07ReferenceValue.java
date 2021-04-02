package p05.lecture;

public class A07ReferenceValue {
	public static void main(String[] args) {
		String s = new String("java");
		String t = "java";
		String y = "java";
		
		int sHash1 = System.identityHashCode(s);
		int sHash2 = System.identityHashCode(t);
		int sHash3 = System.identityHashCode(y);
		
		System.out.println(sHash1);
		System.out.println(sHash2);
		System.out.println(sHash3);
		
	}
}
