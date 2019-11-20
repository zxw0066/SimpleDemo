package com.demo.sort;

import java.util.Arrays;

/**
 * 堆排序
 * 平均时间复杂度：O(n*log2n)
 * 
 * @author zhaoxingwu
 *
 */
public class HeapSortTest {

	public void heapAdjust(int[] arr, int parent, int length) {
		// 先保存父结点的值，以便后续移动交换
		int temp = arr[parent];
		// 先获取到该父结点的左子结点
		int child = parent * 2 + 1;
		while (child < length) {
			// 如果存在右子结点，且右子结点大于左子结点，则选取右子结点
			if (child + 1 < length && arr[child] < arr[child + 1]) {
				child++;
			}
			// 判断父结点（待插入的值）是否比子节点大
			if (temp > arr[child]) {
				break;// 父结点大，结束当前循环
			} else {
				// 此处类似与直接插入排序的思想
				arr[parent] = arr[child];// 将子结点的值覆盖父节点的值
				parent = child;
				child = child * 2 + 1;
			}
		}
		// 此时已经找到合适的位置,将待插入的值插入合适的位置
		arr[parent] = temp;
	}

	/**
	 * 堆排序
	 * 
	 * @param list
	 */
	public void shellSort(int[] list) {
		// 循环建立初始堆,初始父结点为数组的一半，即完全二叉树的最右下的父结点，
		// 然后递减，依次向上调整，这样任意指定父结点调整时，下面的子节点已经是符合堆规律的
		// 循环建立初始化堆
		for (int i = list.length / 2; i >= 0; i--) {
			heapAdjust(list, i, list.length);
		}
		// 进行n-1次循环，完成排序，这里类似于选择排序的思想
		for (int i = list.length - 1; i > 0; i--) {
			// 将最大值list[0]与最后一个元素交换
			int temp = list[i];
			list[i] = list[0];
			list[0] = temp;
			// 交换完之后，最大值已经在底层数组的末尾，然后将交换后的堆进行调整
			heapAdjust(list, 0, i);// 注意这里的长度已经-1了，所以堆调整不包含最后一个元素
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 6, 4, 9, 2, 3, 54, 1, 6, 166, 52, 6, 656, 54, 451, 6, 56 };
		System.out.println(Arrays.toString(arr));
		HeapSortTest heapSort = new HeapSortTest();
		heapSort.shellSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
