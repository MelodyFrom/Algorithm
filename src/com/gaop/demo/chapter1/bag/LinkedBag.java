package com.gaop.demo.chapter1.bag;

import java.util.Iterator;

import com.gaop.demo.chapter1.linked.Node;

/**
 * @description 	
 * 	��ʽ����
 * @author gaop
 * @date 2017��7��29�� ����11:47:43
 */
public class LinkedBag<T> implements Bag<T>{

	private Node<T> element;
	
	private int N;

	@Override
	public void add(T item) {
		Node<T> newElement = this.element;
		element = new Node<>();
		element.item = item;
		element.next = newElement;
		N++;
	}
	
	@Override
	public boolean isEmpty() {
		return N == 0;
		// or return element == null;
	}

	@Override
	public int size() {
		return N;
	}

	@Override
	public Iterator<T> iterator() {
		return new BagIterator();
	}
	
	class BagIterator implements Iterator<T>{

		private Node<T> current = element;
		
		//�����ж���ʽ�����Ƿ�Ϊ�յ�������˽���ڲ����Աcurrent�Ƿ�Ϊ��,�������ⲿ�������Աelement.��Ϊһ�����������������Ԫ��,���Ԫ�ؾͲ��ٿ����ǿյ���.
		//���ڲ����Աcurrent��ÿһ�ε��������ж��ᱻ���¸�ֵ,�Ӷ�ʹ��hasNext�����ļ����Ч
		@Override
		public boolean hasNext() {
			return null != current;
		}

		@Override
		public T next() {
			T item = current.item;
			current = current.next;
			return item;
		}
		
	}

}
