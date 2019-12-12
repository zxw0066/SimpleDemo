package com.demo.leetcode.all;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
示例:
给定 nums = [2, 7, 11, 15], target = 9
因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]
 * @author xingwuzhao
 *
 */
public class Demo0001 {

	public static void main(String[] args) {
		int []nums = new int[] {2, 7, 11, 15};
		int target = 17;
		int[] ret = twoSum(nums, target);
		for (int i = 0; i < ret.length; i++) {
			System.out.print(ret[i] + ",");
		}
		System.out.println();
		int[] ret2 = twoSum2(nums, target);
		for (int i = 0; i < ret2.length; i++) {
			System.out.print(ret2[i] + ",");
		}
		System.out.println();
		int[] ret3 = twoSum3(nums, target);
		for (int i = 0; i < ret3.length; i++) {
			System.out.print(ret3[i] + ",");
		}
	}
	
	// 暴力法
	public static int[] twoSum(int[] nums, int target) {
        for(int i = 0;i<nums.length;i++){
            int num = nums[i];
            for(int j = i + 1;j<nums.length;j++){
                if(num + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
		return nums;
    }
	
	// 两次hash
	public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
        	hash.put(nums[i], i);
		}
        for (int i = 0; i < nums.length; i++) {
			int count = target - nums[i];
			if(hash.containsKey(count) && hash.get(count) != i) {
				return new int[] {i,hash.get(count)};
			}
		}
		return nums;
    }
	
	// 一次hash
	public static int[] twoSum3(int[] nums, int target) {
        Map<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
			int count = target - nums[i];
			if(hash.containsKey(count)) {
				return new int[] {i,hash.get(count)};
			}
			hash.put(nums[i], i);
		}
		return nums;
    }
}
