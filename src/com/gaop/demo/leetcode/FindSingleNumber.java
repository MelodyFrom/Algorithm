package com.gaop.demo.leetcode;

import java.util.Arrays;

public class FindSingleNumber extends Base{

    public int singleNumber(int[] nums) {
    	if(nums.length == 1)
    		return nums[0];
    	Arrays.sort(nums);
    	for (int i = 0; i < nums.length - 1; i = i + 2) {
			if(nums[i] != nums[i + 1])
				return nums[i];
		}
    	return nums[nums.length - 1];
    }
    
    public static void main(String[] args) {
    	int[] nums = new int[]{3, 3, 1, 1, 5, 5, 10, 10, 11};
    	FindSingleNumber findSingleNumber = new FindSingleNumber();
    	System.out.println(findSingleNumber.singleNumber(nums));
	}
}
