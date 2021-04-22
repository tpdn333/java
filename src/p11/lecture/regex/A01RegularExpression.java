package p11.lecture.regex;

import java.util.regex.Pattern;

public class A01RegularExpression {
	// 정규표현식
	// 문자열의 패턴을 표현하는 문자열
	// meta-character, quantifier
	public static void main(String[] args) {
		String regex1 = "a";
		String str1 = "a";
		boolean p1 = Pattern.matches(regex1, str1);
		System.out.println(p1);

		regex1 = "java";
		str1 = "java";
		System.out.println(Pattern.matches(regex1, str1));

		regex1 = "9";
		str1 = "0";
		System.out.println(Pattern.matches(regex1, str1));

		regex1 = "\\d"; // 숫자라는 의미
		str1 = "8";
		System.out.println(Pattern.matches(regex1, str1)); // true

		regex1 = "\\d"; // 숫자하나라는 의미
		str1 = "89";
		System.out.println(Pattern.matches(regex1, str1)); // false

		regex1 = "\\d\\d";
		str1 = "89";
		System.out.println(Pattern.matches(regex1, str1)); // true

		regex1 = "\\d{3}"; // {}앞에 패턴이 몇번 반복되나
		str1 = "892";
		System.out.println(Pattern.matches(regex1, str1)); // true

		regex1 = "\\d{3,}"; // {n,} n개 이상
		str1 = "812392";
		System.out.println(Pattern.matches(regex1, str1)); // true

		regex1 = "010-\\d{4}-\\d{4}";
		str1 = "010-1234-5678";
		System.out.println(Pattern.matches(regex1, str1));

		regex1 = "\\d{3,5}"; // {n,m} n개 이상, m개 이하
		str1 = "1234568";
		System.out.println(Pattern.matches(regex1, str1));

		regex1 = "\\d+"; // 1개 이상 \d{1,}
		str1 = "01";
		System.out.println(Pattern.matches(regex1, str1));

		regex1 = "\\d*"; // 0개 이상 \d{0,}
		str1 = "";
		System.out.println(Pattern.matches(regex1, str1));

		regex1 = "\\d?"; // \d{0,1}
		str1 = "9";
		System.out.println(Pattern.matches(regex1, str1));

		regex1 = "010-?\\d{4}-?\\d{4}";
		str1 = "010-1234-5678";
		String str2 = "01012345678";
		System.out.println(Pattern.matches(regex1, str1)); // true
		System.out.println(Pattern.matches(regex1, str2)); // true

		regex1 = "\\w"; // 문자 w : word api참고
		str1 = "_";
		str2 = "Z";
		String str3 = "z";
		String str4 = "2";
		System.out.println(Pattern.matches(regex1, str1)); // true
		System.out.println(Pattern.matches(regex1, str2)); // true
		System.out.println(Pattern.matches(regex1, str3)); // true
		System.out.println(Pattern.matches(regex1, str4)); // true

		regex1 = "(java)"; // 그룹
		str1 = "java";
		System.out.println(Pattern.matches(regex1, str1));

		regex1 = "(java|python)";
		str1 = "java";
		str2 = "python";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));

		regex1 = "(java|python)+";
		str1 = "java";
		str2 = "python";
		str3 = "javapythonpythonjava";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));

		regex1 = "."; // 아무 문자
		str1 = "#";
		str2 = "-";
		str3 = " ";
		str4 = "z";
		System.out.println(Pattern.matches(regex1, str1)); // true
		System.out.println(Pattern.matches(regex1, str2)); // true
		System.out.println(Pattern.matches(regex1, str3)); // true
		System.out.println(Pattern.matches(regex1, str4)); // true

	}
}
