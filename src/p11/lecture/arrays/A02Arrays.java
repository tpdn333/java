package p11.lecture.arrays;

import java.util.Arrays;

public class A02Arrays {
	public static void main(String[] args) {
		int[] arr1 = { 235, 6234, 234, 235, 3, 632, 432, 5347, 48, 9, 1, 31, 2 };
		System.out.println(Arrays.toString(arr1));
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
	}
}
