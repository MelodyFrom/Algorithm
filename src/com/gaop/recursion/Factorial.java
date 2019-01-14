package com.gaop.recursion;

/**
 * 阶乘的递归实现--阶乘是一个应用递归思想的最典型场景
 * @author gaopeng@doctorwork.com
 * @date 2019-01-14 23:27
 **/
public class Factorial {

    public static int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(3));
    }
}
