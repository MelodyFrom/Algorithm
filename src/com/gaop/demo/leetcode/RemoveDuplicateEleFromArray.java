package com.gaop.demo.leetcode;

/**
 * @description
 * 	ɾ�����������е��ظ�Ԫ��,Ҫ����ԭ��ɾ���������µ����鳤�ȡ� <br>
 * 	˼·�����鱾���Ѿ���������ˣ�������ǿ�����һ�˱����оͼ�⵽���е��ظ�Ԫ�ء�ʹ��һ������ָ��������������е�����Ԫ�ض�����һ�飬Խ����Щ�Ѿ��ظ���Ԫ�ء��Ƚ��г�����ͬ��Ԫ�����ƶ�ָ��λ�á��Ƚϳ���ǰ������λ�ò�ͬ��Ԫ�ؾͽ�
 *  ���λ�ò��벻ͬ����Ԫ�ز��ƶ�һλָ�롣
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
		int index = 0; // �����ظ���������
    	for (int i = 1; i < nums.length; i++) {
			if(nums[i] != nums[index])
			{
				nums[++index] = nums[i]; // �ƶ�ָ�벢����ͬ��Ԫ�ز���
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
