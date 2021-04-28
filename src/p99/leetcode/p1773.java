package p99.leetcode;

import java.util.Arrays;
import java.util.List;

public class p1773 {
	public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
		int k = 0;
		int result = 0;
		switch (ruleKey) {
		case "type":
			k = 0;
		case "color":
			k = 1;
		case "name":
			k = 2;
		}
		for (int i = 0; i < items.size(); i++) {
			List<String> item = items.get(i);
			if (item.get(k) == ruleValue) {
				result = i;
			}
		}

		return result;
	}

}