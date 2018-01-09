package com.gaop.demo.chapter1.quene;

import com.gaop.demo.chapter1.linked.Node;

/**
 * @description 	
 * 	链式队列,不包含迭代内容
 * @author gaop
 * @date 2017年7月29日 下午12:00:16
 */
public class LinkedQuene<T> {

	/**
	 * 队首元素
	 */
	private Node<T> header;
	
	/**
	 * 队尾元素
	 */
	private Node<T> tail;
	
	private int N;
	
	public void enquene(T element) {
		Node<T> newElement = tail;
		tail = new Node<>();
		tail.item = element;
		tail.next = null;
		if(this.isEmpty()) {
			header = tail;
		} else {
			newElement.next = tail;			
		}
		N++;
	}
	
	public T dequene() {
		T item = header.item;
		header = header.next;
		if(this.isEmpty()) {
			tail = null;
		}
		N--;
		return item;
	}
	
	public int size() {
		return N;
	}
	public boolean isEmpty() {
		return N == 0;
	}
}
