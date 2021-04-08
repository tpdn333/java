package p99.programmers;

import java.util.Arrays;

public class p42840 {
	public static void main(String[] args) {
		int[] user1 = { 1, 2, 3, 4, 5 };
		int[] user2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] user3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		int[] answers = { 1, 2, 3, 4, 5 };
		int[] cnt = new int[3];
		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == user1[i % user1.length]) {
				cnt[0]++;
			}
			if (answers[i] == user2[i % user2.length]) {
				cnt[1]++;
			}
			if (answers[i] == user3[i % user3.length]) {
				cnt[2]++;
			}
		}
		System.out.println(cnt[0] + ", " + cnt[1] + ", " + cnt[2]);
		int index = Arrays.binarySearch(cnt, 5);
		int max = Math.max(cnt[0], cnt[1]);
		System.out.println(index);
//		if (userCnt1 == ) {
//			
//		}
	}
}
