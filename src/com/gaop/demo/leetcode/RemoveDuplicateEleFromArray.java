package com.gaop.demo.leetcode;

/**
 * @description
 * 	ɾ�������е��ظ�Ԫ��,Ҫ����ԭ��ɾ���������µ����鳤��
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
    	int repeatCount = 0; // Ԫ���ظ�����ͳ��
    	for (int k = 0; k < nums.length; k++) {
    		int index = 0; // �����ظ���������
        	for (int i = k; i < nums.length; i++) {
        		// �������飬ȷ��Ԫ�ص�Ψһ��
    			if(nums[index] == nums[i])
    			{
    				// ��鵽��ȵ�Ԫ��,repeatԪ�غ����Ԫ��ͳһǰ��һλ,ͳ���ֶ�+1
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
