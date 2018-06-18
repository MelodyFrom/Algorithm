package com.gaop.demo.leetcode.string;

/**
 * @description 	
 * 	��һ�ֽⷨ���ں˶Դ�֮ǰ�Լ��Ľⷨ��������ת��Ϊһ�� char ���飬Ȼ���������ڷ�ת�ַ����ķ�ʽ������ <br>
 * 	�ڶ��ֽⷨ��Ч�ʸ��ߵķ�ʽ��ֱ���� int ��ֵ�ϲ�����ע����� while ѭ�������ϵض�ԭ��ֵȡ��Ͷ��µ���ֵ����10��������ֵ�ķ�ת��ע�����������ʹ�õ���long�����Ա���
 * ���� int ֵ���޲�������ĳ������ڷ�ת��ɺ����ж������ת�����ֵ�ǲ����Ѿ������� int ֵ�������ޡ�
 * @author gaop
 * @date 2018��6��18�� ����10:38:35
 */
public class ReverseInteger {

	
//    public static int reverse(int x) {
//    	if(Integer.MIN_VALUE == x)
//    		return 0;
//    	Integer number = new Integer(x);
//    	boolean negetiveFlag = false;
//    	if(number < 0) {
//    		number = -number;
//    		negetiveFlag = true;
//    	}
//    		
//    	char[] numberArray = number.toString().toCharArray();
//    	for (int i = 0; i < numberArray.length / 2; i++) {
//			char temp = numberArray[i];
//			numberArray[i] = numberArray[numberArray.length - 1 - i];
//			numberArray[numberArray.length - 1 - i] = temp;
//		}
//    	try {
//	    	if(negetiveFlag)
//	    		return -Integer.parseInt(new String(numberArray));
//			return Integer.parseInt(new String(numberArray));			
//		} catch (NumberFormatException e) {
//			return 0;
//		}
//    }
	
    public static int reverse(int x) {
    	if(0 == x)
    		return 0;
    	boolean negetive = x < 0;
    	if(negetive)
    		x = -x;
    	long ans = 0;
    	while (x > 0) {
    		ans = ans*10 + x%10;
    		x /= 10;
		}
    	if(negetive)
    		ans = -ans;
    	if(Integer.MIN_VALUE <= ans && ans <= Integer.MAX_VALUE)
    		return (int)ans;
    	return 0;
    }
	
	public static void main(String[] args) {
		int n1 = 1534236469;
		System.out.println(reverse(n1));
		
		int n2 = 321;
		System.out.println(reverse(n2));
	}
}
