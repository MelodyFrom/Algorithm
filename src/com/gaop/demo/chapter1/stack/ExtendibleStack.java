package com.gaop.demo.chapter1.stack;

/**
 * @description 	
 * 	����ջ,ջ���������̶�,���Ը���һ����ʼ��������ʹ�����ݽṹĬ�ϵ�ջ����
 * @author gaop
 * @date 2017��7��26�� ����11:14:01
 */
public class ExtendibleStack<T> {
	
	private T[] data;
	
	/**
	 * ջָ��
	 */
	private int capacity;
	
	/**
	 * ʹ��Ĭ�ϵ�ջ������ʼ��,Ĭ�ϳ���Ϊ<b>10</b>
	 */
	@SuppressWarnings("unchecked")
	public ExtendibleStack(){
		this.data = (T[]) new Object[10];
	}
	
	/**
	 * ʹ��<b>ָ������</b>��ջ������ʼ��
	 * @param capacity ջ����
	 */
	@SuppressWarnings("unchecked")
	public ExtendibleStack(int capacity){
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
