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
		
		//����Ĳ������
		Node<String> newNode = first;
		first = new Node<>();
		first.item = "zero";
		first.next = newNode;
		System.out.println(first);
		
		//�����ɾ������
		first.next = third;
		//�ͷŲ���ʹ�õĽڵ�
		second = null;
		System.out.println(first);
		
	}
}
