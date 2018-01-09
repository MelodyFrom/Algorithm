package com.gaop.demo.chapter1.linked;

public class Node<T> {

	public T item;
	
	public Node<T> next;
	
	public Node(){}

	@Override
	public String toString() {
		return "Node [item=" + item + ", next=" + next + "]";
	}
	
}
