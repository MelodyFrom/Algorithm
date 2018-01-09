package com.gaop.demo.chapter2.example.method;

import com.gaop.demo.chapter2.example.BaseModel;

/**
 * @description 	
 * 	<b>冒泡排序</b> <br>
 * 	基础的排序方式,每一轮循环确定一个最大(最小)的元素的位置;然后在下一轮的循环时就不在检查已经确定好位置的元素,注意
 * 和选择排序进行比对,是一组比较类似的排序方式.最明显的区别在与选择排序的交换元素交换次数少于冒泡排序
 * @author gaop
 * @date 2017年11月12日 下午8:35:56
 */
public class Bubble extends BaseModel<Integer>{

	@Override
	public void sort(Comparable<Integer>[] arg) {
		int length = arg.length;
		for(int i = 0; i < length - 1; i++) {
			for(int j = i; j < length - 1 - i; j++) {
				if(super.less(arg[j], arg[j+1])) {
					super.exch(arg, j, j+1);
				}
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
