package com.gaop.demo.chapter1;

/**
 * @description
 * 	���ַ���������װ 	
 * @author gaop
 * @date 2017��6��25�� ����10:26:49
 */
public class StringUtil {
	
	/**
	 * �ж�һ���ַ����Ƿ��ǻ���
	 * @return ����ǻ��ķ���true;���򷵻�false
	 */
	public static boolean isPalindrome(String targetStr){
		int length = targetStr.length();
		for(int i=0; i<length - 1; i++){
			if(targetStr.charAt(i) != targetStr.charAt(length-1-i)){
				return false;
			}
		}
		return true;
	}
	
	/**
	 * ��ȡһ���ļ����ļ�������չ��
	 * @return ����ĵ�һ��λ��װ���ļ���,�ڶ���λ��װ�ص���չ������
	 */
	public static String[] getFileProperty(String fileName){
		int dot = fileName.indexOf(".");
		String base = fileName.substring(0, dot);
		String extension = fileName.substring(dot+1);
		String[] result = new String[2];
		result[0] = base;
		result[1] = extension;
		return result;
	}
	
	/**
	 * ���һ���ַ����Ƿ�����ĸ˳������
	 * @param targetStr �������ַ���
	 * @return ����Ѿ����ո�ʽ�����򷵻�true;���򷵻�false
	 */
	public static boolean isSorted(String[] targetStr){
		for(int i=0; i < targetStr.length; i++){
			if(targetStr[i].compareTo(targetStr[i+1]) > 0){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		String testStr1 = "12321";
		String testStr2 = "1221";
		System.out.println(isPalindrome(testStr1));
		
		String fileName = "readme.txt";
		String[] result = getFileProperty(fileName);
		System.out.println(result[0] + " " + result[1]);
	}
}
