package com.demo.leetcode.stack;

import java.util.Stack;

public class Demo1021 {

	public static void main(String[] args) {
		String S = "(()())(())";
		System.out.println(removeOuterParentheses(S));
	}
	
	public static String removeOuterParentheses(String S) {
		StringBuffer sb = new StringBuffer();
		Stack<String> s1 = new Stack<>();
		int n = 0;
		for (int i = 0; i < S.length(); i++) {
			if(!s1.isEmpty() && !s1.peek().equals(String.valueOf(S.charAt(i)))) {
				s1.pop();
			}else {
				s1.push(String.valueOf(S.charAt(i)));
			}
			if(s1.isEmpty()) {
				sb.append(S.substring(n + 1, i));
				n = i + 1;
			}
		}
		if(s1.size() != 0) {
			return "";
		}
		return sb.toString();
        
    }
}
