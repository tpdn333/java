package p99.leetcode;

public class p1678 {
	public String interpret(String command) {

		do {
			command = command.replace("()", "o").replace("(al)", "al");
		} while (!check(command));
		return command;

	}

	private static boolean check(String str) {
		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(') {
				cnt++;
			}
		}
		return cnt == 0;
	}
}
