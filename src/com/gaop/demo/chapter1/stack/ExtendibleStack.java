package com.gaop.demo.chapter1.stack;

/**
 * @description 	
 * 	弹性栈,栈的容量不固定,可以赋予一个初始容量或者使用数据结构默认的栈容量
 * @author gaop
 * @date 2017年7月26日 下午11:14:01
 */
public class ExtendibleStack<T> {
	
	private T[] data;
	
	/**
	 * 栈指针
	 */
	private int capacity;
	
	/**
	 * 使用默认的栈容量初始化,默认长度为<b>10</b>
	 */
	@SuppressWarnings("unchecked")
	public ExtendibleStack(){
		this.data = (T[]) new Object[10];
	}
	
	/**
	 * 使用<b>指定长度</b>的栈容量初始化
	 * @param capacity 栈容量
	 */
	@SuppressWarnings("unchecked")
	public ExtendibleStack(int capacity){
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
	
	@SuppressWarnings("unchecked")
	private void resize(int newSize) {
		T[] newData = (T[]) new Object[newSize];
		for (int i = 0; i < this.data.length; i++) {
			newData[i] = data[i];
		}
		this.data = newData;
 	}

	@Override
	public String toString() {
		return "ExtendibleStack [data=" + data + ", capacity=" + capacity + "]";
	}
	
}
