package com.search;

public class InsertTest {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 3, 5, 7, 9, 11, 13, 15, 17 };
		System.out.println(getIndex(arr, 13));
	}

	public static int getIndex(int[] arr, int value) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + ((value - arr[start]) / (arr[end] - arr[start])) * (end - start);
			if (arr[mid] < value) {
				start = mid + 1;
			} else if (arr[mid] > value) {
				end = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
}
