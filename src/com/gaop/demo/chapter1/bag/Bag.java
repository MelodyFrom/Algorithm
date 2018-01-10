package com.gaop.demo.chapter1.bag;

/**
 * @description 	
 * 	背包是一种不支持从中删除元素的集合数据类型--它的目的是帮助用例收集元素并迭代遍历所有收集到的元素,迭代的顺序不确定且与用例无关
 * @author gaop
 * @date 2017年7月29日 下午11:49:20
 */
public interface Bag<T> extends Iterable<T>{

	/**
	 * 向背包加入一个元素
	 */
	void add(T item);
	
	boolean isEmpty();
	
	int size();
}
