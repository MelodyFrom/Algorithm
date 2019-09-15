package com.gaop.demo.leetcode;

/**
 * 完美数：完美数指其约数之和（排除掉自身）等于自己的数字
 */
public class _507_perfectNumber {

    public static void main(String[] args) {
        int caseNum1 = 6;
        System.out.println(checkPerfectNumber(caseNum1));
        int caseNum2 = 28;
        System.out.println(checkPerfectNumber(caseNum2));
    }

    public static boolean checkPerfectNumber(int num) {
        // 排除掉 1，因为完美数不能包括这个数自身
        if (num == 1)
            return false;
        int count = 1;
        double sqrt =  Math.sqrt(num);
        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) {
                count += i;
                count = count + num / i;
            }
        }
        if (count == num)
            return true;
        return false;
    }
}
