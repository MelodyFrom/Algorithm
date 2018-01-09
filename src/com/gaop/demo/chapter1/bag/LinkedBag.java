package com.gaop.demo.chapter1.bag;

import java.util.Iterator;

import com.gaop.demo.chapter1.linked.Node;

/**
 * @description 	
 * 	链式背包
 * @author gaop
 * @date 2017年7月29日 下午11:47:43
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
		
		//这里判断链式背包是否为空的条件是私有内部类成员current是否为空,而不是外部背包类成员element.因为一旦向这个背包加入了元素,这个元素就不再可能是空的了.
		//而内部类成员current在每一次迭代操作中都会被重新赋值,从而使得hasNext方法的检查有效
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
