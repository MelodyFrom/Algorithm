package com.gaop.demo.chapter2.example.method;

import com.gaop.demo.chapter2.example.BaseModel;

/**
 * @description
 * 	�鲢����,�����������������鲢��Ϊһ��������������顣�㷨�����Ե�������: ���Ա�֤���ⳤ��ΪN��������������ʱ���
 * 	<b>NlogN</b>������,��Ҫ��ȱ��������Ķ���ռ��N������.
 * @author gao
 *
 */
public class Merge2nd<T> extends BaseModel<T>{
	
	private Comparable<T>[] copy;

	@SuppressWarnings("unchecked")
	@Override
	public void sort(Comparable<T>[] arg) {
		copy = new Comparable[arg.length];
		sort(arg, 0, copy.length - 1);
	}
	
	/**
	 * <b>�ݹ�</b>,��һ�������ֳ�һ��������Ϊ1��С����Ȼ������.��Ч�㷨�����<b>����˼��</b>�ľ�������.
	 * ��εݹ�����ǹ���֤���㷨�ܹ���ȷ����������Ļ�����������ܹ�����������������,�����ܹ��鲢���������鲢
	 * ��������������.
	 * @param arg
	 * @param lo
	 * @param hi
	 */
	private void sort(Comparable<T>[] arg, int lo, int hi)
	{
		if(hi <= lo) 
			return;
		int mid = lo + (hi - lo)/2;
		sort(arg, lo, mid);
		sort(arg, mid + 1, hi);
		merge(arg, lo, mid, hi);
	}
	
	/**
	 * �鲢����,��һ������һ��Ϊ��������,ǰ����������ֵ����鱾��Ҳ�������
	 * @param a
	 * @param lo
	 * @param mid
	 * @param hi
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void merge(Comparable[] a, int lo, int mid, int hi)
	{
		//�鲢a[lo...mid]��a[mid+1...hi]
		int i = lo,  j = mid + 1;
		//��������
		copy = new Comparable[a.length];
		for(int k = 0; k <= hi; k++)
		{
			copy[k] = a[k];
		}
		//�鲢
		for(int k = lo; k <= hi; k++)
		{
			//�������ȫ���鲢�굫���ұ߻���
			if(i > mid)
			{
				a[k] = copy[j++];
			}
			//�ұ�����ȫ���鲢�굫����߻���
			else if(j > hi)
			{
				a[k] = copy[i++];
			}
			//��ߴ��ڵ����ұ�
			else if(super.less(copy[j], copy[i]))
			{
				a[k] = copy[j++];
			}
			//���С���ұ�
			else
			{
				a[k] = copy[i++];
			}
		}
	}

	public static void main(String[] args) {
		Integer[] params = new Integer[]{12, 3, 16, 20, 21, 4, 1, 2, 5};
		BaseModel<Integer> base = new Merge2nd<>();
		base.show(params);
		base.sort(params);
		base.show(params);
	}
	
}
