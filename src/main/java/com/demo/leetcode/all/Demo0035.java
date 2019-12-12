package com.demo.leetcode.all;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

/**
 * 给定 S 和 T 两个字符串，当它们分别被输入到空白的文本编辑器后，判断二者是否相等，并返回结果。 # 代表退格字符。

 

示例 1：

输入：S = "ab#c", T = "ad#c"
输出：true
解释：S 和 T 都会变成 “ac”。
示例 2：

输入：S = "ab##", T = "c#d#"
输出：true
解释：S 和 T 都会变成 “”。
示例 3：

输入：S = "a##c", T = "#a#c"
输出：true
解释：S 和 T 都会变成 “c”。
示例 4：

输入：S = "a#c", T = "b"
输出：false
解释：S 会变成 “c”，但 T 仍然是 “b”。
 

提示：

1 <= S.length <= 200
1 <= T.length <= 200
S 和 T 只含有小写字母以及字符 '#'。
 * @author zhaoxingwu
 *
 */
public class Demo0035 {
	
	public static void main(String[] args) {
		String S = "y#fo##f";
		String T = "y#f#o##f";
		System.out.println(backspaceCompare(S, T));
	}
	
	public static boolean backspaceCompare(String S, String T) {
		Stack<String> s1 = new Stack<String>();
		for (int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i);
			if(!s1.isEmpty() && "#".equals(String.valueOf(ch))) {
				s1.pop();
			}else {
				if("#".equals(String.valueOf(ch))) {
					continue;
				}
				s1.push(String.valueOf(ch));
			}
		}
		
		Stack<String> s2 = new Stack<String>();
		for (int i = 0; i < T.length(); i++) {
			char ch = T.charAt(i);
			if(!s2.isEmpty() && "#".equals(String.valueOf(ch))) {
				s2.pop();
			}else {
				if("#".equals(String.valueOf(ch))) {
					continue;
				}
				s2.push(String.valueOf(ch));
			}
		}
		if(s1.size() == s2.size()) {
			while(!s2.isEmpty()) {
				if(!s2.pop().equals(s1.pop())) {
					return false;
				}
			}
		}else {
			return false;
		}
		return true;
    }
}
