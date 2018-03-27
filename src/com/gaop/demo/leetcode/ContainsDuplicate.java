package com.gaop.demo.leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @description
 * 	�����ظ�������һ���������飬�ж��Ƿ�����ظ�Ԫ�ء����ڷ���true�����򷵻�false��
 * 	˼·�����Ľ���˼·��ʹ��һ������ѭ�����α����жϡ����������Ľⷨ��leetcode�ϻᳬʱ������������ʱ�临�ӶȵĿ�����
 * 	 Ȼ�����������ַ���������Ч�ʡ� <br>
 * 	1.���������鹤����Arrays.sort(nums)�������������һ������Ȼ�����������������һ��ı������ж�ǰ������Ԫ���Ƿ���� <br>
 * 	2.���ù�ϣ��ʹ�����е�hashmapʵ�֣���ÿһ��Ԫ�ز��뵽hash���������key��ͻ��֤���ظ�
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
