package com.demo.leetcode.all;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 使用栈实现队列的下列操作：

push(x) -- 将一个元素放入队列的尾部。
pop() -- 从队列首部移除元素。
peek() -- 返回队列首部的元素。
empty() -- 返回队列是否为空。
示例:

MyQueue queue = new MyQueue();

queue.push(1);
queue.push(2);  
queue.peek();  // 返回 1
queue.pop();   // 返回 1
queue.empty(); // 返回 false
说明:

你只能使用标准的栈操作 -- 也就是只有 push to top, peek/pop from top, size, 和 is empty 操作是合法的。
你所使用的语言也许不支持栈。你可以使用 list 或者 deque（双端队列）来模拟一个栈，只要是标准的栈操作即可。
假设所有操作都是有效的 （例如，一个空的队列不会调用 pop 或者 peek 操作）。
 * @author zhaoxingwu
 *
 */
public class Demo0032 {
	
	// 用于临时存储
	private Stack<Integer> s1 = null;
	// 主要维护次stack
	private Stack<Integer> s2 = null;

	/** Initialize your data structure here. */
    public Demo0032() {
    	s1 = new Stack<Integer>();
    	s2 = new Stack<Integer>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        while(!s2.isEmpty()) {
        	s1.push(s2.pop());
        }
        s1.push(x);
        while(!s1.isEmpty()) {
        	s2.push(s1.pop());
        }
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return s2.pop();
    }
    
    /** Get the front element. */
    public int peek() {
    	return s2.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
    	return s2.isEmpty();
    }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
}
