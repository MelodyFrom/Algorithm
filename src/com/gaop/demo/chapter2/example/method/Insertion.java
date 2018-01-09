package com.gaop.demo.chapter2.example.method;

import com.gaop.demo.chapter2.example.BaseModel;

/**
 * @description 	
 * 	类似整理有序的牌组,将一张牌插入到其他已经有序的牌中的适当位置.在计算机的实现中,为了要给插入的元素腾出空间,我们需要将其余所有的元素在插入之前都向右移动一位.
 * 这种算法叫做插入排序. <br>
 * 	与选择排序一样,当前索引的左边是有序的,但是它们最终的位置都还不确定,为了给更小的元素腾出空间,它们可能会被移动.但是当索引达到数组的右端时,数组排序就完成了. <br>
 * 	对部分有序的数组十分有效,适合小规模的数组
 * @author gaop
 * @date 2017年9月28日 下午10:09:37
 * @param <T>
 */
public class Insertion<T> extends BaseModel<T>{

	@Override
	public void sort(Comparable<T>[] arg) {
		int length = arg.length;
		for(int i = 1;i < length; i++) {
			for(int j = i;j > 0 && super.less(arg[j], arg[j - 1]);j--) {
				super.exch(arg, j, j-1);
			}
		}
	}

	public static void main(String[] args) {
		Integer[] a = new Integer[]{10, 15, 0, 4, 6, 12, 20, 1};
		Insertion<Integer> insertSort = new Insertion<>();
		insertSort.show(a);
		insertSort.sort(a);
		insertSort.show(a);
	}
}
