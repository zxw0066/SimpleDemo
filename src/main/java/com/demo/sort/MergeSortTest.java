package com.demo.sort;

/**
 * 归并排序-分治思想
 * @author xingwuzhao
 *
 */
public class MergeSortTest {
	
	public static void main(String[] args) {
		int[] arr = new int[] { 22, 66, 44, 11, 55, 88, 77, 99, 33 };
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		sort(arr, 0, arr.length-1);
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
	}

	public static void sort(int[] arr, int start, int end) {
		if(arr == null || start >= end) {
			return;
		}
		int mid = (start + end) >>> 1;
		sort(arr, start, mid);
		sort(arr, mid + 1, end);
		merge(arr, start, mid, end);
	}
	
	private static void merge(int[] arr, int start, int mid, int end) {
		// copy 新数组
		int[] temp = arr.clone();
		int i = start;
		int j = mid + 1;
		int k = 0;
		// 区间范围内，左右移动下标，放到新数组中
		while(i <= mid && j <= end){
			if(arr[i] < arr[j]) {
				temp[k++] = arr[i++];
			}else {
				temp[k++] = arr[j++];
			}
		}
		while(i <= mid) {
			temp[k++] = arr[i++];
		}
		while(j <= end) {
			temp[k++] = arr[j++];
		}
		for (i = 0; i < k; i++) {
			arr[start + i] = temp[i];
		}
		// 释放临时数组
		temp = null;
	}

}
