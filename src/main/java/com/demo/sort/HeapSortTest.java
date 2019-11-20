package com.demo.sort;

import java.util.Arrays;

/**
 * ������
 * ƽ��ʱ�临�Ӷȣ�O(n*log2n)
 * 
 * @author zhaoxingwu
 *
 */
public class HeapSortTest {

	public void heapAdjust(int[] arr, int parent, int length) {
		// �ȱ��游����ֵ���Ա�����ƶ�����
		int temp = arr[parent];
		// �Ȼ�ȡ���ø��������ӽ��
		int child = parent * 2 + 1;
		while (child < length) {
			// ����������ӽ�㣬�����ӽ��������ӽ�㣬��ѡȡ���ӽ��
			if (child + 1 < length && arr[child] < arr[child + 1]) {
				child++;
			}
			// �жϸ���㣨�������ֵ���Ƿ���ӽڵ��
			if (temp > arr[child]) {
				break;// �����󣬽�����ǰѭ��
			} else {
				// �˴�������ֱ�Ӳ��������˼��
				arr[parent] = arr[child];// ���ӽ���ֵ���Ǹ��ڵ��ֵ
				parent = child;
				child = child * 2 + 1;
			}
		}
		// ��ʱ�Ѿ��ҵ����ʵ�λ��,���������ֵ������ʵ�λ��
		arr[parent] = temp;
	}

	/**
	 * ������
	 * 
	 * @param list
	 */
	public void shellSort(int[] list) {
		// ѭ��������ʼ��,��ʼ�����Ϊ�����һ�룬����ȫ�������������µĸ���㣬
		// Ȼ��ݼ����������ϵ�������������ָ����������ʱ��������ӽڵ��Ѿ��Ƿ��϶ѹ��ɵ�
		// ѭ��������ʼ����
		for (int i = list.length / 2; i >= 0; i--) {
			heapAdjust(list, i, list.length);
		}
		// ����n-1��ѭ���������������������ѡ�������˼��
		for (int i = list.length - 1; i > 0; i--) {
			// �����ֵlist[0]�����һ��Ԫ�ؽ���
			int temp = list[i];
			list[i] = list[0];
			list[0] = temp;
			// ������֮�����ֵ�Ѿ��ڵײ������ĩβ��Ȼ�󽫽�����Ķѽ��е���
			heapAdjust(list, 0, i);// ע������ĳ����Ѿ�-1�ˣ����Զѵ������������һ��Ԫ��
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
