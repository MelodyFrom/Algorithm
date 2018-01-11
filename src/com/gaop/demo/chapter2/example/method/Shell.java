package com.gaop.demo.chapter2.example.method;

import com.gaop.demo.chapter2.example.BaseModel;

/**
 * @description 	
 * 	<b>希尔排序</b> <br>
 * 	基于插入排序的一种优化算法,插入排序适合运用于较小的数组排序场景,较大的数组排序更适合使用希尔排序.
 * 明确一个概念叫"h有序数组",即在一个数组内,每隔h个元素间的元素组成的一个数组是有序的,这样在那些较大的数组中我们可以
 * 一次就把一个目标元素移动到很远的位置.这个路径与插入排序相比就存在明显的优势,因为插入排序一次只能把元素移动一个单位长度.
 * @author gaop
 * @date 2017年11月12日 下午10:19:17
 */
public class Shell<E> extends BaseModel<Integer>{

	@Override
	public void sort(Comparable<Integer>[] arg) {
		int n = arg.length;
		int h = 1;
		while(h < n/3)
		{
			h = h*3 + 1;//1, 4, 13, 40, 121...
		}
		while(h >= 1)
		{
			for(int i = h; i < n; i++) 
			{
				for(int j = i; j >= h && super.less(arg[j], arg[j-h]); j -= h)
				{
					super.exch(arg, j, j-h);
				}
			}
			h = h/3;
		}
	}
	
	public static void main(String[] args) {
		Integer[] a = new Integer[]{10, 15, 0, 4, 6, 12, 20, 1};
		BaseModel<Integer> base = new Shell<>();
		base.show(a);
		base.sort(a);
		base.show(a);
	}
}
