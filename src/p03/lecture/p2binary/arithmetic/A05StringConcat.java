package p03.lecture.p2binary.arithmetic;

public class A05StringConcat {
	public static void main(String[] args) {

		int a = 3;
		int b = 9;
		String str1 = "java";
		String str2 = "spring";
		String str3 = str1 + str2;

		String str4 = str1 + a;
		System.out.println(str4);

		String str5 = str1 + a + b;
		System.out.println(str5);
		
		String str6 = a + b + str1;
		System.out.println(str6);
	}
}
