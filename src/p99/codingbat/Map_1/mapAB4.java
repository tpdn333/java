package p99.codingbat.Map_1;

import java.util.Map;

public class mapAB4 {
	public Map<String, String> mapAB4(Map<String, String> map) {
		if (map.containsKey("a") && map.containsKey("b")) {
			int x = map.get("a").length();
			int y = map.get("b").length();
			if (x < y) {
				map.put("c", map.get("b"));
			} else if (x > y) {
				map.put("c", map.get("a"));
			} else {
				map.put("a", "");
				map.put("b", "");
			}
		}

		return map;
	}

}
