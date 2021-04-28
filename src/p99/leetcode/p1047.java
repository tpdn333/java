package p99.leetcode;

import java.util.Stack;

public class p1047 {
	public static void main(String[] args) {
		String S = "abbacaacceeacaqw";
		char[] arr = S.toCharArray();
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < S.length(); i++) {
			char c = S.charAt(i);

			char last = ' ';
			if (!stack.empty()) {
				last = stack.peek();
			}
			if (last == c) {
				stack.pop();
			} else {
				stack.push(c);
			}
		}

		String res = "";
		for (int i = 0; i < stack.size(); i++) {
			res += stack.get(i);
		}

		System.out.println(res);
	}
}
