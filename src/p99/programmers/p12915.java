package p99.programmers;

import java.util.Arrays;
import java.util.Comparator;

public class p12915 {
	public String[] solution(String[] strings, int n) {
		String[] answer = {};
		return answer;
	}
	public static void main(String[] args) {
		String[] arr = { "abce", "abcd", "cdx" };
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				
				return 0;
			}
		});
		
	}
}
