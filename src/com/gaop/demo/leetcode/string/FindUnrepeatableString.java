package com.gaop.demo.leetcode.string;

import java.util.HashSet;
import java.util.Set;

/**
 * @description 	
 * 	字符串中的第一个唯一字符：给定一个字符串，找到它的第一个不重复的字符并返回它的索引，如果不存在则返回 -1
 * @author gaop
 * @date 2018年5月6日 下午9:05:00
 */
public class FindUnrepeatableString {
	
	public static void main(String[] args) {
		String s1 = "leetcode"; // answer = 0
		System.out.println(firstUniqChar(s1));
		String s2 = "loveleetcode"; // answer = 2
		System.out.println(firstUniqChar(s2));
		String s3 = "cc"; // answer = -1
		System.out.println(firstUniqChar(s3));
		String s4 = "aadadaad"; // answer = -1
		System.out.println(firstUniqChar(s4));
		String s5= "aaadd"; // answer = -1
		System.out.println(firstUniqChar(s5));
	}

//    public static int firstUniqChar(String s) {
//    	boolean repeatFlag = false;
//    	char[] origin = s.toCharArray();
//    	if(origin.length == 1)
//    		return 0;
//    	Set<Integer> indexPool = new HashSet<>();
//    	for (int i = 0; i < origin.length - 1; i++) {
//    		if (indexPool.size() == origin.length)
//				return -1;
//			for (int j = i + 1; j <= origin.length - 1; j++) {
//				if (origin[i] == origin[j]) {
//					repeatFlag = true;
//					System.out.println("下标" + i + " 与下标 " + j + " 重复");
//					indexPool.add(i);
//					indexPool.add(j);
//					break;
//				}
//			}
//			if (!repeatFlag) {
//				return i;
//			}
//			repeatFlag = false;
//		}
//    	return -1;
//    }
	
    public static int firstUniqChar(String s) {
    	char[] strArg = s.toCharArray();
    	boolean flag = false;
    	for (int i = 0; i < strArg.length; i++) {
			Character content = strArg[i];
			for (int j = i + 1; j < strArg.length; j++) {
				if (content.equals(strArg[j])) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				// 循环下来没有发现重复的字符
				return i;
			}
		}
    	return -1;
    }
}
