package com.demo.sort;

/**
 * ϣ������ gap+ֱ�Ӳ������� 
 * ʱ�临�Ӷȣ�O(nlogn)
 * 
 * @author zhaoxingwu
 *
 */
public class ShellSortTest {
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
		int gap = arr.length / 2;
		while (gap >= 1) {
			for (int i = gap; i < arr.length; i++) {
				int j = 0;
				int temp = arr[i];
				for (j = i - gap; j >= 0 && temp < arr[j]; j = j - gap) {
					arr[j + gap] = arr[j];
				}
				arr[j + gap] = temp;
			}
			gap = gap / 2;
		}
	}
}
