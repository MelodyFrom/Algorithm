package com.gaop.demo.leetcode;

/**
 * 动态规划-爬楼梯 <br/>
 * 状态转移方程 F(n)=F(n-1)+F(n-2)，即 n 级楼梯的爬法是 n-1 级楼梯爬法与 n-2 级楼梯爬法之和
 * 出口：1 级楼梯有 1 种爬法，2 级楼梯有 2 种爬法
 * @author gaopeng@doctorwork.com
 * @date 2019-02-24 9:55
 **/
public class _70_climbingStairs {


    public static int climbStairs(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        int[] opts = new int[n];
        opts[0] = 1;
        opts[1] = 2;
        for (int i = 2; i < n; i++) {
            opts[i] = opts[i-1] + opts[i-2];
        }
        return opts[n-1];
    }

    public static void main(String[] args) {
        System.out.println(_70_climbingStairs.climbStairs(3));//3
    }
}
