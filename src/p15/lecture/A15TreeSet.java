package p15.lecture;

import java.util.Iterator;
import java.util.TreeSet;

public class A15TreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();

		set.add(100);
		set.add(40);
		set.add(200);
		set.add(300);
		set.add(30);
		
		// 자동으로 순서에 맞게 정렬
		// 인덱스가 존재하지 않는다
		for(int n : set) {
			System.out.println(n);
		}
		System.out.println();
		
		System.out.println(set.first());
		System.out.println(set.last());
		System.out.println();
		
		System.out.println("210기준으로 가장 작은거: " + set.lower(210));
		System.out.println("210기준으로 가장 큰거: " + set.higher(210));
		
		System.out.println("내림차순 탐색");
		Iterator<Integer> di = set.descendingIterator();
		
		while(di.hasNext()) {
			System.out.println(di.next());
		}
	
	}
}
