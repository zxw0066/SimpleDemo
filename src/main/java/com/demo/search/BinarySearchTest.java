package com.demo.search;

/**
 * ���ֲ��� ǰ������������� ʱ�临�Ӷ�ΪO(logn) kafkaʹ�ô��㷨���еײ��ѯ
 * 
 * @author zhaoxingwu
 *
 */
public class BinarySearchTest {

	public static void main(String[] args) {
		int[] arr = new int[] { 11, 22, 33, 44, 55, 66, 77 };
		System.out.println(getIndex(arr, 22));
		System.out.println(getIndex(arr, 55));
		System.out.println(getIndex(arr, 77));
	}

	public static int getIndex(int[] arr, int value) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = low + ((high - low) >>> 1);
			if (arr[mid] < value) {
				low = mid + 1;
			} else if (arr[mid] > value) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
		return 0;
	}

}
