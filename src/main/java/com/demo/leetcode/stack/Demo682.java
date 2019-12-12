package com.demo.leetcode.stack;

import java.util.Stack;

public class Demo682 {

	public static void main(String[] args) {
		String[] ops = new String[] {"5","2","C","D","+"};
		System.out.println(calPoints(ops));
	}

	public static int calPoints(String[] ops) {
		Stack<Integer> stack = new Stack<>();
		for (String s : ops) {
			if("+".equals(s)) {
				int num1 = stack.pop();
				int num2 = stack.peek();
				stack.push(num1);
				stack.push(num1+num2);
			}else if("D".equals(s)) {
				int num1 = stack.peek();
				stack.push(num1*2);
			}else if("C".equals(s)) {
				stack.pop();
			}else {
				stack.push(Integer.parseInt(s));
			}
		}
		int ans = 0;
		for (Integer integer : stack) {
			ans+=integer;
		}
		return ans;
    }
}
