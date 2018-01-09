package com.gaop.demo.chapter1.stack;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @description 	
 * 	�����Ƚ��������˳��ĵ���������ѹջ
 * @author gaop
 * @date 2017��7��27�� ����9:26:26
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
	 * ��ջ����ʱ���鵱ǰջ�����Ƿ��Ѵ�����,����ﵽ������������ݲ���,���ݲ���Ϊ����ǰջ����������.
	 * @param t ��ջ����
	 */
	public void push(T t) {
		if(capacity == data.length) {
			this.resize(capacity * 2);
		}
		data[capacity++] = t;
	}
	
	/**
	 * ��ջ�������鵱ǰջ��С��ջ����������������,������߱�������4����Сջ����,����Ϊ����ǰջ����������
	 * @return ���һ�ε�ջ����ɾ����Ԫ��
	 */
	public T pop() {
		if(data.length > 0 && (data.length / capacity) >= 4) {
			this.resize(data.length / 2);
		}
		T element = data[--capacity];
		//����GC�����Ѿ��޷��ٱ����ʵĶ���
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
	 * �ַ���ջ��������
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

		//����˳��Ϊ�Ƚ����
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
