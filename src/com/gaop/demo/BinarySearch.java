package com.gaop.demo;

/**
 * @description 	
 * 	基础二分查找,在一个有序数组中快速找到目标值的位置.适用于不经常变动但是查找操作频繁的有序列表.
 * @author gaop
 * @date 2017年6月10日 上午1:07:51
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
