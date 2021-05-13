package p99.codingbat.Warmup_2;

public class stringX {
	public String stringX12(String str) {
		int len = str.length();
		String res = "";
		for (int i = 0; i < len; i++) {
			if (!(i > 0 && i < len - 1 && str.substring(i, i + 1).equals("x"))) {
				res += str.charAt(i);
			}
		}

		return res;
	}

	public String stringX(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			// Only append the char if it is not the "x" case
			if (!(i > 0 && i < (str.length() - 1) && str.substring(i, i + 1).equals("x"))) {
				result = result + str.substring(i, i + 1); // Could use str.charAt(i) here
			}
		}
		return result;
	}

}
