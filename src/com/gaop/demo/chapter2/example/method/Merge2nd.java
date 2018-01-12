package com.gaop.demo.chapter2.example.method;

import com.gaop.demo.chapter2.example.BaseModel;

/**
 * @description
 * 	归并排序,即将两个有序的数组归并称为一个更大的有序数组。算法最明显的特质是: 可以保证任意长度为N的数组排序所需时间和
 * 	<b>NlogN</b>成正比,主要是缺点是所需的额外空间和N成正比.
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
	 * <b>递归</b>,将一个数组拆分成一个个长度为1的小数组然后排序.高效算法设计中<b>分治思想</b>的具体体现.
	 * 这段递归代码是归纳证明算法能够正确将数组排序的基础：如果它能够将两个子数组排序,它就能够归并两个子数组并
	 * 将整个数组排序.
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
	 * 归并方法,将一个数组一分为二并排序,前提是两个拆分的数组本身也是有序的
	 * @param a
	 * @param lo
	 * @param mid
	 * @param hi
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void merge(Comparable[] a, int lo, int mid, int hi)
	{
		//归并a[lo...mid]与a[mid+1...hi]
		int i = lo,  j = mid + 1;
		//复制数组
		copy = new Comparable[a.length];
		for(int k = 0; k <= hi; k++)
		{
			copy[k] = a[k];
		}
		//归并
		for(int k = lo; k <= hi; k++)
		{
			//左边数组全部归并完但是右边还有
			if(i > mid)
			{
				a[k] = copy[j++];
			}
			//右边数组全部归并完但是左边还有
			else if(j > hi)
			{
				a[k] = copy[i++];
			}
			//左边大于等于右边
			else if(super.less(copy[j], copy[i]))
			{
				a[k] = copy[j++];
			}
			//左边小于右边
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
