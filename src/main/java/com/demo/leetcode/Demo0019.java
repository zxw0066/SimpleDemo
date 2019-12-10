package com.demo.leetcode;

/**
 * 给你一个整数 n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。

示例 1：

输入：n = 234
输出：15 
解释：
各位数之积 = 2 * 3 * 4 = 24 
各位数之和 = 2 + 3 + 4 = 9 
结果 = 24 - 9 = 15
示例 2：

输入：n = 4421
输出：21
解释： 
各位数之积 = 4 * 4 * 2 * 1 = 32 
各位数之和 = 4 + 4 + 2 + 1 = 11 
结果 = 32 - 11 = 21
 

提示：

1 <= n <= 10^5
 * @author zhaoxingwu
 *
 */
public class Demo0019 {

	public static void main(String[] args) {
		int n = 234;
		System.out.println(subtractProductAndSum(n));
	}
	
	public static int subtractProductAndSum(int n) {
		String str = String.valueOf(n);
		int he = 0;
		int ji = 1;
		for (int i = 0; i < str.length(); i++) {
			he += Integer.parseInt(String.valueOf(str.charAt(i)));
			ji *= Integer.parseInt(String.valueOf(str.charAt(i)));
		}
		return ji-he;
    }
}
