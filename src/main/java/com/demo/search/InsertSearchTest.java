package com.demo.search;

/**
 * ≤Â»ÎÀ„∑®
 * 
 * @author zhaoxingwu
 *
 */
public class InsertSearchTest {

	public static void main(String[] args) {
		int[] arr = new int[] { 11, 22, 33, 44, 55, 66, 77 };
		System.out.println(getIndex(arr, 22));
		System.out.println(getIndex(arr, 55));
		System.out.println(getIndex(arr, 77));
	}

	public static int getIndex(int[] arr, int value) {
		int min = 0;
		int max = arr.length - 1;
		while (min <= max) {
			int mid = min + ((value - arr[min]) / (arr[max] - arr[min])) * (max - min);
			if (arr[mid] > value) {
				max = mid - 1;
			} else if (arr[mid] < value) {
				min = mid + 1;
			} else {
				return mid;
			}
		}
		return 0;
	}

}
