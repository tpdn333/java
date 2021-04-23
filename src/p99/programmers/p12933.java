package p99.programmers;

import java.util.Arrays;

class p12933 {
	// 정수 내림차순으로 배치하기
	public static void main(String[] args) {
		long nVlaue = 1183272;
		long answer = 0;

		String strToInt = String.valueOf(nVlaue);
		int[] arr1 = new int[strToInt.length()];
		int[] arr2 = new int[strToInt.length()];
		for (int i = 0; i < strToInt.length(); i++) {
			arr1[i] = Character.getNumericValue(strToInt.charAt(i));
		}
		Arrays.sort(arr1);
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[arr1.length - 1 - i];
		}

		String result = "";
		for (int i = 0; i < arr2.length; i++) {
			result += String.valueOf(arr2[i]);
		}
		answer  = Long.parseLong(result);
		System.out.println(result);
		System.out.println(answer);
	}
}
