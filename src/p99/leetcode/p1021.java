package p99.leetcode;

import java.util.Stack;

public class p1021 {
	public static void main(String[] args) {
		String str = "(()())(())";
		Stack<Character> stack = new Stack<>();
		String res = "";

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == '(') {
				stack.push(c);
				if (stack.size() != 1) {
					res += c;
				}
			} else {
				stack.pop();
				if (stack.size() != 0) {
					res += c;
				}
			}

		}
		System.out.println(res);
	}
}
