package com.gaop.demo.leetcode;

/**
 * @description
 * 	�ƶ��㣺����һ�����������飬�����������е���Ԫ���ƶ�������ĩβ��ͬʱ������������Ԫ�ص����˳�� <br>
 * 	˼·������ͳ����������Ԫ�صĸ����� <br>
 * 	��һ�˵���ı����������ж�ÿ��Ԫ���Ƿ�����Ԫ�ء���������ͳ���ֶ�+1�����ν���Ԫ�غ������Ԫ����ǰ�ƶ�һλ��֮������Ҫ��������Ϊ������ƶ�Ԫ�ػ��ƻ�����δ������
 * 	Ԫ�ص�λ�ã�������[0, 1, 0]���������������������ʱ��ͳ�Ƴ��������Ԫ��������
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
