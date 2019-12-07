package com.demo.leetcode;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * @author xingwuzhao
 *
 */
public class Demo0002 {

	public static void main(String[] args) {
		int x = -123;
		System.out.println(reverse(x));
		System.out.println(reverse2(x));
	}
	
	// 单纯判断char[]
	public static int reverse(int x) {
        char[] ch = String.valueOf(x).toCharArray();
        StringBuffer sb = new StringBuffer();
        StringBuffer sbopt = new StringBuffer();
        for (int i = ch.length - 1; i >= 0; i--) {
        	if (String.valueOf(ch[0]).equals("0")) {
        		continue;
        	}
        	if (String.valueOf(ch[i]).equals("-")) {
        		sbopt.append("-");
        		continue;
        	}
        	
        	sb.append(ch[i]);
		}
        // 注意判断是否为空
        if(sbopt.toString().length() == 0 && sb.toString().length() == 0){
        	return 0;
        	
        }
        // 注意判断是否超过intger最大范围
        int res = 0;
        try {
        	res = Integer.valueOf(sbopt.toString() + sb.toString());
		} catch (Exception e) {
			res = 0;
		}
        return res;
    }
	
	// 利用数学方式
	public static int reverse2(int x) {
		try {
			boolean mark = false;
			int result = 0;
			if(x<0) {
				x = 0-x;
				mark = true;
			}
			StringBuffer sb = new StringBuffer(String.valueOf(x));
			String resultStr = sb.reverse().toString();
			result = Integer.valueOf(resultStr);
			if(mark) {
				return 0-result;
			}
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
}
