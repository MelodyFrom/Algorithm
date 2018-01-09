package com.gaop.demo.chapter1.stackTest;

import com.gaop.demo.chapter1.stack.ResizingArrayStack;

public class ResizingStackMain {

	public static void main(String[] args) {
		ResizingArrayStack<Integer> intStack = new ResizingArrayStack<>();
		intStack.push(1);
		intStack.push(2);
		intStack.push(3);
		intStack.push(4);
		for(Integer num: intStack) {
			System.out.println(num);
		}
		
		ResizingArrayStack<String> strStack = new ResizingArrayStack<>();
		strStack.push("No");
		ResizingArrayStack<String> strStackCopy = ResizingArrayStack.copy(strStack);
		strStack.push("Yes");
		System.out.println(strStack);
		System.out.println(strStackCopy);
	}
}
