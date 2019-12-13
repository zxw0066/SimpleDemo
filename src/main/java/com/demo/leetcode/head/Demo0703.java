package com.demo.leetcode.head;

import java.util.PriorityQueue;
import java.util.Queue;

public class Demo0703 {
	
	public static void main(String[] args) {
		int k = 2;
		int[] nums = new int[] {4,5,8,2};
		Demo0703 demo0703 = new Demo0703(k, nums);
		System.out.println(demo0703.add(3));	// returns 4
		System.out.println(demo0703.add(5));	// returns 5
		System.out.println(demo0703.add(10));	// returns 5
		System.out.println(demo0703.add(9));	// returns 8
		System.out.println(demo0703.add(4));	// returns 8
	}
	
	private Queue<Integer> queue = null;
	private int limit;
	
	public Demo0703(int k, int[] nums) {
		limit = k;
		queue = new PriorityQueue<Integer>(k);
		for (int i = 0; i < nums.length; i++) {
			add(nums[i]);
		}
    }
    
    public int add(int val) {
    	if(queue.size() < limit) {
    		queue.add(val);
    	} else if(queue.peek() < val){
    		queue.poll();
    		queue.add(val);
    	}
        return queue.peek();
    }
}
