package p15.lecture.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex03List {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(5, 2, 6, 9, 0, 5, 9);
		List<Integer> list2 = Arrays.asList(3, 5, 8, 2, 7, 8, 10, 8);

		// size 다른 list합치기
		List<Integer> merge1 = merge1(list1, list2);
		System.out.println(merge1);

		List<Integer> merge2 = merge2(list1, list2);
		System.out.println(merge2);
	}

	private static List<Integer> merge2(List<Integer> list1, List<Integer> list2) {
		int i1 = list1.size() - 1;
		int i2 = list2.size() - 1;
		List<Integer> merge = new ArrayList<>();
		for (; i1 >= 0 && i2 >= 0; i1--, i2--) {
			merge.add(list1.get(i1));
			merge.add(list2.get(i2));
		}
		for (; i1 >= 0; i1--) {
			merge.add(list1.get(i1));
		}
		for (; i2 >= 0; i2--) {
			merge.add(list2.get(i2));
		}
		return merge;
	}

	private static List<Integer> merge1(List<Integer> list1, List<Integer> list2) {
		int size1 = list1.size();
		int size2 = list2.size();
		int i1 = 0, i2 = 0;
		List<Integer> merge = new ArrayList<>();
		for (; i1 < size1 && i2 < size2; i1++, i2++) {
			merge.add(list1.get(i1));
			merge.add(list2.get(i2));
		}
		for (; i1 < size1; i1++) {
			merge.add(list1.get(i1));
		}
		for (; i2 < size2; i2++) {
			merge.add(list2.get(i2));
		}
		return merge;
	}
}
