package com.gaop.demo.leetcode;

/**
 * @description
 * 	删除有序数组中的重复元素,要求是原地删除并返回新的数组长度。 <br>
 * 	思路：数组本身已经是有序的了，因此我们可以在一趟遍历中就检测到所有的重复元素。使用一个虚拟指针来将这个数组中的所有元素都整理一遍，越过那些已经重复的元素。比较中出现相同的元素则不移动指针位置。比较出现前后两个位置不同的元素就将
 *  这个位置插入不同的新元素并移动一位指针。
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
		int index = 0; // 用于重复检查的索引
    	for (int i = 1; i < nums.length; i++) {
			if(nums[i] != nums[index])
			{
				nums[++index] = nums[i]; // 移动指针并将不同的元素插入
			}
		}
    	return index + 1;
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
