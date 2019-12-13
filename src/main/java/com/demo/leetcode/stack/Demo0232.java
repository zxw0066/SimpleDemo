package com.demo.leetcode.stack;

import java.util.Stack;

/**
 * 栈实现队列
 * 栈先进后出，队列先进先出
 * @author zhaoxingwu
 *
 */
public class Demo0232 {
	
	Stack<Integer> s1 = null;
	Stack<Integer> s2 = null;
	
    public Demo0232() {
    	s1 = new Stack<Integer>();
    	s2 = new Stack<Integer>();
    }
    
    public void push(int x) {
    	while(!s2.isEmpty()) {
    		s1.push(s2.pop());
    	}
    	s1.push(x);
    	while(!s1.isEmpty()) {
    		s2.push(s1.pop());
    	}
    }
    
    public int pop() {
    	return s2.pop();
    }
    
    public int peek() {
    	return s2.peek();
    }
    
    public boolean empty() {
    	return s2.isEmpty();
    }
}
