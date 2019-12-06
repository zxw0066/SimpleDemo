package com.demo.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * 
 * 有效字符串需满足：
 * 
 * 左括号必须用相同类型的右括号闭合。 左括号必须以正确的顺序闭合。 注意空字符串可被认为是有效字符串。
 * 
 * 示例 1:
 * 
 * 输入: "()" 输出: true 示例 2:
 * 
 * 输入: "()[]{}" 输出: true 示例 3:
 * 
 * 输入: "(]" 输出: false 示例 4:
 * 
 * 输入: "([)]" 输出: false 示例 5:
 * 
 * 输入: "{[]}" 输出: true
 * 
 * @author zhaoxingwu
 *
 */
public class Demo0006 {

	public static void main(String[] args) {
		String s = "()";
		System.out.println(isValid(s));
	}

	public static boolean isValid(String s) {
		
		Map<Character, Character> map = new HashMap<Character, Character>();
		map.put('(', ')');
		map.put('{', '}');
		map.put('[', ']');
		map.put('?', '?');
		
		// 第一位必须是左边
		if(s.length() > 0 && !map.containsKey(s.charAt(0))) {
			return false;
		}
		LinkedList<Character> stack = new LinkedList<Character>();
		stack.add('?');
		
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(map.containsKey(ch[i])) {
				stack.add(ch[i]);
			}else if(map.get(stack.removeLast()) != ch[i]){
				return false;
			}
		}
		return stack.size() == 1;
    }
}
