package com.demo.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

/**
 * 设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。

push(x) -- 将元素 x 推入栈中。
pop() -- 删除栈顶的元素。
top() -- 获取栈顶元素。
getMin() -- 检索栈中的最小元素。
示例:

MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> 返回 -3.
minStack.pop();
minStack.top();      --> 返回 0.
minStack.getMin();   --> 返回 -2.
 * @author zhaoxingwu
 *
 */
public class Demo0034 {
	
	private Stack<Integer> s1 = null;
	private Stack<Integer> minS = null;
	
	/** initialize your data structure here. */
    public Demo0034() {
        s1 = new Stack<Integer>();
        minS = new Stack<Integer>();
    }
    
    public void push(int x) {
    	s1.push(x);
    	if(minS.isEmpty() || x <= minS.peek()) {
    		minS.push(x);
    	}
    }
    
    public void pop() {
        if(s1.pop().intValue() == minS.peek().intValue()){
        	minS.pop();
        }
    }
    
    public int top() {
        return s1.peek();
    }
    
    public int getMin() {
		return minS.peek();
    }
}
