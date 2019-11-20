package com.demo.search;

/**
 * 顺序查找 
 * 时间复杂度：O(n)
 * 
 * @author zhaoxingwu
 *
 */
public class SeqSearchTest {

	public static void main(String[] args) {
		int[] arr = new int[] { 0, 45, 68, 32, 15 };
		System.out.println(getIndex(arr, 68));
	}

	public static int getIndex(int[] arr, int value) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				return i;
			}
		}
		return -1;
	}
}
