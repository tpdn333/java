package p99.leetcode;

import java.util.HashMap;
import java.util.Map;

public class p1512 {
	public int numIdenticalPairs(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		int result = 0;

		for (int num : nums) {
			if (!map.containsKey(num)) {
				map.put(num, 1);
			} else if (map.containsKey(num)) {

				result += map.get(num);
				map.put(num, map.get(num) + 1);
			}
		}

		return result;

	}
}
