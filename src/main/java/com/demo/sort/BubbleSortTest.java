package com.demo.sort;

/**
 * √∞≈›≈≈–Ú
 *  ±º‰∏¥‘”∂»£∫ O(n2)
 * @author zhaoxingwu
 *
 */
public class BubbleSortTest {

	public static void main(String[] args) {
		int[] arr = new int[] { 22, 66, 44, 11, 55, 88, 77, 99, 33 };
		System.out.println("≈≈–Ú«∞£∫");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		sort(arr);
		System.out.println();
		System.out.println("≈≈–Ú∫Û£∫");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
	}

	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int temp;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}
}
