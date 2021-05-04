package p99.codingbat;

public class String1Solution {
	public static String makeOutWord(String out, String word) {
		String front = out.substring(0, 2);
		String back = out.substring(2);
		return front + word + back;
	}

	public static String extraEnd(String str) {
		String word = str.substring(str.length() - 2);
		return word + word + word;

	}

	public static String firstTwo(String str) {
		if (str.length() < 2) {
			return str;
		} else {
			return str.substring(0, 2);
		}
	}

	public static String firstHalf(String str) {
		int lenHalf = str.length() / 2;
		return str.substring(0, lenHalf);
	}

	public static String withoutEnd(String str) {
		return str.substring(1, str.length() - 1);
	}

	public static String comboString(String a, String b) {
		String longStr = "";
		String shortStr = "";
		if (a.length() > b.length()) {
			longStr = a;
			shortStr = b;
		} else {
			longStr = b;
			shortStr = a;
		}
		return shortStr + longStr + shortStr;
	}

	public static String nonStart(String a, String b) {
		return a.substring(1) + b.substring(1);
	}

	public static String left2(String str) {
		return str.substring(2) + str.substring(0, 2);
	}

	public static String right2(String str) {
		return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
	}

	public static String theEnd(String str, boolean front) {
		if (front) {
			return str.substring(0, 1);
		} else {
			return str.substring(str.length() - 1);
		}
	}

	public static String withouEnd2(String str) {
		if (str.length() > 1) {
			return str.substring(1, str.length() - 1);
		} else {
			return "";
		}
	}

	public static String middleTwo(String str) {
		int len = str.length();
		return str.substring((len / 2) - 1, (len / 2) + 1);
	}

	public static boolean endsLy(String str) {
		int len = str.length();
		if ((str.indexOf("ly") == -1) || str.indexOf("ly") != len - 2) {
			return false;
		} else {
			return true;
		}
	}

	public static String nTwice(String str, int n) {
		int len = str.length();
		String start = str.substring(0, n);
		String end = str.substring(len - n);
		return start + end;
	}

	public static String twoChar(String str, int index) {
		int len = str.length();
		if (index > 0) {

			if (index + 2 <= len) {
				return str.substring(index, index + 2);
			} else {
				return str.substring(0, 2);
			}
		} else {
			return str.substring(0, 2);
		}

	}

	public static void main(String[] args) {
//		String str1 = makeOutWord("<<>>", "Yay");
//		System.out.println(str1);
//
//		String str2 = extraEnd("Hello");
//		System.out.println(str2);
//
//		String str3 = firstTwo("Hello");
//		System.out.println(str3);
//
//		String str4 = firstHalf("WooHoo");
//		System.out.println(str4);
//
//		String str5 = withoutEnd("Hello");
//		System.out.println(str5);
//
//		String str6 = comboString("Hello", "hi");
//		System.out.println(str6);
//
//		String str7 = nonStart("Hello", "There");
//		System.out.println(str7);
//
//		String str8 = left2("Hello");
//		System.out.println(str8);
//
//		String str9 = right2("Hello");
//		System.out.println(str9);
//
//		String str10 = theEnd("Hello", true);
//		System.out.println(str10);
//
//		String str11 = withouEnd2("Hello");
//		System.out.println(str11);
//
//		String str12 = middleTwo("string");
//		System.out.println(str12);
//		
		Boolean str13 = endsLy("oddy");
		System.out.println(str13);

		String str14 = nTwice("Hello", 2);
		System.out.println(str14);

		String str15 = twoChar("java", 3);
		System.out.println(str15);
	}

}
