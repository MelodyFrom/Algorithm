package com.gaop.demo.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @description 	
 * 	��������Ľ����������������飬дһ�������������ǵĽ��� <br>
 * 	������nums1 = [1, 2, 2, 1], nums2 = [2, 2];��������õ��Ľ��Ӧ��Ϊ [2, 2] <br>
 * 	ע�⣺1.��������ÿ��Ԫ�س��ֵĴ�����Ӧ����Ԫ�������������г��ֵĴ���һ�� <br>
 * 		2.���Բ�������������˳�� <br>
 * 	���˼·��ʹ��������������������顣��ѭ�����ڣ���nums1[index1] > nums2[index2] �� index2 ���������� index1 �������������������������Ļ�˵���������±����������
 *  ֵ��ȣ������Ǽ���������
 * 
 * @author gaop
 * @date 2018��5��3�� ����8:45:02
 */
public class IntersectionOfTwoArray {
	
	public static void main(String[] args) {
		int[] nums1 = new int[]{1, 2};
		int[] nums2 = new int[]{1, 1};
		intersect(nums1, nums2);
	}

    public static int[] intersect(int[] nums1, int[] nums2) {
    	// ���ȶ����������������
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
