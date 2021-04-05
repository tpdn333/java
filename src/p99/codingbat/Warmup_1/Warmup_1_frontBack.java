package p99.codingbat.Warmup_1;

public class Warmup_1_frontBack {
//	public String frontBack(String str) {
//		if (str.length() <= 1) {
//			return str;
//		}
//		String front = str.substring(0, 1);
//		String mid = str.substring(1, str.length() - 1);
//		String back = str.substring(str.length() - 1, str.length());
//		return back + mid + front;
//	}

	public String frontBack(String str) {
		if (str.length() <= 1)
			return str;

		String mid = str.substring(1, str.length() - 1);

		// last + mid + first
		return str.charAt(str.length() - 1) + mid + str.charAt(0);
	}

}
