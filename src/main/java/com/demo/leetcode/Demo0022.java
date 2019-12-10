package com.demo.leetcode;

import com.demo.leetcode.Demo0007.ListNode;

/**
 * 平面上有 n 个点，点的位置用整数坐标表示 points[i] = [xi, yi]。请你计算访问所有这些点需要的最小时间（以秒为单位）。

你可以按照下面的规则在平面上移动：

每一秒沿水平或者竖直方向移动一个单位长度，或者跨过对角线（可以看作在一秒内向水平和竖直方向各移动一个单位长度）。
必须按照数组中出现的顺序来访问这些点
 * @author zhaoxingwu
 *
 */
public class Demo0022 {

	public static void main(String[] args) {
		int[][] points = new int[][]{{1,1},{3,4},{-1,0}};
		System.out.println(minTimeToVisitAllPoints(points));
	}
	
	public static int minTimeToVisitAllPoints(int[][] points) {
		int result = 0;
        for(int i = 1; i < points.length; i++) {
            int[] n1 = points[i];
            int[] n2 = points[i - 1];
            int x = Math.abs(n1[0] - n2[0]);
            int y = Math.abs(n1[1] - n2[1]);
            int add = x > y ? x : y;
            result += add;
        }
        return result;
    }
}
