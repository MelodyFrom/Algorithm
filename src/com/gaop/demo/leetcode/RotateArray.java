package com.gaop.demo.leetcode;

import java.util.Arrays;

public class RotateArray extends Base {
	
	/**
	 * 空间复杂度为O(n)
	 * @param nums
	 * @param k
	 */
    public static void rotate(int[] nums, int k) {
    	if(k >= nums.length)
    		k = k % nums.length;
    	if(k == nums.length || k == 0)
    		return;
    	int[] copyArg = Arrays.copyOf(nums, nums.length);
    	// 前 leng-k 个元素移动
        for (int i = 0; i < copyArg.length - k; i++) {
        	nums[i + k] = copyArg[i];
		}
        // 剩余元素的移动
        for (int i = copyArg.length - k; i < copyArg.length; i++) {
        	nums[i + k - nums.length] = copyArg[i];
		}
        for (int i : nums) {
			System.out.print(i + " ");
		}
    }
    
	/**
	 * 尝试空间复杂度为O(1)即不占用额外空间：连续反转 <br>
	 * 该方法很巧妙地方在于总计三次的数组反转.以length-k得到一个值middle然后先分别反转nums[0, middle - 1]与nums[middle, nums.length],最后反转整个数组即可。
	 * @param nums
	 * @param k
	 */
    public static void rotate1(int[] nums, int k) {
    	if(k >= nums.length)
    		k = k % nums.length;
    	if(k == nums.length || k == 0)
    		return;
    	int middle = nums.length - k;
    	reverse(nums, 0, middle - 1);
    	reverse(nums, middle, nums.length - 1);
    	reverse(nums, 0, nums.length - 1);
        for (int i : nums) {
			System.out.print(i + " ");
		}
    }
    
    public static void reverse(int[] nums, int lo, int hi) {
		while(lo < hi) 
		{
			int bridge = nums[lo];
			nums[lo] = nums[hi];
			nums[hi] = bridge;
			lo++;
			hi--;
		}
	}
    
    public static void main(String[] args) {
		int[] arg = new int[]{1, 2};
		rotate1(arg, 3);
	}
    
}