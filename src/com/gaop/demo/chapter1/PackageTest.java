package com.gaop.demo.chapter1;

import java.util.ArrayList;
import java.util.List;

public class PackageTest {

	public static void main(String[] args) {
		Integer A = new Integer(1);
		Integer B = new Integer(1);
		System.out.println(A == B);
		System.out.println(A.equals(B));
		
		List<Integer> ids = new ArrayList<>();
		ids.add(1);
		Integer[] idArg = (Integer[]) ids.toArray(new Integer[]{});
		System.out.println(idArg[0]);
	}
}
