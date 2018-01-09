package com.gaop.demo.chapter2.example.method;

import com.gaop.demo.chapter2.example.BaseModel;

/**
 * @description 	
 * 	�����������������,��һ���Ʋ��뵽�����Ѿ���������е��ʵ�λ��.�ڼ������ʵ����,Ϊ��Ҫ�������Ԫ���ڳ��ռ�,������Ҫ���������е�Ԫ���ڲ���֮ǰ�������ƶ�һλ.
 * �����㷨������������. <br>
 * 	��ѡ������һ��,��ǰ����������������,�����������յ�λ�ö�����ȷ��,Ϊ�˸���С��Ԫ���ڳ��ռ�,���ǿ��ܻᱻ�ƶ�.���ǵ������ﵽ������Ҷ�ʱ,��������������. <br>
 * 	�Բ������������ʮ����Ч,�ʺ�С��ģ������
 * @author gaop
 * @date 2017��9��28�� ����10:09:37
 * @param <T>
 */
public class Insertion<T> extends BaseModel<T>{

	@Override
	public void sort(Comparable<T>[] arg) {
		int length = arg.length;
		for(int i = 1;i < length; i++) {
			for(int j = i;j > 0 && super.less(arg[j], arg[j - 1]);j--) {
				super.exch(arg, j, j-1);
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
