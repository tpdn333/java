package p15.textbook;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample2 {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();

		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));

		NavigableSet<Integer> dI = scores.descendingSet();
		for (Integer score : dI) {
			System.out.print(score + " ");
		}
		System.out.println();

		NavigableSet<Integer> aI = scores.descendingSet().descendingSet();
		for (Integer score : aI) {
			System.out.print(score + " ");
		}
	}
}
