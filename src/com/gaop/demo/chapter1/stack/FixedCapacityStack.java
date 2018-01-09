package com.gaop.demo.chapter1.stack;

import java.util.Arrays;

/**
 * @description 	
 * 	定容栈
 * @author gaop
 * @date 2017年7月25日 下午9:38:41
 */
public class FixedCapacityStack<T> {

	private T[] arg;
	
	private int capacity;
	
	private int iniCapacity;
	
	@SuppressWarnings("unchecked")
	public FixedCapacityStack(int cap) {
		this.iniCapacity = cap;
		this.arg = (T[]) new Object[cap];
	}
	
	public void push(T s) {
		arg[capacity++] = s;
	}
	
	public T pop() {
		return arg[--capacity];
	}
	
	public T peek() {
		return arg[capacity];
	}
	
	public int size() {
		return capacity;
	}
	
	public boolean isEmpty() {
		return 0 == capacity;
	}
	
	public boolean isFull() {
		return capacity == iniCapacity;
	}

	@Override
	public String toString() {
		return "FixedCapacityStackOfStrings [strarg=" + Arrays.toString(arg) + ", capacity=" + capacity + "]";
	}
	
}
