package com.demo.leetcode.all;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * @author xingwuzhao
 *
 */
public class Demo0003 {

	public static void main(String[] args) {
		int x = 10201;
		System.out.println(isPalindrome(x));
		System.out.println(isPalindrome2(x));
		System.out.println(isPalindrome3(x));
	}
	
	public static boolean isPalindrome(int x) {
		char[] ch = String.valueOf(x).toCharArray();
		StringBuffer sb = new StringBuffer("");
		for (int i = ch.length - 1; i >= 0 ; i--) {
			sb.append(ch[i]);
		}
		try {
			int x2 = Integer.parseInt(sb.toString());
			if(x == x2) {
				return true;
			}
		} catch (Exception e) {
			return false;
		}
		
        return false;
    }
	
	public static boolean isPalindrome2(int x) {
		if(x<0) {
			return false;
		}
		StringBuffer sb = new StringBuffer(String.valueOf(x));
	    return sb.toString().equals(sb.reverse().toString());
    }
	
	public static boolean isPalindrome3(int x) {
		if(x<0) {
			return false;
		}
		int div = 1;
		while(x / div >= 10) {
			div *= 10;
		}
		while(x > 0) {
			int left = x / div;
			int right = x % 10;
			if(left != right) {
				return false;
			}
			// 去除首位 相当于 根据div取余，去掉末尾相当于除以10
			x = (x % div) / 10;
			// 去除首位 相当于少了两位
			div /= 100;
		}
		return true;
    }
}
