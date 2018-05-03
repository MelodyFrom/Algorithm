package com.gaop.demo.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @description 	
 * 	两个数组的交集，给定两个数组，写一个方法来求他们的交集 <br>
 * 	举例：nums1 = [1, 2, 2, 1], nums2 = [2, 2];方法计算得到的结果应该为 [2, 2] <br>
 * 	注意：1.输出结果中每个元素出现的次数，应该与元素在两个数组中出现的次数一致 <br>
 * 		2.可以不考虑输出结果的顺序 <br>
 * 	解答思路：使用两个索引标记两个数组。在循环体内，当nums1[index1] > nums2[index2] 则 index2 递增，否则 index1 递增；如果两个条件都不满足的话说明这两个下标所在数组的
 *  值相等，将他们加入结果集。
 * 
 * @author gaop
 * @date 2018年5月3日 下午8:45:02
 */
public class IntersectionOfTwoArray {
	
	public static void main(String[] args) {
		int[] nums1 = new int[]{1, 2};
		int[] nums2 = new int[]{1, 1};
		intersect(nums1, nums2);
	}

    public static int[] intersect(int[] nums1, int[] nums2) {
    	// 首先对两个数组进行排序
    	Arrays.sort(nums1);
    	Arrays.sort(nums2);
    	int index1 = 0, index2 = 0;
    	ArrayList<Integer> result = new ArrayList<>();
    	while(index1 < nums1.length && index2 < nums2.length)
    	{
    		if(nums1[index1] > nums2[index2])
    			index2++;
    		else if(nums1[index1] < nums2[index2])
    			index1++;
    		else {
    			result.add(nums1[index1]); 
    			index1++; 
    			index2++;    			
    		}
    	}
    	System.out.println(result);
    	int[] arg = new int[result.size()];
    	for (int i = 0; i < arg.length; i++) {
			arg[i] = result.get(i);
		}
    	return arg;
    }
}
