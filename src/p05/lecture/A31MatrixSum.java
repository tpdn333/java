package p05.lecture;

import java.util.Arrays;

public class A31MatrixSum {
	public static void main(String[] args) {
		int[][] mat1 = { 
				{ 1, 2, 3 }, 
				{ 4, 5, 6 }, 
				{ 7, 8, 9 }, 
				{ 2, 3, 4 }, 
		};
		int[][] mat2 = { 
				{ 10, 20, 30 }, 
				{ 40, 50, 60 }, 
				{ 70, 80, 90 }, 
				{ 20, 30, 40 }, 
		};
//		int[][] mat3 = sum(mat1, mat2);
//		for(int[] row : mat3) {
//			System.out.println(Arrays.toString(row));
//		}
		
		int[][] mat4 = {
				{ 1, 2, 3 },
				{ 4, 5, 6 },
		};
		int[][] mat5 = {
				{ 7, 8 },
				{ 9, 10 },
				{ 11, 12 },
		};
		int[][] mat6 = multi(mat4, mat5);
		for(int[] row : mat6) {
			System.out.println(Arrays.toString(row));
		}
	}
	private static int[][] multi(int[][] arr1, int[][] arr2) {
		if(arr1[0].length != arr2.length) {
			System.out.println("곱할 수 없습니다.");
		}
		int[][] answer = new int[arr1.length][arr2[0].length];
		
		for(int i = 0; i < arr1.length; i++) {
			for(int k = 0; k < arr2[0].length; k++) {
				for(int j = 0; j < arr1[0].length; j++) {
					answer[i][k] += arr1[i][j] * arr2[j][k];
				}	
			}
		}
		return answer;
	}
	private static int[][] sum2(int[][] a, int[][] b) {
		int[][] c = new int[a.length][];
		for(int i = 0; i < c.length; i++) {
			c[i] = new int[a[i].length];
			for(int k = 0; k < c[0].length; k++) {
				c[i][k] = a[i][k] + b[i][k];
			}
		}
		return c;
	}
	
	private static int[][] sum(int[][] a, int[][] b) {
		int[][] c = new int[a.length][a[0].length];
		for(int i = 0; i < c.length; i++) {
			for(int k = 0; k < c[0].length; k++) {
				c[i][k] = a[i][k] + b[i][k];
			}
		}
		return c;
	}
	

}
