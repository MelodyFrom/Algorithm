package com.gaop.demo.chapter1.stack;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @description 	
 * 	含有先进后出迭代顺序的弹性容量下压栈
 * @author gaop
 * @date 2017年7月27日 下午9:26:26
 * @param <T>
 */
public class ResizingArrayStack<T> implements Iterable<T>{

	private T[] data;
	
	private int capacity;
	
	@SuppressWarnings("unchecked")
	public ResizingArrayStack() {
		this.data = (T[]) new Object[10];
	}
	
	@SuppressWarnings("unchecked")
	public ResizingArrayStack(int capacity) {
		this.data = (T[]) new Object[capacity];
	}
	
	/**
	 * 入栈操作时会检查当前栈容量是否已达上限,如果达到上限则进行扩容操作,扩容策略为将当前栈的容量翻倍.
	 * @param t 入栈参数
	 */
	public void push(T t) {
		if(capacity == data.length) {
			this.resize(capacity * 2);
		}
		data[capacity++] = t;
	}
	
	/**
	 * 出栈操作会检查当前栈大小与栈的容纳数据量比例,如果两者比例大于4则缩小栈容量,策略为将当前栈的容量减半
	 * @return 最后一次弹栈操作删除的元素
	 */
	public T pop() {
		if(data.length > 0 && (data.length / capacity) >= 4) {
			this.resize(data.length / 2);
		}
		T element = data[--capacity];
		//方便GC回收已经无法再被访问的对象
		data[capacity] = null;
		return element;
	}
	
	public int size() {
		return this.capacity;
	}
	
	public boolean isEmpty() {
		return 0 == capacity;
	}
	
	/**
	 * 字符串栈拷贝方法
	 * @param source 
	 * @return
	 */
	public static ResizingArrayStack<String> copy(ResizingArrayStack<String> source) {
		ResizingArrayStack<String> target = new ResizingArrayStack<>();
		for(String element : source) {
			target.push(element);
		}
		return target;
	}
	
	@SuppressWarnings("unchecked")
	private void resize(int newSize) {
		T[] newData = (T[]) new Object[newSize];
		for (int i = 0; i < this.data.length; i++) {
			newData[i] = data[i];
		}
		this.data = newData;
 	}
	
	@Override
	public Iterator<T> iterator() {
		return new ResizingArrayIterator();
	}
	
	private class ResizingArrayIterator implements Iterator<T> {

		//迭代顺序为先进后出
		private int i = capacity;
		
		@Override
		public boolean hasNext() {
			return i > 0;
		}

		@Override
		public T next() {
			return data[--i];
		}
		
	}

	@Override
	public String toString() {
		return "ResizingArrayStack [data=" + Arrays.toString(data) + ", capacity=" + capacity + "]";
	}

}
