package p15.lecture.sample;

import java.util.*;

public class Ex05List {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(4, 6, 9, 10);
		List<Integer> list2 = Arrays.asList(-4, -6, -9, 25000, -10);
		List<Integer> list3 = Arrays.asList(4444, 6666, 9999, 10005);
		List<Integer> list4 = Arrays.asList(4050, 6070, 9060, 1012, 25002);

//		List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<List<Integer>> list = new ArrayList<>();

		list.add(list1);
		list.add(list2);
		list.add(list3);
		list.add(list4);

		int max = max(list);
		System.out.println("Max: " + max);

		List<Integer> flatList = flat(list);
		System.out.println(flatList.size());
		System.out.println(flatList.get(17));
	}

	private static List<Integer> flat(List<List<Integer>> list) {
		List<Integer> flat = new ArrayList<>();
//		for (List<Integer> value1 : list) {
//			for (int value2 : value1) {
//				flat.add(value2);
//			}
//		}
//		for (int i = 0; i < list.size(); i++) {
//			List<Integer> subList = list.get(i);
//			for (int j = 0; j < subList.size(); j++) {
//				flat.add(subList.get(j));
//			}
//		}
		for (List<Integer> lists : list) {
			flat.addAll(lists);
		}
		return flat;
	}

	private static int max(List<List<Integer>> list) {
		int max = Integer.MIN_VALUE;
		for (List<Integer> value1 : list) {
			for (int value2 : value1) {
				if (max < value2) {
					max = value2;
				}
			}
		}
//		for (int i = 0; i < list.size(); i++) {
//			List<Integer> subList = list.get(i);
//
//			for (int j = 0; j < subList.size(); j++) {
//				int item = subList.get(j);
//
//				if (item > max) {
//					max = item;
//				}
//			}
//		}
		return max;
	}
}
