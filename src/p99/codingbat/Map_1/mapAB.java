package p99.codingbat.Map_1;

import java.util.HashMap;
import java.util.Map;

public class mapAB {
	public static Map<String, String> mapAB(Map<String, String> map) {
		if (map.containsKey("a") && map.containsKey("b")) {
			map.put("ab", map.get("a") + map.get("b"));
		}
		return map;
	}

	public static void main(String[] args) {
		Map<String, String> res = new HashMap<>();
		res.put("a", "Hi");
		
		
		System.out.println(res);
		res = mapAB(res);
		System.out.println(res);
	}

}
