package com.gaop.recursion;

/**
 * 递归到非递归的转换--阶乘函数也可以使用非递归的思路来实现
 *  直接求值，不需要回溯的问题可以使用中间变量来保存中间结果--直接转换法
 * @author gaopeng@doctorwork.com
 * @date 2019-01-16 22:33
 **/
public class Factorial2 {

    public static int factorial(int n) {
        int temp = 1;//用于保存中间值的中间变量
        for (int i = 2; i <= n; i++) {// i = 2 巧妙避开了入参为 0 和 1 情况，这两种情况的阶乘值均为1。
            temp = i * temp;
        }
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(factorial(0));
    }
}
