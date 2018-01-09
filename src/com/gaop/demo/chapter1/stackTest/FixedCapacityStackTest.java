package com.gaop.demo.chapter1.stackTest;

import com.gaop.demo.chapter1.stack.FixedCapacityStack;

public class FixedCapacityStackTest {

	public static void main(String[] args) {
		FixedCapacityStack<String> stringStack = new FixedCapacityStack<>(10);
		System.out.println(stringStack.isFull());
		stringStack.push("testGp");
		System.out.println(stringStack);
		stringStack.pop();
		System.out.println(stringStack);
		stringStack.push("testGp123");
		System.out.println(stringStack);
		System.out.println(stringStack.isFull());
		for(int i = 0; i < 9; i++) {
			stringStack.push("test");
		}
		System.out.println(stringStack.size());
		System.out.println(stringStack.isFull());
	}
}
