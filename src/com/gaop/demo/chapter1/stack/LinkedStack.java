package com.gaop.demo.chapter1.stack;

import com.gaop.demo.chapter1.linked.Node;

/**
 * @description 	
 * 	由链表实现的栈结构,这个用例不包含支持迭代的部分
 * @author gaop
 * @date 2017年7月29日 上午11:22:19
 */
public class LinkedStack<T> {

	/**
	 * 栈顶元素
	 */
	private Node<T> first;
	
	/**
	 * 元素下标
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
