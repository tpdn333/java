package p15.lecture.sample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex06Set {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		int[] arr1 = { 1, 2, 3, 4, 5, 4, 3, 2 };
		int[] arr2 = { 1, 2, 3, 4 };

		int sum1 = sum(arr1);
		int sum2 = sum(arr2);

		System.out.println(sum1);
		System.out.println(sum2);
	}

	// 중복된건 한번만 더하기
	public static int sum(int[] nums) {
		int result = 0;
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}
		for (int n : set) {
			result += n;
		}
//		Iterator<Integer> iter = set.iterator();
//		while (iter.hasNext()) {
//			result += iter.next();
//		}
		return result;
	}
}
