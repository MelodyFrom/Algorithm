package com.gaop.demo.leetcode;

/**
 * @description 	
 * 	加一，给定一个数组表示一个非负整数，比如数组[1, 2, 3]即表示一个整数123.将这个数组的值加一并返回。 <br>
 * 	示例:[1,2]得到[1,3]; [9,9]得到[1, 0, 0]  <br>
 * 	想到了两种解题思路： <br>
 * 		1. 将数组转换为一个实际的正整数，然后将这个正整数执行加一操作后再转换为一个数组返回。这样可以避免繁琐的进位判断。 <br>
 * 		2. 在一个循环内，从低位到高位逐个判断数值，如果小于 9，则加一后直接返回；如果等于 9，则将该下标位置的数值置为 0。然后继续往后判断。循环结束后，检查数组首元素的值
 * 	是否是 0，如果是 0 的话就在这个数组的基础上新增一位，即在首位新增一位 1。
 * @author gaop
 * @date 2018年5月3日 下午10:28:50
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
