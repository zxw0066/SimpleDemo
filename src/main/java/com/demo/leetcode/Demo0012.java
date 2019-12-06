package com.demo.leetcode;

/**
 * 报数序列是一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：

1.     1
2.     11
3.     21
4.     1211
5.     111221
1 被读作  "one 1"  ("一个一") , 即 11。
11 被读作 "two 1s" ("两个一"）, 即 21。
21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。

给定一个正整数 n（1 ≤ n ≤ 30），输出报数序列的第 n 项。

注意：整数顺序将表示为一个字符串。

示例 1:

输入: 1
输出: "1"
示例 2:

输入: 4
输出: "1211"

*******相邻的字符是否相等，相等的话进行统计，不相等的话直接添加。******
 * @author zhaoxingwu
 *
 */
public class Demo0012 {

	public static void main(String[] args) {
		System.out.println(countAndSay(5));
	}
	
	public static String countAndSay(int n) {
		String s = "1";
		for (int i = 2; i <= n; i++) {
			int count = 1;
			StringBuffer sb = new StringBuffer();
			char pre = s.charAt(0);
			for (int j = 1; j < s.length(); j++) {
				char c = s.charAt(j);
				if(c == pre) {
					count++;
				}else {
					sb.append(count).append(pre);
					pre = c;
					count = 1;
				}
			}
			sb.append(count).append(pre);
			s = sb.toString();
		}
		return s;
	}
}
