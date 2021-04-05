package p05.lecture;

import java.util.Arrays;

public class A24ArrayOfArray {
	public static void main(String[] args) {
		// 행렬
		int[][] arr2 = new int[2][3];

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		arr2[1][1] = 9;
		arr2[0][2] = 8;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("--- Arrays.toString() ---");
		for(int[] arr:arr2) {
			System.out.println(Arrays.toString(arr));
		}
	}
}
