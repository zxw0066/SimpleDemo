package com.demo.sort;

/**
 * 快速排序 时间： 空间：
 * 
 * @author xingwuzhao
 *
 */
public class QuickSortTest {

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

	public static void sort(int[] arr, int low, int high) {
		if (low < high) {
			int index = getIndex(arr, low, high);
			sort(arr, low, index - 1);
			sort(arr, index + 1, high);
		}
	}

	public static int getIndex(int[] arr, int low, int high) {
		int temp = arr[low];
		while (low < high) {
			while (low < high && temp <= arr[high]) {
				high--;
			}
			arr[low] = arr[high];
			while (low < high && temp >= arr[low]) {
				low++;
			}
			arr[high] = arr[low];
		}
		arr[low] = temp;
		return low;
	}
}
