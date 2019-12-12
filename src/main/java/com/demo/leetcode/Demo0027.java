package com.demo.leetcode;

/**
 * 连分数
 * @author zhaoxingwu
 *
 */
public class Demo0027 {

	public static void main(String[] args) {
		int[] cont = new int[] {3, 2, 0, 2};
		cont = fraction(cont);
		for (int i = 0; i < cont.length; i++) {
			System.out.println(cont[i]);
		}
	}
	 
	private static int[] recursive(int[] count, int index) {
        if (index == count.length - 1) {
            return new int[]{count[index], 1};
        }

        int[] nextRes = recursive(count, index+1);
        return new int[]{count[index] * nextRes[0] + nextRes[1], nextRes[0]};
    }

    public static int[] fraction(int[] cont) {
        return recursive(cont, 0);
    }
}
