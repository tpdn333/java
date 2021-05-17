package p99.codingbat.Map_2;

import java.util.*;

public class wordLen {
	public Map<String, Integer> wordLen(String[] strings) {
		Map<String, Integer> map = new HashMap<>();
		for (String str : strings) {
			map.put(str, str.length());
		}
		return map;
	}

}
