package com.gaop.demo.leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @description
 * 	存在重复：给定一个整数数组，判断是否存在重复元素。存在返回true，否则返回false。
 * 	思路：最常规的解题思路是使用一个两层循环依次遍历判断。但是这样的解法在leetcode上会超时。这里引发对时间复杂度的考量。
 * 	 然后有另外两种方法来提升效率。 <br>
 * 	1.先利用数组工具类Arrays.sort(nums)将整个数组进行一次排序。然后对这个有序数组进行一层的遍历，判断前后相邻元素是否相等 <br>
 * 	2.利用哈希表，使用现有的hashmap实现，将每一个元素插入到hash表，如果存在key冲突则证明重复
 * @author gao 
 *
 */
public class ContainsDuplicate extends Base{

    public boolean containsDuplicate(int[] nums) {
    	if(nums.length <= 1)
    		return false;
    	Arrays.sort(nums);
    	for (int i = 0; i < nums.length - 1; i++) {
    		if(nums[i] == nums[i + 1])
    			return true;
		}
        return false;
    }
    
    public boolean containsDuplicate2(int[] nums) {
    	if(nums.length <= 1)
    		return false;
    	HashMap<Integer, Integer> container = new HashMap<>();
    	for (int i = 0; i < nums.length; i++) {
			if(null != container.put(nums[i], nums[i]))
				return true;
		}
        return false;
    }
    
    public static void main(String[] args) {
    	ContainsDuplicate containsDuplicate2 = new ContainsDuplicate();
		int[] nums = new int[]{3, 1};
		show(nums);
		System.out.println(containsDuplicate2.containsDuplicate(nums));
		
	}
}
