package p15.textbook.exercises.ex09;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = null;
		int maxScore = 0, totalScore = 0;

		Set<Entry<String, Integer>> entrySet = map.entrySet();

		// 평균 , 최고점수 
		for (Map.Entry<String, Integer> entry : entrySet) {
			if (maxScore < entry.getValue()) {
				maxScore = entry.getValue();
			}
			totalScore += entry.getValue();
			
		}
		System.out.println("평균점수 : " + totalScore / map.size());
		System.out.println("최고점수 : " + maxScore);
		
		// 최고점수 받은 사람
		for (String key : map.keySet()) {
			if (maxScore == (map.get(key))) {
				name = key;
			}
		}
		System.out.println("최고점수를 받은 아이디: " + name);
//		System.out.println("최고점수를 받은 아이디: " + getKey(map, maxScore));
	}

	public static <K, V> K getKey(Map<K, V> map, V value) {
		for (K key : map.keySet()) {
			if (value.equals(map.get(key))) {
				return key;
			}
		}
		return null;
	}

}
