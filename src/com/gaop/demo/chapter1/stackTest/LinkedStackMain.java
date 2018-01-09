package com.gaop.demo.chapter1.stackTest;

import com.gaop.demo.chapter1.stack.LinkedStack;

public class LinkedStackMain {

	public static void main(String[] args) {
		LinkedStack<String> linked = new LinkedStack<>();
		System.out.println(linked.isEmpty());
		linked.push("first");
		linked.push("second");
		linked.push("third");
		System.out.println(linked);
		System.out.println(linked.pop());
		System.out.println(linked.size());
		System.out.println(linked.pop());
		System.out.println(linked.size());
		System.out.println(linked);
		System.out.println(linked.isEmpty());
	}
}
