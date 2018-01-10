package com.gaop.demo.chapter1.bag;

/**
 * @description 	
 * 	������һ�ֲ�֧�ִ���ɾ��Ԫ�صļ�����������--����Ŀ���ǰ��������ռ�Ԫ�ز��������������ռ�����Ԫ��,������˳��ȷ�����������޹�
 * @author gaop
 * @date 2017��7��29�� ����11:49:20
 */
public interface Bag<T> extends Iterable<T>{

	/**
	 * �򱳰�����һ��Ԫ��
	 */
	void add(T item);
	
	boolean isEmpty();
	
	int size();
}
