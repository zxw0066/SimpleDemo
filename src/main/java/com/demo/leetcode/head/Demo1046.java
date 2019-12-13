package com.demo.leetcode.head;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Demo1046 {

	public static void main(String[] args) {
		int[] stones = new int[] {2,7,4,1,8,1};
		System.out.println(lastStoneWeight(stones));
	}
	
	public static int lastStoneWeight(int[] stones) {
		// 使用优先对列保证每次能拿到最大的数
		Queue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return (o2-o1);
			}
		});
		for (int i = 0; i < stones.length; i++) {
			queue.offer(stones[i]);
		}
		while(queue.size() > 1) {
			int num1 = queue.poll();
			int num2 = queue.poll();
			int diff = Math.abs(num1-num2);
			if(diff != 0) {
				queue.offer(diff);
			}
		}
		if (queue.isEmpty()) {
			return 0;
		}
		return queue.peek();
    }
}
