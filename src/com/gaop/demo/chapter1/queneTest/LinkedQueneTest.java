package com.gaop.demo.chapter1.queneTest;

import com.gaop.demo.chapter1.quene.LinkedQuene;

public class LinkedQueneTest {

	public static void main(String[] args) {
		LinkedQuene<String> quene = new LinkedQuene<>();
		System.out.println(quene.isEmpty() + "," + quene.size());
		quene.enquene("first");
		quene.enquene("second");
		quene.enquene("third");
		System.out.println(quene.isEmpty() + "," + quene.size());
		System.out.println(quene.dequene());
		System.out.println(quene.isEmpty() + "," + quene.size());
	}
}
