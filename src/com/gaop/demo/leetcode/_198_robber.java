package com.gaop.demo.leetcode;

import java.util.List;

/**
 * NO.198 动态规划-打家劫舍
 * @author gaopeng@doctorwork.com
 * @description
 * @date 2019-02-23 13:43
 **/
public class _198_robber {

    public static int rob(int[] nums) {
        int length = nums.length;
        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];
        if (nums.length == 2)
            return Math.max(nums[0], nums[1]);
        int[] values = new int[nums.length];
        values[0] = nums[0];
        values[1] = Math.max(nums[0], nums[1]);
        // 确定 OPTi 的值，选 与 不选 的问题核心
        for (int i = 2; i < nums.length; i++) {
            values[i] = Math.max(values[i-2] + nums[i], values[i-1]);
        }
        return values[length-1];
    }

    private static int getValues(int[] nums, List<Integer> opts, int n) {
        return opts.get(n-2) + nums[n];
    }

    public static void main(String[] args) {
        int[] params = new int[]{1,2,3,1}; //4
        System.out.println(_198_robber.rob(params));
        int[] params1 = new int[]{2,7,9,3,1}; //12
        System.out.println(_198_robber.rob(params1));
        int[] params2 = new int[]{1,1,1}; //2
        System.out.println(_198_robber.rob(params2));
        int[] params3 = new int[]{1,3,1}; //3
        System.out.println(_198_robber.rob(params3));
        int[] params4 = new int[]{1,1}; //1
        System.out.println(_198_robber.rob(params4));
        int[] params5 = new int[]{2,1,1,2}; //4
        System.out.println(_198_robber.rob(params5));
    }
}
