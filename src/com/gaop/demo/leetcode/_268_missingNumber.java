package com.gaop.demo.leetcode;

/**
 * 给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
 * 算法思路1：创建一个入参数组长度+1的新数组，然后做“填空”。以入参数组内的值为依据，在新数组上“打点”。比如：入参有一个2，则将新数组
 * 下标为2的位置的值置为1。循环结束后遍历一次新数组。值为0的位置（即没有打点的位置）就是确实的数字。 <br></>
 * 需要的额外空间是 O(n)，时间复杂度是O(n) <br></>
 * 思路2：求和
 * @author gaopeng@doctorwork.com
 * @date 2019-02-24 18:57
 **/
public class _268_missingNumber {

    public static int missingNumber(int[] nums) {
        int[] c = new int[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            c[nums[i]] = 1;
        }
        for (int i = 0; i < c.length; i++) {
            if (c[i] != 1)
                return i;
        }
        return 0;
    }

    /**
     * 利用求和的方式，比起算法1节约了更多的空间
     * @param nums 入参缺失数组
     * @return
     */
    public static int missingNumber2(int[] nums) {
        int count = nums.length ;//入参是缺失了一位数值
        int sum1 = 0;
        for (int i = 0; i < nums.length; i++) {
            sum1 = sum1 +nums[i];
        }
        int sum2 = (count * (count+1)) / 2;
        return sum2 -sum1;
    }

    public static void main(String[] args) {
        int[] params = new int[]{3,0,1};
        System.out.println(_268_missingNumber.missingNumber(params));
        int[] params2 = new int[]{9,6,4,2,3,5,7,0,1};
        System.out.println(_268_missingNumber.missingNumber(params2));
        System.out.println(_268_missingNumber.missingNumber2(params));
        System.out.println(_268_missingNumber.missingNumber2(params2));
    }
}
