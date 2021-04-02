package p05.textbook.exercise;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise07 {
	public static void main(String[] args) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int[] array = { -2, -8, 5, 10, 3, 11, 8, 2, 12 };
		// 최대값
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		// 최소값
		for (int i = 0; i < array.length; i++) {
			if (min > array[i]) {
				min = array[i];
			}
		}
		// 합계
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		// 평균
		double avg = sum / (double) array.length;
		System.out.println("max : " + max);
		System.out.println("min : " + min);
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		
	}
}
