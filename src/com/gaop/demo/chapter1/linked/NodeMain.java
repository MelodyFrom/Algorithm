package com.gaop.demo.chapter1.linked;

public class NodeMain {

	public static void main(String[] args) {
		Node<String> first = new Node<>();
		Node<String> second = new Node<>();
		Node<String> third = new Node<>();
		
		first.item = "first";
		second.item = "second";
		third.item = "third";
		
		first.next = second;
		second.next = third;
		
		System.out.println(first);
		
		//链表的插入操作
		Node<String> newNode = first;
		first = new Node<>();
		first.item = "zero";
		first.next = newNode;
		System.out.println(first);
		
		//链表的删除操作
		first.next = third;
		//释放不再使用的节点
		second = null;
		System.out.println(first);
		
	}
}
