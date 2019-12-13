package com.demo.leetcode.stack;

import java.util.HashMap;
import java.util.Stack;

public class Demo0020 {

	public static void main(String[] args) {
		String s = "()";
		System.out.println(isValid(s));
	}
	
	public static boolean isValid(String s) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("(", ")");
		map.put("[", "]");
		map.put("{", "}");
		
		Stack<String> stack = new Stack<String>();
		for (int i = 0; i < s.length(); i++) {
			if(!stack.isEmpty() && String.valueOf(s.charAt(i)).equals(map.get(stack.peek()))) {
				stack.pop();
			}else {
				stack.push(String.valueOf(s.charAt(i)));
			}
		}
		return stack.isEmpty();
	}
	     
}
