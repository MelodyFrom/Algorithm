package com.gaop.demo.leetcode;

public class MoveZero {
	
	public static void show(int[] arg) {
		for(int i : arg) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

    public void moveZeroes(int[] nums) {
        int zeroCount = 0;
        for (int i = 0; i < nums.length; i++) {
			if(0 == nums[i])
			{
				zeroCount++;
				for (int j = i; j < nums.length - 1; j++) {
					nums[j] = nums[j+1];
				}
			}
		}
        for (int i = nums.length - 1; i > nums.length - zeroCount ; i--) {
			nums[i] = 0;
		}
    }
    
    public static void main(String[] args) {
		int[] nums = new int[]{0, 0, 12, 4, 0};
		MoveZero zero = new MoveZero();
		zero.moveZeroes(nums);
		show(nums);
	}
}
