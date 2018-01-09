package com.gaop.demo.chapter1.stack;

import com.gaop.demo.chapter1.linked.Node;

/**
 * @description 	
 * 	������ʵ�ֵ�ջ�ṹ,�������������֧�ֵ����Ĳ���
 * @author gaop
 * @date 2017��7��29�� ����11:22:19
 */
public class LinkedStack<T> {

	/**
	 * ջ��Ԫ��
	 */
	private Node<T> first;
	
	/**
	 * Ԫ���±�
	 */
	private int N;
	
	public void push(T t) {
		Node<T> next = first;
		first = new Node<>();
		first.item = t;
		first.next = next;
		N++;
	}
	
	public T pop() {
		T element = first.item;
		first = first.next;
		N--;
		return element;
	}
	
	public int size() {
		return N;
	}
	
	public boolean isEmpty() {
		return N == 0;
		// or return first == null;
	}

	@Override
	public String toString() {
		return "LinkedStack [first=" + first + ", N=" + N + "]";
	}
	
}
