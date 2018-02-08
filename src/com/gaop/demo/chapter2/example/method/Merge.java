package com.gaop.demo.chapter2.example.method;

import com.gaop.demo.chapter2.example.BaseModel;

/**
 * @description
 * 	归并排序,即将两个有序的数组归并称为一个更大的有序数组。算法最明显的特质是: 可以保证任意长度为N的数组排序所需时间和
 * 	<b>NlogN</b>成正比,主要是缺点是所需的额外空间和N成正比.
 * @author gao
 *
 */
public class Merge extends BaseModel<Integer>{

	@Override
	public void sort(Comparable<Integer>[] arg) {
		// TODO Auto-generated method stub
		
	}
	
	public void merge(Comparable<Integer>[] arg, int lo, int mid, int hi) {
		int i = lo;
		int j = hi;
		//copy the source array
		Comparable<Integer>[] copyArg = new Integer[hi];
		for(int k = lo; k <= hi; k++)
		{
			copyArg[k] = (Integer) arg[k];
		}
		//merge sort to arg
		for(int k = lo; k <= hi; k++)
		{
			//TODO
		}
	}

}
