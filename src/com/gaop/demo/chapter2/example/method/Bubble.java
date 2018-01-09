package com.gaop.demo.chapter2.example.method;

import com.gaop.demo.chapter2.example.BaseModel;

/**
 * @description 	
 * 	<b>ð������</b> <br>
 * 	����������ʽ,ÿһ��ѭ��ȷ��һ�����(��С)��Ԫ�ص�λ��;Ȼ������һ�ֵ�ѭ��ʱ�Ͳ��ڼ���Ѿ�ȷ����λ�õ�Ԫ��,ע��
 * ��ѡ��������бȶ�,��һ��Ƚ����Ƶ�����ʽ.�����Ե���������ѡ������Ľ���Ԫ�ؽ�����������ð������
 * @author gaop
 * @date 2017��11��12�� ����8:35:56
 */
public class Bubble extends BaseModel<Integer>{

	@Override
	public void sort(Comparable<Integer>[] arg) {
		int length = arg.length;
		for(int i = 0; i < length - 1; i++) {
			for(int j = i; j < length - 1 - i; j++) {
				if(super.less(arg[j], arg[j+1])) {
					super.exch(arg, j, j+1);
				}
			}
		}
	}

	public static void main(String[] args) {
		Integer[] a = new Integer[]{10, 15, 0, 4, 6, 12, 20, 1};
		Insertion<Integer> insertSort = new Insertion<>();
		insertSort.show(a);
		insertSort.sort(a);
		insertSort.show(a);
		
	}
	
}
