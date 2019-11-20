package com.demo.sort;

/**
 * 快速排序
 * 平均时间复杂度：O(n*log2n)
 * @author zhaoxingwu
 *
 */
public class QuickSortTest {

	public static void main(String[] args) {
		int[] arr = new int[] { 22, 66, 44, 11, 55, 88, 77, 99, 33 };
		System.out.println("排序前：");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
		sort(arr, 0, arr.length - 1);
		System.out.println();
		System.out.println("排序后：");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ",");
		}
	}

	public static void sort(int[] arr, int low, int high) {
		if(low < high) {
			int index = getIndex(arr, low, high);
			// 分别对分割点左右两个数据递归排序
			sort(arr, low, index - 1);
			sort(arr, index + 1, high);
		}
	}
	
	public static int getIndex(int[] arr, int low, int high) {
		int temp = arr[low];
		while(low < high) {
			// 当队尾的元素大于等于基准数据时,向前挪动high指针
			while(low < high && temp <= arr[high]) {
				high--;
			}
			arr[low] = arr[high];
			// 当队首元素小于等于tmp时,向前挪动low指针
			while(low < high && temp >= arr[low]) {
				low++;
			}
			arr[high] = arr[low];
		}
		arr[low] = temp;
		return low;
	}
}
