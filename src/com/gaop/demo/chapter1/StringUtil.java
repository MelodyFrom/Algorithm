package com.gaop.demo.chapter1;

/**
 * @description
 * 	简单字符处理方法封装 	
 * @author gaop
 * @date 2017年6月25日 下午10:26:49
 */
public class StringUtil {
	
	/**
	 * 判断一个字符串是否是回文
	 * @return 如果是回文返回true;否则返回false
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
	 * 获取一个文件的文件名和扩展名
	 * @return 数组的第一个位置装载文件名,第二个位置装载的扩展属性名
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
	 * 检查一个字符串是否按照字母顺序排序
	 * @param targetStr 待检查的字符串
	 * @return 如果已经按照格式排序则返回true;否则返回false
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
