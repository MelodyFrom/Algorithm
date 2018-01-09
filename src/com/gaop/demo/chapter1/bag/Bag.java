package com.gaop.demo.chapter1.bag;

/**
 * @description 	
 * 	�����ӿ�,ʵ��һ�����õı����ṹ����ʵ�����µķ���,��Ϊ������Ҫ����ı���Ԫ�صĲ���,�������еı�����Ӧ��ʵ��<b>����</b>
 * @author gaop
 * @date 2017��7��29�� ����11:49:20
 */
public interface Bag<T> extends Iterable<T>{

	/**
	 * �򱳰��м���һ��Ԫ��
	 */
	void add(T item);
	
	boolean isEmpty();
	
	int size();
}
