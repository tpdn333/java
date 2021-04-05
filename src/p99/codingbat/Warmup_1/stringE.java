package p99.codingbat.Warmup_1;

public class stringE {
	public boolean stringE(String str) {
		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'e') {
				cnt++;
			}
		}
		if (cnt >= 1 && cnt <= 3) {
			return true;
		}
		return false;
	}

//	public boolean stringE(String str) {
//		int count = 0;
//
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) == 'e')
//				count++;
//			// alternately: str.substring(i, i+1).equals("e")
//		}
//
//		return (count >= 1 && count <= 3);
//	}

}
