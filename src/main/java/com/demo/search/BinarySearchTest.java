package com.demo.search;

/**
 * 二分查找 前提数组必须有序 时间复杂度为O(logn) kafka使用此算法进行底层查询
 * 
 * @author zhaoxingwu
 *
 */
public class BinarySearchTest {

	public static void main(String[] args) {
		int[] arr = new int[] { 11, 22, 33, 44, 55, 66, 77 };
		System.out.println(getIndex(arr, 22));
		System.out.println(getIndex(arr, 55));
		System.out.println(getIndex(arr, 77));
	}

	public static int getIndex(int[] arr, int value) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			// 右移一位，相当于除以2，但右移的运算速度更快；若使用(low+high)/2求中间位置容易溢出
			int mid = low + ((high - low) >>> 1);
			if (arr[mid] < value) {
				low = mid + 1;
			} else if (arr[mid] > value) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
		return 0;
	}

}
