package p15.lecture.sample;

import java.util.Arrays;
import java.util.List;

public class Ex01List {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(7, 9, -100, 702, 30, 820, 90, 700);

		System.out.println(list);

		int sum = sum(list);
		System.out.println(sum);

		int max = max(list);
		System.out.println("Max: " + max);

		int indexOfMax = indexOfMax(list);
		System.out.println(list.get(indexOfMax));
	}

	private static int indexOfMax(List<Integer> list) {
		int max = Integer.MIN_VALUE;
		for (int value : list) {
			if (max < value) {
				max = value;
			}
		}
		return list.indexOf(max);
	}

	private static int max(List<Integer> list) {
		int max = Integer.MIN_VALUE;
//		for (int i = 0; i < list.size(); i++) {
//			if (max < list.get(i)) {
//				max = list.get(i);
//			}
//		}
		for (int value : list) {
			if (max < value) {
				max = value;
			}
		}
		return max;
	}

	private static int sum(List<Integer> list) {
		int result = 0;
		for (int value : list) {
			result += value;
		}
		return result;
	}

}
