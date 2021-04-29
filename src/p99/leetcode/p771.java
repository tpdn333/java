package p99.leetcode;

import java.util.*;

public class p771 {
	public static void main(String[] args) {
		String jewels = "aA";
		String stones = "aAAbbbb";
		Set<Character> jewelSet = new HashSet<>();
		for (int i = 0; i < jewels.length(); i++) {
			jewelSet.add(jewels.charAt(i));
		}
		int result = 0;
//		Iterator<Character> iter = jewelSet.iterator();
//		while (iter.hasNext()) {
//			Character c = iter.next();
//			for (int i = 0; i < stones.length(); i++) {
//				if (c == stones.charAt(i)) {
//					result++;
//				}
//			}
//		}
		for (int i = 0; i < stones.length(); i++) {
			if (jewelSet.contains(stones.charAt(i))) {
				result++;
			}

		}
		System.out.println(result);
	}
}
