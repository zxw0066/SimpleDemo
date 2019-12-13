package com.demo.leetcode.stack;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 队列实现栈
 * 队列先进先出，栈先进后出
 * @author zhaoxingwu
 *
 */
public class Demo0225 {
	
	// 缓存
	Queue<Integer> q1 = null;
	// 实际
	Queue<Integer> q2 = null;

	public Demo0225() {
		q1 = new LinkedList<Integer>();
		q2 = new LinkedList<Integer>();
	}

	public void push(int x) {
		q1.add(x);
		while(!q2.isEmpty()) {
			q1.add(q2.poll());
		}
		while(!q1.isEmpty()) {
			q2.add(q1.poll());
		}
	}

	public int pop() {
		return q2.poll();
	}

	public int top() {
		return q2.peek();
	}

	public boolean empty() {
		return q2.isEmpty();
	}
}
