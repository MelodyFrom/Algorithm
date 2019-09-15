package com.gaop.demo.leetcode;

/**
 * 两数之和，在一个给定数组中，找出给定数值的两个元素之和匹配的元素。
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 解法：最简单粗暴的解法是：使用嵌套 for 循环，依次遍历所有的元素。彼此相加，检查某两个元素之和是否是等于期望值的。
 */
public class _1_TwoSum {

    public static void main(String[] args) {
        int[] case1 = new int[]{3,2,4};
        int[] ans = twoSum(case1, 6);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[]{};
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }
        return ans;
    }

}
