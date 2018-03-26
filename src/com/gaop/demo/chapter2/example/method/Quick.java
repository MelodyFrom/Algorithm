package com.gaop.demo.chapter2.example.method;

import com.gaop.demo.chapter2.example.BaseModel;

/**
 * @description
 * 	快速排序，基于分治思想的产物。与归并排序有一定的相似之处。
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
		int i = lo, j = hi + 1; //左右的扫描指针
		Comparable v = a[lo]; //切分元素
		while(true)
		{
			// 切分元素，检查扫描是否结束并交换元素
			while(super.less(a[++i], v)) if(i == hi) break;
			while(super.less(v, a[--j])) if(j == lo) break;
			if(i >= j) break;
			super.exch(a, i, j);
		}
		super.exch(a, lo, j); // 将v = a[j] 放入正确的位置
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
