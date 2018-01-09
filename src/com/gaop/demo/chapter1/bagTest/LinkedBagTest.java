package com.gaop.demo.chapter1.bagTest;

import com.gaop.demo.chapter1.bag.Bag;
import com.gaop.demo.chapter1.bag.LinkedBag;

public class LinkedBagTest {

	public static void main(String[] args) {
		Bag<String> bag = new LinkedBag<>();
		System.out.println(bag.isEmpty());
		System.out.println(bag.size());
		bag.add("Newman");
		System.out.println(bag.size());
		bag.add("dango");
		System.out.println(bag.size());
		bag.add("delight");
		System.out.println(bag.size());
		bag.add("cool");
		System.out.println(bag.size());
		for(String element : bag) {
			System.out.println(element);
		}
	}
}
