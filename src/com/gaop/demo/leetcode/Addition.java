package com.gaop.demo.leetcode;

/**
 * @description 	
 * 	��һ������һ�������ʾһ���Ǹ���������������[1, 2, 3]����ʾһ������123.����������ֵ��һ�����ء� <br>
 * 	ʾ��:[1,2]�õ�[1,3]; [9,9]�õ�[1, 0, 0]  <br>
 * 	�뵽�����ֽ���˼·�� <br>
 * 		1. ������ת��Ϊһ��ʵ�ʵ���������Ȼ�����������ִ�м�һ��������ת��Ϊһ�����鷵�ء��������Ա��ⷱ���Ľ�λ�жϡ� <br>
 * 		2. ��һ��ѭ���ڣ��ӵ�λ����λ����ж���ֵ�����С�� 9�����һ��ֱ�ӷ��أ�������� 9���򽫸��±�λ�õ���ֵ��Ϊ 0��Ȼ����������жϡ�ѭ�������󣬼��������Ԫ�ص�ֵ
 * 	�Ƿ��� 0������� 0 �Ļ������������Ļ���������һλ��������λ����һλ 1��
 * @author gaop
 * @date 2018��5��3�� ����10:28:50
 */
public class Addition {

	public static void main(String[] args) {
		int[] num123 = new int[]{1, 2, 3};
		plusOne(num123);
		int[] problem = new int[]{9};
		plusOne(problem);
	}
	
    public static int[] plusOne(int[] digits) {
    	if(digits[digits.length - 1] < 9)
    	{
    		digits[digits.length - 1]++;
    		return digits;
    	}
    	int number = digits.length - 1;
    	while(number >= 0)
    	{
    		if(digits[number] < 9)
    		{
    			digits[number]++;
    			return digits;
    		} else {
    			digits[number] = 0;
    		}
    		number--;
    	}
    	if (digits[0] == 0) {
			int[] newDigits = new int[digits.length + 1];
			newDigits[0] = 1;
			for (int i = 0; i < digits.length; i++) {
				newDigits[i + 1] = digits[i];
			}
			return newDigits;
		}
    	return digits;
    }
	
//    public static int[] plusOne(int[] digits) {
//    	if(digits[digits.length - 1] < 9)
//    	{
//    		digits[digits.length - 1]++;
//    		return digits;
//    	}
//    	/* other way: translate the array to a number, and get the answer of plus */
//    	double number = 0;
//    	int place = 1;
//    	for (int i = digits.length - 1; i >= 0; i--) {
//    		number =+ digits[i]*Math.pow(10, place);
//    		place++;
//		}
//    	int answer = (int) number++;
//    	// translate the answer again
//    	List<Integer> list = new ArrayList<>();
//    	String result = "" + answer;
//    	for (int i = 0; i < digits.length; i++) {
//    		int j = Character.getNumericValue(result.charAt(i));
//    		list.add(j);
//		}
//    	// translate list into array
//    	System.out.println(list);
//    	int[] arg = new int[list.size()];
//    	for (int i = 0; i < arg.length; i++) {
//			arg[i] = list.get(i);
//		}
//    	return arg;
//    }
}
