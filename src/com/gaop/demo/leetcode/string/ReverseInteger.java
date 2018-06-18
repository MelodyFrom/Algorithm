package com.gaop.demo.leetcode.string;

/**
 * @description 	
 * 	第一种解法是在核对答案之前自己的解法，将数字转换为一个 char 数组，然后用类似于反转字符串的方式来处理。 <br>
 * 	第二种解法是效率更高的方式，直接在 int 数值上操作，注意这个 while 循环，不断地对原数值取余和对新的数值乘以10来进行数值的反转。注意这里的新数使用的是long，可以避免
 * 超过 int 值上限产生溢出的场景。在反转完成后再判断这个反转后的数值是不是已经超过了 int 值的上下限。
 * @author gaop
 * @date 2018年6月18日 上午10:38:35
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
