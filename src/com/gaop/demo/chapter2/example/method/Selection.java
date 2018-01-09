package com.gaop.demo.chapter2.example.method;

import com.gaop.demo.chapter2.example.BaseModel;

/**
 * @description
 * 	选择排序 	
 * @author gaop
 * @date 2017年9月11日 下午10:32:36
 */
public class Selection extends BaseModel<Integer>{

	/**
	 * 排序算法实现的数组排序方法
	 * @param a
	 */
	public void sort(Comparable[] a) 
	{
		int length = a.length;
		for(int i = 0; i < length; i++) 
		{
			int min = i;
			for(int j = i+1; j < length; j++)
				if(less(a[j], a[min])) 
					min = j;
			exch(a, i, min);
		}
	}
	
	
	public static void main(String[] args) {
		Selection select = new Selection();
		Integer[] arg = new Integer[]{10, 5, 11, 14, 1, 0, 55, 2, 4, 5};
		select.show(arg);
		select.sort(arg);
		select.show(arg);
	}
}
