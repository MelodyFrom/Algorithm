package com.gaop.demo;

/**
 * @description 	
 * 	�������ֲ���,��һ�����������п����ҵ�Ŀ��ֵ��λ��.�����ڲ������䶯���ǲ��Ҳ���Ƶ���������б�.
 * @author gaop
 * @date 2017��6��10�� ����1:07:51
 */
public class BinarySearch {

	public static int rank(int target, int[] arg){
		int first = 0;
		int last = arg.length - 1;
		while(first <= last) {
			int mid = first + (first + last) / 2;
			if(target < arg[mid])
				last = mid - 1;
			else if(target > arg[mid])
				first = mid + 1;
			else
				return target;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arg = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
		int target = 2;
		System.out.println(rank(target, arg));
	}
}
