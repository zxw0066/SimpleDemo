package com.search;

public class InsertTest {

	public static void main(String[] args) {
		int[] arr = new int[] {1,3,5,7,9,11,13,15,17};
		System.out.println(getIndex(arr, 13));
	}
	
	public static int getIndex(int[] arr, int value) {
		int l = 0;
		int r = arr.length - 1;
		while(l <= r) {
			int m = l + (value-arr[l])/(arr[r]-arr[l])*(r-l);
			if(arr[m]>value) {
				r=m-1;
			}else if(arr[m]<value) {
				l=m+1;
			}else {
				return m;
			}
		}
		return -1;
	}
}
