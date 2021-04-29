package p15.lecture;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class A09Map {
	public static void main(String[] args) {
		// Key, Value
		Map<Integer, Integer> map = new HashMap<>();
		map.put(2, 99);
		map.put(3, 66);
		map.put(4, 77);

		System.out.println(map.size());
		// 같은 키의 value에 덮어쓴다
		map.put(3, 22);
		System.out.println(map.size());

		// key의 value를 리턴
		System.out.println(map.get(2));
		System.out.println(map.get(3));

		Set<Integer> keys = map.keySet();

		for (Integer key : keys) {
			System.out.println(key + ": " + map.get(key));
		}

		map.remove(2);
		System.out.println(map.size());

		Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
		Iterator<Map.Entry<Integer, Integer>> entryIterator = entries.iterator();
		while (entryIterator.hasNext()) {
			Map.Entry<Integer, Integer> entry = entryIterator.next();

		}
	}
}
