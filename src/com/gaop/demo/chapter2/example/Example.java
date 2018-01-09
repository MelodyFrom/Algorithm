package com.gaop.demo.chapter2.example;

import java.util.Scanner;

/**
 * @description 	
 * 	排序算法类模板
 * @author gaop
 * @date 2017年8月27日 下午10:45:15
 */
public class Example {

	public static void sort(Comparable[] a) {
		
	}
	
	/**
	 * 元素大小比较方法
	 * @param v
	 * @param w
	 * @return
	 */
	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}
	
	/**
	 * 交换两个元素位置的方法
	 * @param a
	 * @param i
	 * @param j
	 */
	private static void exch(Comparable[] a, int i, int j) {
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	/**
	 * 打印操作
	 * @param a
	 */
	private static void show(Comparable[] a) {
		//打印操作
		for(Comparable unit : a) {
			System.out.println(unit.toString());
		}
	}
	
	/**
	 * 检测数组是否有效
	 * @param a
	 * @return
	 */
	public static boolean isSorted(Comparable[] a) {
		//检测数组是否有序
		for(int i = 1; i < a.length; i++) {
			if(less(a[i], a[i-1]))
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println("请输入待排序字符");
		Scanner scan = new Scanner(System.in);
		if(null != args && args.length > 0) {
			
		} else {
			args = new String[1];
			 args[0] = scan.nextLine();
		}
		String[] params = args[0].split(" ");
		sort(params);
		System.out.println(isSorted(params));
		show(params);
	}
}
