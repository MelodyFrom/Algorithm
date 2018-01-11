package com.gaop.demo.chapter2.example.method;

import com.gaop.demo.chapter2.example.BaseModel;

public class ShellFor2nd<E> extends BaseModel<E>{

	@Override
	public void sort(Comparable<E>[] arg) {
		int length = arg.length;
		int h = length/2;
		while(h >= 1)
		{
			for(int i = 0; i < length; i++)
			{
				for(int j = i; j >= h; j -= h)
				{
					if(super.less(arg[j], arg[j-h]))
					{
						super.exch(arg, j, j-h);
					}
				}				
			}
			h = h/2;
		}
	}
	
	public static void main(String[] args) {
		Integer[] a = new Integer[]{10, 15, 0, 4, 6, 12, 20, 1};
		BaseModel<Integer> base = new ShellFor2nd<>();
		base.show(a);
		base.sort(a);
		base.show(a);
	}
	
}
