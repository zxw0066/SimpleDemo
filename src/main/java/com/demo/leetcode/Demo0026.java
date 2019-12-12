package com.demo.leetcode;

/**
 * 连分数
 * @author zhaoxingwu
 *
 */
public class Demo0026 {

	public static void main(String[] args) {
		String str = "Hello";
		System.out.println(toLowerCase(str));
	}
	 
	public static String toLowerCase(String str) {
		char[] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
			ch[i] = (char)(str.charAt(i) | ' ');
		}
        return String.valueOf(ch);
    }
}
