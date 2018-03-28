package com.gaop.demo.leetcode;

import java.util.Arrays;

public class RotateArray extends Base {
	
	/**
	 * �ռ临�Ӷ�ΪO(n)
	 * @param nums
	 * @param k
	 */
    public static void rotate(int[] nums, int k) {
    	if(k >= nums.length)
    		k = k % nums.length;
    	if(k == nums.length || k == 0)
    		return;
    	int[] copyArg = Arrays.copyOf(nums, nums.length);
    	// ǰ leng-k ��Ԫ���ƶ�
        for (int i = 0; i < copyArg.length - k; i++) {
        	nums[i + k] = copyArg[i];
		}
        // ʣ��Ԫ�ص��ƶ�
        for (int i = copyArg.length - k; i < copyArg.length; i++) {
        	nums[i + k - nums.length] = copyArg[i];
		}
        for (int i : nums) {
			System.out.print(i + " ");
		}
    }
    
	/**
	 * ���Կռ临�Ӷ�ΪO(1)����ռ�ö���ռ䣺������ת <br>
	 * �÷���������ط������ܼ����ε����鷴ת.��length-k�õ�һ��ֵmiddleȻ���ȷֱ�תnums[0, middle - 1]��nums[middle, nums.length],���ת�������鼴�ɡ�
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