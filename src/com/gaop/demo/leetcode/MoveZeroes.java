package com.gaop.demo.leetcode;

/**
 * @description
 * 	移动零：对于一个给定的数组，将数组中所有的零元素移动到数组末尾。同时保持其他非零元素的相对顺序。 <br>
 * 	思路：遍历统计数组中零元素的个数。 <br>
 * 	在一趟倒序的遍历中依次判断每个元素是否是零元素。如果是则给统计字段+1并依次将该元素后的所有元素向前移动一位。之所以需要倒序，是因为正序的移动元素会破坏掉尚未遍历的
 * 	元素的位置，导致像[0, 1, 0]这样的数组在正序遍历的时候统计出额外的零元素数量。
 * @author gao
 *
 */
public class MoveZeroes extends Base{

    public void moveZeroes(int[] nums) {
        int zeroCount = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
			if(nums[i] == 0) {
				zeroCount++;
				for (int j = i; j < nums.length - 1; j++)
					nums[j] = nums[j + 1];	
			}
		}
        if(zeroCount > 0)
        {
        	for (int i = nums.length - 1; i > nums.length - 1 - zeroCount; i--) {
				nums[i] = 0;
			}
        }
    }
    
    public static void main(String[] args) {
    	MoveZeroes moveZeroes = new MoveZeroes();
		int[] nums = new int[]{0, 1, 3, 0, 4};
		show(nums);
		moveZeroes.moveZeroes(nums);
		show(nums);
		//demo2
		int[] nums2 = new int[]{0, 1, 0};
		show(nums2);
		moveZeroes.moveZeroes(nums2);
		show(nums2);
	}
}
