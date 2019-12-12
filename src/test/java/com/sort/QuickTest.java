package com.sort;

public class QuickTest {

	public static void main(String[] args) {
		int[] arr = new int[] { 22, 66, 44, 11, 55, 88, 77, 99, 33 };
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		sort(arr, 0, arr.length - 1);
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
	}

	public static void sort(int[] arr, int start, int end) {
		if(start <= end) {
			int index = getIndex(arr, start, end);
			sort(arr, start, index - 1);
			sort(arr, index + 1, end);
		}
	}
	
	public static int getIndex(int[] arr, int start, int end) {
		int temp = arr[start];
		while(start < end) {
			while(start <= end && temp <= arr[end]) {
				end--;
			}
			arr[start] = arr[end];
			while(start <= end && temp >= arr[start]) {
				start++;
			}
			arr[end] = arr[start];
		}
		arr[start] = temp;
		return start;
	}
}
