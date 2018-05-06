package com.gaop.demo.leetcode.string;

/**
 * @description 	
 * 	反转字符串：编写一个函数，功能是将输入的字符串反转过来 <br>
 * 	解析：这个题的解法应该是多种多样，利用各种已有  jdk 应该都有方法。我的思路是在一次循环内完成反转，尽量的少使用附加的方法。在“数组层级”的操作，获取速度会更快。
 * @author gaop
 * @date 2018年5月6日 下午8:32:10
 */
public class ReverseString {
	
	public static void main(String[] args) {
		String hello = new String("hello");
		System.out.println(reverseString(hello));
	}
	
	/* 方法二：转换为数组的一次 for 循环处理，事实表明将字符串转换为数组后的性能会好不少，因此这是一个更好的答案，这是一个值得注意的点 */
	public static String reverseString(String s) {
		char[] sArg = s.toCharArray();
		for (int i = 0; i < sArg.length / 2; i++) {
			char temp = sArg[i];
			sArg[i] = sArg[sArg.length - i - 1];
			sArg[sArg.length - i - 1] = temp;
		}
    	return new String(sArg);
    }
	
	/* 方法一：利用 StringBuilder 完成反转 */
//    public static String reverseString(String s) {
//    	StringBuilder sb = new StringBuilder();
//    	for (int i = s.length() - 1; i >= 0; i--) {
//			sb.append(s.charAt(i));
//		}
//    	return sb.toString();
//    }
}
