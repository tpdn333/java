package p99.programmers;

import java.util.Arrays;
import java.util.Comparator;

public class p12917 {
	public static String soltion(String s) {
		String answer = "";
		Character[] arr = new Character[s.length()];
		for (int i = 0; i < s.length(); i++) {
			arr[i] = s.charAt(i);
		}
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr, new Comparator<Character>() {

			@Override
			public int compare(Character o1, Character o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}

		});
		for(Character item : arr) {
			answer += item;
		}
		return answer;
	}

	public static void main(String[] args) {
		String s = "Zbcdefg";
		String answer = "";
		Character[] arr = new Character[s.length()];
		for (int i = 0; i < s.length(); i++) {
			arr[i] = s.charAt(i);
		}
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr, new Comparator<Character>() {

			@Override
			public int compare(Character o1, Character o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}

		});
		for(Character item : arr) {
			answer += item;
		}
		System.out.println(answer);
	}
}
