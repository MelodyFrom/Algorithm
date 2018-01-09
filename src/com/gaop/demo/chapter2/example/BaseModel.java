package com.gaop.demo.chapter2.example;

/**
 * @description 	
 * 	基础算法模板类
 * @author gaop
 * @date 2017年9月28日 下午7:26:55
 */
public abstract class BaseModel<T> {

	/**
	 * 排序方法,具体的算法实现类需要实现这个排序方法以实现这个算法的排序逻辑
	 * @param arg
	 */
	public abstract void sort(Comparable<T>[] arg);
	
	/**
	 * 数组打印方法
	 * @param arg
	 */
	public void show(Comparable<T>[] arg) {
		for(Comparable<T> a : arg) {
			System.out.print(a.toString() + " ");
		}
		System.out.println();
	}
	
	/**
	 * 交换数组中下标a与b的两个元素的位置
	 * @param arg
	 * @param a
	 * @param b
	 */
	public void exch(Comparable<T>[] arg, int a, int b) 
	{
		Comparable<T> bridge = arg[a];
		arg[a] = arg[b];
		arg[b] = bridge;
		//release it for GC
		bridge = null;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public boolean less(Comparable a, Comparable b) {
		return a.compareTo(b) < 0;
	}
	
	/**
	 * 判断数组是否有序,此处仅仅是降序排序标准判断
	 * @param arg
	 * @return
	 */
	public boolean isSorted(Comparable<T>[] arg) {
		for(int i = 0;i < arg.length-1; i++) {
			if(this.less(arg[i], arg[i+1])) {
				return false;
			}
		}
		return true;
	}
	
}
