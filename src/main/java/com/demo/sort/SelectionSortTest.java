package com.demo.sort;

/**
 * 简单选择排序
 * 时间复杂度：O(n2)
 * 冒泡排序跟直接选择排序都是依次比较相邻的记录，但是冒泡排序是一有反序立即交换，而直接插入排序则是出现反序将最小值记录下来，最后再发生交换
 * @author zhaoxingwu
 *
 */
public class SelectionSortTest {

	public static void main(String[] args) {
		int[] arr = new int[] { 22, 66, 44, 11, 55, 88, 77, 99, 33 };
		System.out.println("排序前：");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		sort(arr);
		System.out.println();
		System.out.println("排序后：");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
	}
	
	public static void sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int index = i;
			int temp;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[index] > arr[j]) {
					index = j;
				}
			}
			temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
		}
	}
}
