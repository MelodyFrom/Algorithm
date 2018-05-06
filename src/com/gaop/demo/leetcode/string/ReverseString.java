package com.gaop.demo.leetcode.string;

/**
 * @description 	
 * 	��ת�ַ�������дһ�������������ǽ�������ַ�����ת���� <br>
 * 	�����������ĽⷨӦ���Ƕ��ֶ��������ø�������  jdk Ӧ�ö��з������ҵ�˼·����һ��ѭ������ɷ�ת����������ʹ�ø��ӵķ������ڡ�����㼶���Ĳ�������ȡ�ٶȻ���졣
 * @author gaop
 * @date 2018��5��6�� ����8:32:10
 */
public class ReverseString {
	
	public static void main(String[] args) {
		String hello = new String("hello");
		System.out.println(reverseString(hello));
	}
	
	/* ��������ת��Ϊ�����һ�� for ѭ��������ʵ�������ַ���ת��Ϊ���������ܻ�ò��٣��������һ�����õĴ𰸣�����һ��ֵ��ע��ĵ� */
	public static String reverseString(String s) {
		char[] sArg = s.toCharArray();
		for (int i = 0; i < sArg.length / 2; i++) {
			char temp = sArg[i];
			sArg[i] = sArg[sArg.length - i - 1];
			sArg[sArg.length - i - 1] = temp;
		}
    	return new String(sArg);
    }
	
	/* ����һ������ StringBuilder ��ɷ�ת */
//    public static String reverseString(String s) {
//    	StringBuilder sb = new StringBuilder();
//    	for (int i = s.length() - 1; i >= 0; i--) {
//			sb.append(s.charAt(i));
//		}
//    	return sb.toString();
//    }
}
