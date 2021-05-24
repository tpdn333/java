package p99.codingbat.Warmup_2;

public class stringMatch {
	public static int stringMatch(String a, String b) {
		int result = 0;
		int len = Math.min(a.length(), b.length());
		for (int i = 0; i < len - 
				1; i++) {
			if(a.substring(i, i+2).equals(b.substring(i, i+2))) {
				result++;
			}
		}
		return result;
	}

//	public static int stringMatch(String a, String b) {
//		// Figure which string is shorter.
//		int len = Math.min(a.length(), b.length());
//		int count = 0;
//
//		// Look at both substrings starting at i
//		for (int i = 0; i < len - 1; i++) {
//			String aSub = a.substring(i, i + 2);
//			String bSub = b.substring(i, i + 2);
//			if (aSub.equals(bSub)) { // Use .equals() with strings
//				count++;
//			}
//		}
//
//		return count;
//	}

	public static void main(String[] args) {

		String str1 = "iaxxai";
		String str2 = "aaxxaaxx";
		int result = stringMatch(str1, str2);
		System.out.println(result);
	}
}
