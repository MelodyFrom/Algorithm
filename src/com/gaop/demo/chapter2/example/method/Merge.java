package com.gaop.demo.chapter2.example.method;

import com.gaop.demo.chapter2.example.BaseModel;

/**
 * @description
 * 	�鲢����,�����������������鲢��Ϊһ��������������顣�㷨�����Ե�������: ���Ա�֤���ⳤ��ΪN��������������ʱ���
 * 	<b>NlogN</b>������,��Ҫ��ȱ��������Ķ���ռ��N������.
 * @author gao
 *
 */
public class Merge extends BaseModel<Integer>{

	Comparable<Integer>[] copy;
	
	@SuppressWarnings("unchecked")
	@Override
	public void sort(Comparable<Integer>[] arg) {
		copy = new Comparable[arg.length];
		this.sort(arg, 0, arg.length - 1);
	}
	
	private void sort(Comparable<Integer>[] arg, int lo, int hi) {
		if(lo >= hi)
			return;
		int mid = lo + (hi - lo) / 2;
		sort(arg, lo, mid);
		sort(arg, mid+1, hi);
		merge(arg, lo, mid, hi);
	}
	
	public void merge(Comparable<Integer>[] arg, int lo, int mid, int hi) {
		int i = lo;
		int j = mid + 1;
		//copy the source array
		copy = new Integer[arg.length];
		for(int k = 0; k <= hi; k++)
		{
			copy[k] = (Integer) arg[k];
		}
		//merge sort to arg
		for(int k = lo; k <= hi; k++)
		{
			if(i > mid)
			{
				arg[k] = copy[j++];
			}
			else if (j > hi)
			{
				arg[k] = copy[i++];
			}
			else if(super.less(copy[i], copy[j]))
			{
				arg[k] = copy[i++];
			} else {
				arg[k] = copy[j++];
			}
		}
	}
	
	public static void main(String[] args) {
		Merge merge = new Merge();
//		Integer[] arg = new Integer[]{2,4,3,8};
		Integer[] arg = new Integer[]{12, 3, 16, 20, 21, 4, 1, 2, 5};
		merge.sort(arg);
		merge.show(arg);
	}

}
