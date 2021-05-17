package p99.codingbat.Map_2;

import java.util.Map;
import java.util.HashMap;

public class word0 {
	public Map<String, Integer> word0(String[] strings) {
		Map<String, Integer> res = new HashMap<>();
		for (String str : strings) {
			res.put(str, 0);
		}
		return res;
	}
}
