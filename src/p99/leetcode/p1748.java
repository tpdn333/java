package p99.leetcode;

import java.util.HashSet;
import java.util.Set;

public class p1748 {
	public static void main(String[] args) {
		int[] nums = { 1, 1, 1, 1, 1, 1 };
		int result = 0;
		Set<Integer> allSet = new HashSet<>();
		Set<Integer> uniSet = new HashSet<>();
		for (int n : nums) {
			if (allSet.contains(n)) {
				uniSet.remove(n);
			} else {
				allSet.add(n);
				uniSet.add(n);
			}
		}
		for (int m : uniSet) {
			result += m;
		}
	}
}
