package com.gaop.demo.chapter2.example.method;

import com.gaop.demo.StopWatch;

/**
 * @description 	
 * 	��ǰ���������������������ظ��������,����������ٶȱ�ѡ�������1.7��
 * @author gaop
 * @date 2017��9��29�� ����9:19:40
 */
public class CompareInsetionAndSelection {

	public static void main(String[] args) {
		Insertion<Integer> insert = new Insertion<>();
		Selection select = new Selection();
		Integer[] arg = getArray(10000);
		System.out.println(arg.length);
		StopWatch watch = new StopWatch();
		insert.sort(arg);
		double et = watch.elapsedTime();
		System.out.println(et);
		select.sort(arg);
		System.out.println(watch.elapsedTime() - et);
	}
	
	private static Integer[] getArray(int length) {
		Integer[] array = new Integer[length];
		for(int i = 0; i<length; i++)
		{
			array[i] = new Double(Math.random()*10000).intValue();
		}
		return array;
	}
}
