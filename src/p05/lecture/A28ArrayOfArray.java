package p05.lecture;

import java.util.Arrays;

public class A28ArrayOfArray {
	public static void main(String[] args) {
		int[][] arr = new int[2][];

		arr[0] = new int[] { 9, 8, 7 };
		arr[1] = arr[0];

		for (int[] a : arr) {
			System.out.println(Arrays.toString(a));
		}
		
		arr[1][0] = 10;
		arr[0][1] = 20;
		arr[1][2] = 30;
		
		for (int[] a : arr) {
			System.out.println(Arrays.toString(a));
		}
	}
}
