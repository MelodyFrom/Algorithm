package com.gaop.demo.leetcode;

/**
 * @description
 * 	删除数组中的重复元素,要求是原地删除并返回新的数组长度
 * @author gao
 *
 */
public class RemoveDuplicateEleFromArray {
	
	public static void show(int[] arg) {
		for(int i : arg) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
    
    public static int removeDuplicates(int[] nums) {
    	if(nums.length == 0)
    		return 0;
    	if(nums.length == 1)
    		return 1;
    	int repeatCount = 0; // 元素重复次数统计
    	for (int k = 0; k < nums.length; k++) {
    		int index = 0; // 用于重复检查的索引
        	for (int i = k; i < nums.length; i++) {
        		// 遍历数组，确认元素的唯一性
    			if(nums[index] == nums[i])
    			{
    				// 检查到相等的元素,repeat元素后面的元素统一前移一位,统计字段+1
    		        for(int j = i; j < nums.length - 1; j++)
    		        {
    		            nums[j] = nums[j+1];
    		        }
    				repeatCount ++;
    			}
    		}
        	index++;
		}
    	return nums.length - repeatCount;
    }
    
    public static void main(String[] args) {
    	int[] arg = new int[]{1, 1, 2};
    	show(arg);
    	System.out.println(removeDuplicates(arg));
    	show(arg);
    	
    	int[] arg1 = new int[]{1, 1, 1};
    	show(arg1);
    	System.out.println(removeDuplicates(arg1));
    	show(arg1);
    	
    	int[] arg2 = new int[]{1, 2, 2};
    	show(arg2);
    	System.out.println(removeDuplicates(arg2));
    	show(arg2);
	}
}
