package p99.codingbat.Warmup_1;

public class Warmup_1_notString {
	public String notString(String str) {
//		if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
//			return str;
//		}
//
//		return "not " + str;

		if (str.startsWith("not")) {
			return str;
		} else {
			return "not " + str;
		}
	}

}
