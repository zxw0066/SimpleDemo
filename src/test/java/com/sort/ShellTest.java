package com.sort;

public class ShellTest {

	public static void main(String[] args) {
		int[] arr = new int[] { 22, 66, 44, 11, 55, 88, 77, 99, 33 };
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
	}

	public static void sort(int[] arr) {
		int gap = arr.length >>> 1;
		while (gap >= 1) {
			for (int i = gap; i < arr.length; i++) {
				int j = 0;
				int temp = arr[i];
				for (j = i - gap; j >= 0 && temp < arr[j]; j = j - gap) {
					arr[j + gap] = arr[j];
				}
				arr[j + gap] = temp;
			}
			gap >>>= 1;
		}
	}
}
