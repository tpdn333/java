package p99.leetcode;

import java.util.List;

public class p1773 {
	public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
		int i = 0;
		switch (ruleKey) {
		case "type":
			i = 0;
		case "color":
			i = 1;
		case "name":
			i = 2;
		}

		for (List<String> subItem : items) {
			if (subItem.get(1) == ruleKey) {

			}
		}
		return 0;
	}
}