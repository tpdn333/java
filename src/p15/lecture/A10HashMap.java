package p15.lecture;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class A10HashMap {
	public static void main(String[] args) {
		Map<Integer, Integer> map1 = new HashMap<>();

		// thread 환경일땐 테이블
		Map<Integer, Integer> map2 = new Hashtable<>();

		map2.put(3, 99);
		map2.put(4, 16);
		map2.put(5, 25);

		System.out.println(map2);

		map2.put(3, 9);

		System.out.println(map2.get(3));

		Set<Entry<Integer, Integer>> entrySet = map2.entrySet();

		for (Map.Entry<Integer, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
