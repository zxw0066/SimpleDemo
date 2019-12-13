package com.demo.leetcode.stack;

import java.util.Stack;

public class Demo0844 {

	public static void main(String[] args) {
		String S = "xywrrmp";
		String T = "xywrrmu#p";
		System.out.println(backspaceCompare(S, T));
	}

	public static boolean backspaceCompare(String S, String T) {
		Stack<String> stack1 = new Stack<>();
		for (int i = 0; i < S.length(); i++) {
			if(!stack1.isEmpty() && "#".equals(String.valueOf(S.charAt(i)))) {
				stack1.pop();
			}else {
				if("#".equals(String.valueOf(S.charAt(i)))) {
					continue;
				}
				stack1.push(String.valueOf(S.charAt(i)));
			}
		}
		Stack<String> stack2 = new Stack<>();
		for (int i = 0; i < T.length(); i++) {
			if(!stack2.isEmpty() && "#".equals(String.valueOf(T.charAt(i)))) {
				stack2.pop();
			}else {
				if("#".equals(String.valueOf(T.charAt(i)))) {
					continue;
				}
				stack2.push(String.valueOf(T.charAt(i)));
			}
		}
		if(stack1.size() != stack2.size()) {
			return false;
		}
		while(!stack1.isEmpty()) {
			if(!stack1.pop().equals(stack2.pop())) {
				return false;
			}
		}
		return true;
    }
}
