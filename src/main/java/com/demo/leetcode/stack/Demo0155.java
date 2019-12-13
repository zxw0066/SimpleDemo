package com.demo.leetcode.stack;

import java.util.Stack;

public class Demo0155 {

	private Stack<Integer> s1 = null;
	
	public Demo0155() {
        s1 = new Stack<Integer>();
    }
    
    public void push(int x) {
        s1.push(x);
    }
    
    public void pop() {
        s1.pop();
    }
    
    public int top() {
        return s1.peek();
    }
    
    public int getMin() {
    	int ans = Integer.MAX_VALUE;
    	for (Integer s : s1) {
			if(ans > s) {
				ans = s;
			}
		}
        return ans;
    }
}
