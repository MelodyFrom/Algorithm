package com.gaop.demo.leetcode.string;

import java.util.HashSet;
import java.util.Set;

/**
 * @description 	
 * 	�ַ����еĵ�һ��Ψһ�ַ�������һ���ַ������ҵ����ĵ�һ�����ظ����ַ���������������������������򷵻� -1
 * @author gaop
 * @date 2018��5��6�� ����9:05:00
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
//					System.out.println("�±�" + i + " ���±� " + j + " �ظ�");
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
				// ѭ������û�з����ظ����ַ�
				return i;
			}
		}
    	return -1;
    }
}
