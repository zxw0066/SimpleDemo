package com.sort;

public class InsertTest {

	public static void main(String[] args) {
		int[] arr = new int[] { 22, 66, 44, 11, 55, 88, 77, 99, 33 };
		System.out.println("����ǰ��");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		sort(arr);
		System.out.println();
		System.out.println("�����");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
	}

	public static void sort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int j = 0;
			int temp = arr[i];
			for (j = i - 1; j >= 0 && temp < arr[j];j--) {
				arr[j+1]=arr[j];
			}
			arr[j+1]=temp;
		}
	}
}
