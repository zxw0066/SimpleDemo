package com.demo.search;

import java.util.ArrayList;

/**
 * 分块查找
 * 二分查找+顺序查找
 * @author zhaoxingwu
 *
 */
public class BlockSearchTest {

	private int[] index;// 建立索引
	private ArrayList[] list;

	/**
	 * 初始化索引
	 * 
	 * @param index
	 */
	public BlockSearchTest(int[] index) {
		if (null != index && index.length != 0) {
			this.index = index;
			this.list = new ArrayList[index.length];
			for (int i = 0; i < list.length; i++) {
				list[i] = new ArrayList();// 初始化容器
			}
		} else {
			throw new Error("index cannot be null or empty");
		}
	}

	/**
	 * 插入索引
	 * 
	 * @param value
	 */
	public void insert(int value) {
		int i = binarySearch(value);
		list[i].add(value);
	}

	private int binarySearch(int value) {
		int start = 0;
		int end = index.length - 1;
		while (start <= end) {
			int mid = start + ((end - start) >>> 1);
			if (index[mid] > value) {
				end = mid - 1;
			} else {
				// 如果相等，也插入后面
				start = mid + 1;
			}
		}
		return start;
	}

	public boolean search(int data) {
		int i = binarySearch(data);
		for (int j = 0; j < list[i].size(); j++) {
			if (data == (int) list[i].get(j)) {
				System.out.println(String.format("查找元素为第: %d块 ，第%d个 元素", i + 1, j + 1));
				return true;
			}
		}
		return false;
	}

	/**
	 * 打印
	 */
	public void printAll() {
		for (int i = 0; i < list.length; i++) {
			ArrayList l = list[i];
			System.out.println("ArrayList[" + i + "]:");

			for (int j = 0; j < l.size(); j++) {
				System.out.print(l.get(j) + ",");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[] index = { 10, 20, 30 };
		BlockSearchTest blocksearch = new BlockSearchTest(index);
		blocksearch.insert(1);
		blocksearch.insert(11);
		blocksearch.insert(21);

		blocksearch.insert(2);
		blocksearch.insert(12);
		blocksearch.insert(22);

		blocksearch.insert(5);
		blocksearch.insert(15);
		blocksearch.insert(25);

		blocksearch.printAll(); 
		
		System.out.println("查找值15，结果：" + blocksearch.search(15));
		System.out.println("查找值29  ，结果：" + blocksearch.search(29));
	}
}
