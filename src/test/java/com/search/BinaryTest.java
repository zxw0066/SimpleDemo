package com.search;

public class BinaryTest {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 3, 5, 7, 9, 11, 13, 15, 17 };
		System.out.println(getIndex(arr, 5));
	}

	public static int getIndex(int[] arr, int value) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) >>> 1;
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
