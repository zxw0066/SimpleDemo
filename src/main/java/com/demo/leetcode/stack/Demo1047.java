package com.demo.leetcode.stack;

import java.util.Stack;

public class Demo1047 {

	public static void main(String[] args) {
		String S = "abbaca";
		System.out.println(removeDuplicates(S));
	}
	
	public static String removeDuplicates(String S) {
		Stack<String> stack = new Stack<>();
		for (int i = 0; i < S.length(); i++) {
			if(!stack.isEmpty() && stack.peek().equals(String.valueOf(S.charAt(i)))) {
				stack.pop();
			}else {
				stack.push(String.valueOf(S.charAt(i)));
			}
		}
		StringBuffer sb = new StringBuffer();
		for (String string : stack) {
			sb.append(string);
		}
		return sb.toString();
    }
}
