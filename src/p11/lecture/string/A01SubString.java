package p11.lecture.string;

public class A01SubString {
	public static void main(String[] args) {
		String str1 = "java servlet spring";
		String str2 = str1.substring(0, 4);
		System.out.println(str2);
		
		String str3 = str1.substring(5, 12);
		System.out.println(str3);
		
		String str4 = str1.substring(13, 19);
		System.out.println(str4);
	}
}
