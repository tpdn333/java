package p99.codingbat.Warmup_2;

public class altParis {
	public String altPairs(String str) {
		String res = "";
		for (int i = 0; i < str.length(); i += 4) {
			res += str.charAt(i);
			if (str.charAt(i + 1) != ' ') {

			}
		}
		return "";
	}

	public static void main(String[] arg) {
		String str = "Chocolate";
		for (int i = 0; i < str.length(); i += 4) {
			System.out.println(str.charAt(i));
			System.out.println(str.charAt(i + 1));
		}
	}
}
