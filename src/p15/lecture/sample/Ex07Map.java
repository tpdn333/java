package p15.lecture.sample;

import java.util.*;

public class Ex07Map {
	public static void main(String[] args) {
		int[] arr1 = { 1, 1, 1, 1, 2, 2, 3, 3, 4, 5, 1, 2, 3, 4, 9 };

		Map<Integer, Integer> map = countValue(arr1);
		System.out.println(map.getOrDefault(1, 1));

//		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//			System.out.println(entry.getKey() + ": " + entry.getValue());
//		}
	}

	public static Map<Integer, Integer> countValue(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int num : nums) {
			if (map.containsKey(num)) {
				int cnt = map.get(num);
				map.put(num, cnt + 1);
			} else {
				map.put(num, 1);
			}
		}
		return map;
	}
}
