package com.sort;

public class SelectTest {

	public static void main(String[] args) {
		int[] arr = new int[] { 22, 66, 44, 11, 55, 88, 77, 99, 33 };
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
	}

	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int index = i;
			int temp;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[index]) {
					index = j;
				}
			}
			temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
		}
	}
}
