package p99.codingbat.Warmup_2;

public class stringMatch {
	public static void main(String[] args) {
		String a = "xxcaazz";
		String b = "xxbaaz";
		int result = 0;
		for (int i = 0; i < a.length() - 1; i++) {
			for (int j = 0; i < b.length()-1; j++) {
				if(a.substring(i, i+1).equals(b.substring(j,j+1))) {
					result++;
				}
			}
			System.out.println(a.substring(i, i+1));
		}
		System.out.println(result);
	}
}
