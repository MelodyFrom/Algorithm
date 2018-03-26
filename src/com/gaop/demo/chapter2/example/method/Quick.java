package com.gaop.demo.chapter2.example.method;

import com.gaop.demo.chapter2.example.BaseModel;

/**
 * @description
 * 	�������򣬻��ڷ���˼��Ĳ����鲢������һ��������֮����
 * @author gao
 *
 * @param <T>
 */
public class Quick<T> extends BaseModel<T>{

	@Override
	public void sort(Comparable<T>[] arg) {
		this.sort(arg, 0, arg.length-1);
	}

	
	private void sort(Comparable<T>[] arg, int lo, int hi) {

		if(hi <= lo) return;
		int j = this.partition(arg, lo, hi);
		sort(arg, lo, j - 1);
		sort(arg, j + 1, hi);
	}
	
	private int partition(Comparable[] a, int lo, int hi) {
		int i = lo, j = hi + 1; //���ҵ�ɨ��ָ��
		Comparable v = a[lo]; //�з�Ԫ��
		while(true)
		{
			// �з�Ԫ�أ����ɨ���Ƿ����������Ԫ��
			while(super.less(a[++i], v)) if(i == hi) break;
			while(super.less(v, a[--j])) if(j == lo) break;
			if(i >= j) break;
			super.exch(a, i, j);
		}
		super.exch(a, lo, j); // ��v = a[j] ������ȷ��λ��
		return j;
	}
	
	public static void main(String[] args) {
		Integer[] arg = new Integer[]{12, 3, 16, 20, 21, 4, 1, 2, 5};
		BaseModel<Integer> base = new Quick<>();
		base.show(arg);
		base.sort(arg);
		base.show(arg);
	}
	
}
