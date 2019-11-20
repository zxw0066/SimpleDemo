package com.demo.search;

import java.util.Arrays;

/**
 * 斐波那契 时间复杂度：O(log2n)
 * 
 * @author zhaoxingwu
 *
 */
public class FibonacciSearchTest {

	public static int maxSize = 20;

	/**
	 * 生成斐波那契数列
	 * 
	 * @return
	 */
	public static int[] fib() {
		int[] f = new int[maxSize];
		f[0] = 1;
		f[1] = 1;
		for (int i = 2; i < maxSize; i++) {
			f[i] = f[i - 1] + f[i - 2];
		}
		return f;
	}

	public static int fibSearch(int[] a, int key) {
		int low = 0;
		int high = a.length - 1;
		int k = 0;
		// 生成斐波那契数组
		int[] f = fib();
		while (high > f[k] - 1) {
			k++;
		}
		int[] temp = Arrays.copyOf(a, f[k]);
		for (int i = high + 1; i < temp.length; i++) {
			temp[i] = a[high];
		}
		while (low <= high) {
			int mid = low + f[k - 1] - 1;
			if (a[mid] > key) {
				k = k - 1;
				high = mid - 1;
			} else if (a[mid] < key) {
				k = k - 2;
				low = mid + 1;
			} else {
				if (mid <= high) {
					return mid;
				} else {
					return high;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 8, 10, 89, 1000, 1234 };
		System.out.println("index=" + fibSearch(arr, 89));
	}
}
