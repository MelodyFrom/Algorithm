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
