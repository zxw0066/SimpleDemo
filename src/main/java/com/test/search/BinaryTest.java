package com.test.search;

public class BinaryTest {

	public static void main(String[] args) {
		int[] arr = new int[] {1,3,5,7,9,11,13,15,17};
		System.out.println(getIndex(arr, 5));
	}
	
	public static int getIndex(int[] arr, int value) {
		int low = 0;
		int high = arr.length - 1;
		while(low<=high) {
			int mid = low +((high-low)>>>1);
			if(arr[mid] < value) {
				low = mid+1;
			}else if(arr[mid] > value) {
				high=mid-1;
			}else {
				return mid;
			}
		}
		return -1;
	}
}
