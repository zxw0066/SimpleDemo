package com.demo.leetcode.stack;

import java.util.HashMap;
import java.util.Stack;

public class Demo0496 {

	public static void main(String[] args) {
		int[] nums1 = new int[]{4,1,2};
		int[] nums2 = new int[]{1,3,4,2};
		nextGreaterElement(nums1, nums2);
	}
	
	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
		Stack<Integer> stack = new Stack<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		int[] res = new int[nums1.length];
		for (int i = 0; i < nums2.length; i++) {
			while(!stack.isEmpty() && nums2[i] > stack.peek()) {
				map.put(stack.pop(), nums2[i]);
			}
			stack.push(nums2[i]);
		}
		while(!stack.isEmpty()) {
			map.put(stack.pop(), -1);
		}
		for (int i = 0; i < nums1.length; i++) {
			res[i] = map.get(nums1[i]);
		}
		return res;
    }

}
