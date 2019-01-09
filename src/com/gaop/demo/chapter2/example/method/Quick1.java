package com.gaop.demo.chapter2.example.method;

import com.gaop.demo.chapter2.example.BaseModel;

public class Quick1<T> extends BaseModel<T>{

	@Override
	public void sort(Comparable<T>[] arg) {
		this.sort(arg, 0, arg.length - 1);
	}
	
	private void sort(Comparable<T>[] arg, int lo, int hi) {
		if(hi <= lo)
			return;
		int j = this.patition(arg, lo, hi);
		this.sort(arg, lo, j - 1);
		this.sort(arg, j + 1, hi);
	}
	
	/**
	 * ·Ö¶Î
	 * @param arg
	 * @param lo
	 * @param hi
	 * @return
	 */
	private int patition(Comparable<T>[] arg, int lo, int hi) {
		int i = lo, j = hi + 1;
		Comparable c = arg[i];
		while(true) {
			while(super.less(++i, c))
				if(i == hi)
					break;
			while(super.less(c, --j))
				if(j == lo)
					break;
			if(i >= j)
				break;
			super.exch(arg, i, j);
		}
		super.exch(arg, lo, j);
		return j;
	}
}
