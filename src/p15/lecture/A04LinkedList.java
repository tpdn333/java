package p15.lecture;

import java.util.List;
import java.util.LinkedList;

public class A04LinkedList {
	public static void main(String[] args) {
		List<Integer> list1 = new LinkedList<>();
		list1.add(3);
		list1.add(4);
		list1.add(5);

		System.out.println(list1.get(0));

	}
}
