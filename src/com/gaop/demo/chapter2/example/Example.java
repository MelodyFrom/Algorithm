package com.gaop.demo.chapter2.example;

import java.util.Scanner;

/**
 * @description 	
 * 	�����㷨��ģ��
 * @author gaop
 * @date 2017��8��27�� ����10:45:15
 */
public class Example {

	public static void sort(Comparable[] a) {
		
	}
	
	/**
	 * Ԫ�ش�С�ȽϷ���
	 * @param v
	 * @param w
	 * @return
	 */
	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}
	
	/**
	 * ��������Ԫ��λ�õķ���
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
	 * ��ӡ����
	 * @param a
	 */
	private static void show(Comparable[] a) {
		//��ӡ����
		for(Comparable unit : a) {
			System.out.println(unit.toString());
		}
	}
	
	/**
	 * ��������Ƿ���Ч
	 * @param a
	 * @return
	 */
	public static boolean isSorted(Comparable[] a) {
		//��������Ƿ�����
		for(int i = 1; i < a.length; i++) {
			if(less(a[i], a[i-1]))
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println("������������ַ�");
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
