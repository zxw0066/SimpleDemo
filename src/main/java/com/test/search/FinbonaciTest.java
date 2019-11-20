package com.test.search;

import java.util.Arrays;

public class FinbonaciTest {

	public static void main(String[] args) {
		int[] arr = { 1, 8, 10, 89, 1000, 1234 };
		System.out.println("index=" + fibSearch(arr, 89));
	}
	
	public static int[] makeArr(int length) {
		int[] arr = new int[length];
		arr[0] = 1;
		arr[1] = 1;
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		return arr;
	}
	
	public static int fibSearch(int[] arr, int value) {
		int k = 0;
		int length = arr.length - 1;
		int[] f = makeArr(20);
		while(length > f[k] - 1) {
			k++;
		}
		int[] temp = Arrays.copyOf(arr, f[k]);
		
		for (int i = length; i < temp.length; i++) {
			temp[i] = arr[length];
		}
		
		int low = 0;
		while(low <= length) {
			int mid = low + f[k-1] - 1;
			if(arr[mid] > value) {
				length = mid - 1;
				k--;
			}else if(arr[mid] < value) {
				low = mid + 1;
				k = k - 2;
			}else {
				if(mid <= length) {
					return mid;
				}else {
					return length;
				}
			}
		}
		return -1;
	}
}
